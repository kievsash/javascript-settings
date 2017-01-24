package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object JavaScript_Template : Template({
    uuid = "774601ef-30df-4bba-84fc-47350a9730a0"
    extId = "JavaScript_Template"
    name = "Template"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCardsGit)

    }

    steps {
        script {
            name = "Restore NPM Packages"
            id = "RUNNER_5"
            scriptContent = "npm install"
        }
        script {
            name = "Browser tests"
            id = "RUNNER_6"
            scriptContent = "npm test -- --single-run --browsers %Browser% --reporters teamcity"
        }
    }

    triggers {
        vcs {
            id = "vcsTrigger"
        }
    }
})
