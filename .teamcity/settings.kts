package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object Build : BuildType({
    name = "Build" 
    vcs {
        root(HttpsGithubComEngfelipeoliveiraZerobugTeamcityCurlGitRefsHeadsMaster)
    }
    steps {
        maven {
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
        }
        script {
            scriptContent = """curl -k -u RTOfHaDYLUum7q8jUfDL1598117275:831ef1fc793bade6f7bcfe7d089587b7 --request POST -H "Content-Type:application/json" -d "{\"pit\":\"126\",\"targetid\":\"7wMJ*NG@5sY5PIfKMCTC1598120610\",\"ci\":\"Azure DevOps\",\"tipo\":\"4\"}" https://zerobug.co/ScanTarget/"""
        }
    }

    triggers {
        vcs {
        }
    }
})
