pipeline {
    agent {
        label params.AGENT == "any" ? "" : params.AGENT 
    }

    parameters {
        choice(name: "AGENT", choices: ["any", "docker", "windows", "linux"]) 
    }
  
    tools {
        maven 'MAVEN'
        jdk 'JDK'
    }

    stages {
        stage("Build") {
            steps {
                echo "Hello, World!"
                sh 'mvn --version'
                sh 'java -version'
            }
        }
    }
}
