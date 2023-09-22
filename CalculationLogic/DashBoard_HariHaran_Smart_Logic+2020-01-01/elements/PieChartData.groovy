List result = []

Map loadData = [:]

out.DatamartQueryData?.each { it ->
    loadData = [
            name: it?.productID,
            y   : it?.resultPrice,
    ]
    result.add(loadData)
}

return result