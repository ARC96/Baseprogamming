CODE_CHANGES = getGItChanges()
pipeline {
  
  agent any 
  
  stages{
     
    stage("level-1"){
      when{
        expression{
            BRANCH_NAME == 'dev'  && CODE_CHANGES == true 
        }
        
        
      }
      steps{
        echo  'level -1 check'
      } 
    } 
  }  
}
