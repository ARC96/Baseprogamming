pipeline {
    agent any 
    tools {
        maven "MAVEN"
        jdk "JDK"
    }
    
    agent {  
        windows {
  stages {
    stage('make'){
        steps{
          sh 'mvn -version'
          sh 'java -version'
        }
      }
  }   }
    }   
}
