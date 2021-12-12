const needle = require('needle');
const cheerio = require('cheerio');
const fs = require('fs');
const URL = require('url');
const config = require('./config');
const author_handler = require('./author_handler');
const DAO = require('./DAO');
const stats = require('./stats');

// обработчик конкретной книги
module.exports = function book_page_handler(book) {
    try {
        needle.get(book.url, function (err, res) {
            try {
                console.log('book: ', book.url);
                if (err) {
                    // throw err;
                    // stats.books.bad++;
                    return;
                }

                $ = cheerio.load(res.body);

                // название и автор уже содержаться в info

                // год
                book.year = $('div.page__subtitle').text().split(' ')[0];
                if (/\d+/.test(book.year) == null) {
                    book.year = null;
                }

                // информация
                $('table.short-info tbody tr').each(function (i, el) {
                    var info_array = [];
                    $(this).find('td span a').map(function (j, el) {
                        info_array.push($(this).text());
                    });

                    var type = $(this).find('th').text();
                    /*
                    Жанры           - genres
                    Теги            - tags
                    Характеристики  - characteristics
                    Главные герои   - protagonists
                    Места событий   - place_of_events
                    Время событий   - time_of_events
                     */
                    switch (type) {
                        case 'Жанры:':
                            book.genres = info_array;
                            break;
                        case 'Теги:':
                            book.tags = info_array;
                            break;
                        case 'Характеристики:':
                            book.characteristics = info_array;
                            break;
                        case 'Главные герои:':
                            book.protagonists = info_array;
                            break;
                        case 'Места событий:':
                            book.place_of_events = info_array;
                            break;
                        case 'Время событий:':
                            book.time_of_events = info_array;
                            break;
                    }
                });

                // описание
                book.description = $('#description-block p').text();

                // изображение-обложка
                book.poster = {}
                book.poster.url = URL.resolve(config.url_main, $('div.poster img.poster__img').attr('src'));

                // console.log(book);
                DAO.write('books', book);

                //обработка авторов
                book.authors.forEach(function (el) {
                    author_handler(el);
                });
            }
            catch (e) {
                return;
            }
        });

        // stats.books.good++;
    }
    catch (e) {
        console.log('ERROR at ' + book.url);
        // throw e;
        // stats.books.bad++;
    }
}