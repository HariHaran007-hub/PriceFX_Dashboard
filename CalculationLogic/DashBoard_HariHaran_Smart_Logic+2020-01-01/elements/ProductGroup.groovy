api.inlineConfigurator("config", "RC_DashBoard_InputConfigurator")

return input["config"]?.getAt("productGroup") as String ?: "All"