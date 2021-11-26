pipeline {
    agent any 
    tools {
        maven "MAVEN"
        jdk "JDK"
    }
   
  stages {
    stage('make'){
  
        steps{
            agent {  windows "sh 'mvn -version'" }
            agent {  windows   "sh 'java -version' " }
        } 
      }
  }   
}
