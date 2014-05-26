package projectmanager

class EndUser 
{
	//Model Attributes
	String firstName
	String toString ()  { "${firstName}"  }  // cleans display of model name in stead of its id
	String lastName
	String userName
	String password
	
	// Entity Relationships:
	static hasMany = [projects:Project, tasks:Task]

	// Constraints
    static constraints = {
		firstName(blank:false)  
		lastName(blank:false)
		userName(blank:false, unique:true )        // must be unique and non-blank
		password(password:true,szie:3..10)   // masked password, 3-10 alphabetical characters	 
    }	
}
