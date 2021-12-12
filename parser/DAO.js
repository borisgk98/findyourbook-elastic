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
        const index = collection_name;

        const dataset = [obj]
        const body = dataset.flatMap(doc => [{index: {_index: index}}, doc])

        const bulkResponse = await client.bulk({refresh: true, body})

        if (bulkResponse.errors) {
            const erroredDocuments = []
            // The items array has the same order of the dataset we just indexed.
            // The presence of the `error` key indicates that the operation
            // that we did for the document has failed.
            bulkResponse.items.forEach((action, i) => {
                const operation = Object.keys(action)[0]
                if (action[operation].error) {
                    erroredDocuments.push({
                        // If the status is 429 it means that you can retry the document,
                        // otherwise it's very likely a mapping error, and you should
                        // fix the document before to try it again.
                        status: action[operation].status,
                        error: action[operation].error,
                        operation: body[i * 2],
                        document: body[i * 2 + 1]
                    })
                }
            })
            console.log(erroredDocuments)
        }
    }
}