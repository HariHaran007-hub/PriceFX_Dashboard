import net.pricefx.server.dto.calculation.ContextParameter

ContextParameter builder =
        api.inputBuilderFactory()
                .createOptionEntry("productSubGroup")
                .setLabel("Product Sub Group")
                .setOptions(["Galaxy A", "Galxay B", "Galaxy C"])
                .buildContextParameter()

return api.createConfiguratorEntry()
        .createParameter(builder) { "Galaxy A" }