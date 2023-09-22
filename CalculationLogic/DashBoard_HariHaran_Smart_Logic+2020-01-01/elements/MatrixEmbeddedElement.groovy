import net.pricefx.server.dto.calculation.dashboard.DashboardApi

String event_name = api.dashboardWideEvent('tigerEvent')

DashboardApi dashboardApi = api.dashboard("RC_Product_EmbeddedDashBoard_08")
        .setParam("ParamValue", "RC-S918BZAC")
        .showEmbedded()
        .openInModalOrRecalculateOn(event_name)
        .withEventDataAttr(Library.PRODUCT_ID_PARAM).asParam("ParamValue")

return dashboardApi
/**
 * NOTE:
 * openInWindowOrRecalculateOn(api.dashboardWideEvent("event_name")),openInModalOrRecalculateOn(event_name)
 * -> open the embedded dashboard in popup window.
 * andRecalculateOn(api.dashboardWideEvent("event_name")) -> show the portlet of another dashboard in same dashboard
 * openInTabOrRecalculateOn(api.dashboardWideEvent("event_name")) -> The embeded dashboard will be open in new window when dashboard is clicked
 *  */