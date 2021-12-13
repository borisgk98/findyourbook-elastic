const config = require('./config');

var elasticsearch = require('elasticsearch');
var client = new elasticsearch.Client({
    host: 'localhost:9200',
    log: 'trace',
    apiVersion: '7.2', // use the same version of your Elasticsearch instance
});

// await client.indices.create({
//     index: 'tweets',
//     body: {
//         mappings: {
//             properties: {
//                 id: { type: 'integer' },
//                 text: { type: 'text' },
//                 user: { type: 'keyword' },
//                 time: { type: 'date' }
//             }
//         }
//     }
// }, { ignore: [400] })

module.exports = {
    write: async function (collection_name, obj) {
        await client.index({
            index: collection_name,
            body: obj,
            id: obj.id
        })
    }
}