package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_Firefox : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "ce249655-de64-4127-8743-201a309ead73"
    extId = "JavaScript_Firefox"
    name = "02. Firefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
