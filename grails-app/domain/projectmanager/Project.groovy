package projectmanager

class Project 
{
	
	// Model Attributes:
	String name
	String toString ()  { "${name}"  }  // cleans display of model name in stead of its id
	Date dueDate
	String billType
	String description 
  
   // Entity Relationships:
	 static belongsTo = [owner:EndUser]
	 static hasMany = [tasks:Task]
	 
	 // Constraints
	 static constraints = {
		 
		 name blank:false,unique:true  // or alternatively:
		 //name(blank:false,unique:true)
		 dueDate(min: new Date())  // has to be future date
		 billType(inList:["hourly", "daily", "monthly"] )
		 description(nullable:true)
	 }
	 
    
}
