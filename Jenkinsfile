pipeline {
    agent any 
    tools {
        maven "MAVEN"
        jdk "JDK"
    }
  stages {
    stage('make'){
        steps{
          sh 'mvn -version'
          sh 'java -version'
        }
      }
  }   
    
}
