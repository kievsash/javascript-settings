package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_3DeployToStaging : BuildType({
    uuid = "5f98b463-5edc-49cb-9d9b-63d20b6683d0"
    extId = "JavaScript_3DeployToStaging"
    name = "3. Deploy to staging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCardsGit)

    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_02Chrome) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_Firefox) {
            snapshot {
            }
        }
    }
})
