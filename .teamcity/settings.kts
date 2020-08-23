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
            
        }
    }
  }
}
