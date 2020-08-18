package ZerobugTeamcityCurl.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object ZerobugTeamcityCurl_Build : BuildType({
    uuid = "db305f81-b418-4d97-bc50-ac7ccc9e2222"
    name = "Build"

   

    steps {
        
        script {
            name = "curl"
            scriptContent = """curl -d "token=5db63b48744bb86a21154f28cfd4c446&id_target=129&id=11001118" -X POST https://zerobug.co/build.php"""
        }
    }

    triggers {
        vcs {
        }
    }
})
