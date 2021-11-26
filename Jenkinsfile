pipeline {
    agent none 
    tools {
        maven "MAVEN"
        jdk "JDK"
    }
   
  stages {
    stage('make'){
    agent { window
        steps{
          sh 'mvn -version'
          sh 'java -version'
        } }
      }
  }   
}
