package projectmanager

class Task 
{
	// Model Attributes:
	String name
	String toString ()  { "${name}"  } // cleans display of model name in stead of its id
	String description
	Date dueDate
	 
   // Entity Relationships:
	static belongsTo = [assignee:EndUser,projectName:Project]


	// Constraints
	static constraints = {
		 name(blank:false, unique:true)
		 description()
		 dueDate(min: new Date())  // has to be future date
	}
    
}
