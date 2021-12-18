const config = require('./config');

var elasticsearch = require('elasticsearch');
var client = new elasticsearch.Client({
    host: 'api.findyourbook.borisgk.space:9200',
    log: 'trace',
    apiVersion: '7.2', // use the same version of your Elasticsearch instance,
    username: "elastic",
    password: "31cdf9df-8bdd-474b-8b3c-fe185bfd68fa"
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