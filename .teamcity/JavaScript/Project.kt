package JavaScript

import JavaScript.buildTypes.*
import JavaScript.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "0f7c9d2e-e8ca-437e-9c9d-8e93a94b785b"
    extId = "JavaScript"
    parentId = "_Root"
    name = "JavaScript"

    vcsRoot(JavaScript_HttpsGithubComG0t4teamcityCourseCardsGit)

    buildType(JavaScript_3DeployToStaging)
    buildType(JavaScript_Firefox)
    buildType(JavaScript_02Chrome)
    buildType(JavaScript_01FastTests)

    template(JavaScript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "HttpsGithubComKievsashJavascriptSettingsGit"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
