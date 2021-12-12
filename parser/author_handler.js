const needle = require('needle');
const cheerio = require('cheerio');
const fs = require('fs');
const URL = require('url');
const config = require('./config');
const DAO = require('./DAO');
const stats = require('./stats');

// обработчик автора
module.exports = function(author) {
    try {
        needle.get(author.url, function(err, res) {
            try {
                console.log('author: ', author.url);
                if (err) {
                    // throw err;
                    // stats.authors.bad++;
                    return;
                }

                $ = cheerio.load(res.body);

                // годы жизни
                var years = $('div.page__subtitle').text().split(' - ');
                author.years = {
                    begin: years[0],
                    end: years[1]
                };

                author.biography = $('div.biography p').text();
                author.img = {url: URL.resolve(config.url_main, $('div.poster img').attr('src'))};

                DAO.write('authors', author);
            }
            catch (e) {
                return;
            }
        });

        // stats.authors.good++;
    }
    catch (e) {
        console.log('ERROR at ' + author.url);
        // throw  e;
        // stats.authors.bad++;
    }
}