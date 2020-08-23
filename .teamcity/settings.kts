import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

version = "2020.1"

project {
  buildType {
    id("zerobugcurl")
    name = "zerobug curl"
    steps {
        script {
            name = "curl"
            scriptContent = """curl -k -u RTOfHaDYLUum7q8jUfDL1598117275:831ef1fc793bade6f7bcfe7d089587b7 --request POST -H "Content-Type:application/json" -d "{\"pit\":\"126\",\"targetid\":\"7wMJ*NG@5sY5PIfKMCTC1598120610\",\"ci\":\"Azure DevOps\",\"tipo\":\"4\"}" https://zerobug.co/ScanTarget/"""
        }
    }
  }
}
