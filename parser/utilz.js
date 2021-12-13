module.exports = {
    get_id: function (url) {
        return url.substring(url.lastIndexOf('/') + 1)
    }
}