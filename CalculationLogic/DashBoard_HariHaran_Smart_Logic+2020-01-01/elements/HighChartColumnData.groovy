List<BigDecimal> resultPrice = []
List<Map> discount = []
List<String> categoryData = []

out.DatamartQueryData?.each { i ->
    resultPrice.add((i.resultPrice) as BigDecimal)
    discount.add([y: (i.discount * 15000) as BigDecimal])
    categoryData.add(i.productID as String)
}

Map result = [
        "resultPrice" : resultPrice,
        "discount"    : discount,
        "categoryData": categoryData,
]

return result