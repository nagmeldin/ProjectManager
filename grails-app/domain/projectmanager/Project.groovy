package projectmanager

class Project 
{
	
// Model Attributes:
	String name
	String toString ()  { "${name}"  }  // cleans display of model name in stead of its id
	String description
	Date dueDate
	String billType
	 
  
   // Entity Relationships:
	 static belongsTo = [owner:EndUser]
	 static hasMany = [tasks:Task]
	
	 static constraints = {
		 
		 name blank:false,unique:true  // or alternatively:
		 //name(blank:false,unique:true)
		 description blank:true
		 dueDate(min: new Date())  // has to be future date
		 billType(inList:["hourly", "daily", "monthly"] )
	 }
    
}
