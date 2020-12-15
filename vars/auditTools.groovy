def call() {
    node {
      sh '''
        git --version
        docker --version
        node --version
        npm --version
        newman --version
        dotnet --list-sdks
        dotnet --list-runtimes
      '''
    }
}
