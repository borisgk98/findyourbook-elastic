// const mongoClient = require("mongodb").MongoClient;
//
//
//
// mongoClient.connect("mongodb://192.168.2.166:27017/", { auth: { user: 'boris', password: 'passb' }}, function(err, client){
//
//     if(err){
//         return console.log(err);
//     }
//     // взаимодействие с базой данных
//     const db = client.db("usersdb");
//     const collection = db.collection("users");
//     let user = {name: "Tom", age: 23};
//     collection.dropAllIndexes(function (err, res) {
//         if (err) {
//             console.log('ERR!!');
//         }
//         console.log(res);
//     });
//
//     client.close();
// });

const book_handler = require("./book_handler")
book_handler({url: "https://knigopoisk.org/books/dzh_k_rouling_garri_potter_i_filosofskiy_kamen"})