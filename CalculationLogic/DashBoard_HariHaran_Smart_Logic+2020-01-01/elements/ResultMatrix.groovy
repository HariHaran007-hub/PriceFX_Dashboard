import net.pricefx.formulaengine.scripting.portlets.ResultMatrix

ResultMatrix resultMatrix = api
        .newMatrix("productID", "resultPrice", "productGroup", "discount") as ResultMatrix

out.DatamartQueryData.each { row -> resultMatrix.addRow(row) }

return resultMatrix