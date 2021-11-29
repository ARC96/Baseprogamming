pipeline {
  
  agent any 
  
  stages{
     
    stage("level1-checking version"){
    
      steps{
        bat 'mvn --version'
        bat 'java --version'
      } 
    } 
    
    
    stage("make comipling the java "){
    
      steps{
        dir('TypeOfClass/src/com/p1/'){
                bat 'javac -d . PojoClass.java'
              }  
      } 
    } 
    
    
    stage("run the java"){
    
      steps{
        dir('TypeOfClass/src/com/p1/'){
                bat 'java com.p1.PojoClass'
              }        
      } 
    } 
    
    
  }  
}
