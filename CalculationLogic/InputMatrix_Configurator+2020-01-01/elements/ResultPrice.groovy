List skuList = []
List resultPriceList = []
//Got data from result price

api.find("PLI", 0, 100, null,
        Filter.equal("pricelistId", 440)).each {
    skuList.add(it.sku)
    resultPriceList.add(it.resultPrice)
}

Map<Object, Object> result =
        [
                sku        : skuList,
                resultPrice: resultPriceList,
        ]

return result