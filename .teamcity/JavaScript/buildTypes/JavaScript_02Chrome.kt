package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_02Chrome : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "24235ac3-6872-4de8-91d1-aadb7bf8fff7"
    extId = "JavaScript_02Chrome"
    name = "02.Chrome"

    params {
        param("Browser", "Chrome")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
