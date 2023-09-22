ResultMatrix resultMatrix = out.DatamartQueryData.toResultMatrix() as ResultMatrix

/**
 * (<column>, <attribute>) -> Based on column attribute the data can be get from input."param"
 * or api.input("param")
 * Attaching event listener to every list-item
 **/

resultMatrix.onRowSelection()
        .triggerEvent(api.dashboardWideEvent(Library.TIGER_EVENT))
        .withColValueAsEventDataAttr('productID', Library.PRODUCT_ID_PARAM)

return resultMatrix