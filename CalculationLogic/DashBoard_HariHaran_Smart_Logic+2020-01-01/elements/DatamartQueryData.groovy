import net.pricefx.formulaengine.DatamartContext
import net.pricefx.formulaengine.DatamartQueryResult
import net.pricefx.formulaengine.scripting.Matrix2D

DatamartContext dataMartContext = api.getDatamartContext()

DatamartContext.Table table = dataMartContext.getDatamart("RC_Smart_Products_DM")

//Rollup -> If aggregation is there then rollup to true
DatamartContext.Query query = dataMartContext
        .newQuery(table, false)
        .select("sku", "productID")
        .select("resultPrice", "resultPrice")
        .select("attribute2", "productGroup")
        .select("attribute4", "discount")

if (!out.ProductGroup?.equals("All")) {
    query.where(Filter.equal("attribute2", out?.ProductGroup))
}

DatamartQueryResult result = dataMartContext.executeQuery(query)

Matrix2D matrix2DData = result.getData()

return matrix2DData