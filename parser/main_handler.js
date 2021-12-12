const needle = require('needle');
const cheerio = require('cheerio');
const fs = require('fs');
const URL = require('url');
const config = require('./config');
const book_handler = require('./book_handler');
const stats = require('./stats');

// обработчик страницы со всеми книгами
module.exports = function main_handler(number_of_page) {
    // fs.writeFile('./number.txt', number_of_page);
    var url = config.url_temp + number_of_page;
    needle.get(url, function(err, res) {
        console.log('\n' + '#'.repeat(10) + '\n' + number_of_page + '\n' + '#'.repeat(10) + '\n');
        if (err) {
            // throw err;
            main_handler(number_of_page);
            return;
        }

        $ = cheerio.load(res.body);
        //обработка выхода
        if (number_of_page != 1 &&
            res.body.indexOf('<h1>Все книги - страница ' + number_of_page + '</h1>') == -1) {
            return;
        }

        // обработка книг
        // for (i = 0; i < book_hrefs.length; i++) {
        //     console.log(book_hrefs[String(i)].attribs.href);
        // }
        $(".list-book__link").each(function (i, el) {
            book = {};
            book.name = $(this).text();
            book.url = '';
            try {
                book.url = URL.resolve(config.url_main, $(this).attr('href'));
            }
            catch (e) {
                return;
            }
            try {
                book.authors = [];
                author_a = $(this).parent().next().find('a.list-author').each(function (i, el) {
                    author = {};
                    author.name = $(this).text();
                    author.url = URL.resolve(config.url_main, $(this).attr('href'));
                    book.authors.push(author);
                });
                book_handler(book);
            }
            catch (e) {
                stats.bads.push(book.url);
                return;
            }
        });

        // запуск следующие итерации
        main_handler(++number_of_page);
    });
}