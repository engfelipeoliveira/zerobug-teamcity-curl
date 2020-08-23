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
            scriptContent = "curl -k -u $ZEROBUGUID:$ZEROBUGTOKEN --request POST -H 'Content-Type:application/json' -d '"{\"pit\":\"126\",\"targetid\":\"7wMJ*NG@5sY5PIfKMCTC1598120610\",\"ci\":\"Bamboo\",\"tipo\":\"5\"}"' https://zerobug.co/ScanTarget/"
        }
    }
  }
}
