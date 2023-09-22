ResultMatrix resultMatrix = api.newMatrix("sku", "resultPrice", "attribute2",
        "attribute3", "attribute4", "attribute5") as ResultMatrix

api.find("PLI", 0, 100, null,
        Filter.equal("pricelistId", 440),
        Filter.equal("sku", input.ParamValue)).each {
    resultMatrix.addRow(it)
}

return resultMatrix