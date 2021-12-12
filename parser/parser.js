const needle = require('needle');
const cheerio = require('cheerio');
const fs = require('fs');
const URL = require('url');
const config = require('./config');
const main_handler = require('./main_handler');
const stats = require('./stats');

try {
    num = fs.readFileSync('number.txt');
}
catch (e) {
    ;
}

main_handler(num);