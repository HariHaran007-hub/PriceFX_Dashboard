import net.pricefx.server.dto.calculation.ContextParameter

ContextParameter builder =
        api.inputBuilderFactory()
                .createOptionEntry("productGroup")
                .setLabel("Product Group")
                .setOptions(["All", "Smart Phone", "Tablets"])
                .buildContextParameter()

return api.createConfiguratorEntry()
        .createParameter(builder) { "All" }