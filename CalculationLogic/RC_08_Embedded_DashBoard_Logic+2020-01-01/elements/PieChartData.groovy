List result = []

Map loadData = [:]

out.GetInputDataMatrix?.each { item ->
    loadData = [
            name : item.sku,
            y : item.resultPrice,
    ]
    result.add(loadData)
}

return result