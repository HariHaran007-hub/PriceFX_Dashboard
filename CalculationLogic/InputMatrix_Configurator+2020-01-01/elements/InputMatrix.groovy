import net.pricefx.server.dto.calculation.ConfiguratorEntry
import net.pricefx.server.dto.calculation.ContextParameter

ContextParameter parameter = api.inputBuilderFactory()
        .createInputMatrix("inputMatrix")
        .setLabel("Input Matrix Simulation")
        .setColumns(["sku", "resultPrice"])
        .setColumnValueOptions(out.ResultPrice as Map<Object, Object>)
        .setCanModifyRows(true)
        .buildContextParameter()

/** * Basically input matrix accepts array of objects */

List defaultValue = [[sku: "RC-A546ELGD", resultPrice: 86239.02000]]

ConfiguratorEntry configuratorEntry = api.createConfiguratorEntry()
        .createParameter(parameter) { defaultValue }

return configuratorEntry