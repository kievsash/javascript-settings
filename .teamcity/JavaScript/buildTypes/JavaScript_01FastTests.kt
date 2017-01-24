package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_01FastTests : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "9f7b9566-26b7-4944-b1ff-b13a2528653a"
    extId = "JavaScript_01FastTests"
    name = "01.Fast Tests"

    params {
        param("Browser", "PhantomJS")
    }
})
