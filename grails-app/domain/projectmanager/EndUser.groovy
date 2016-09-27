package projectmanager

class EndUser 
{
	//Model Attributes
	
	String firstName
	String toString ()  { "${firstName}"  }  // cleans display of model name in stead of its id
	String lastName
	String userName
	String password
	//String useremail
	// String emailAddress
	// String maritalStatus
	// Integer age
	// Float salary
	// Long phone
	
	
	// Entity Relationships:
	static hasMany = [projects:Project, tasks:Task]
	
    static constraints = {
		firstName blank:false                                   // first name cannot be blank
		lastName blank:false                                    // last name cannot be blank
		userName blank:false, unique:true                      //  user name must be unique and non-blank
		//useremail email:true
		// maritalStatus nullable:true  // can be kept null in database
		//age maxsize:100
		 // phone
		password(password:true,szie:3..15, validator:{val,obj->            
			                                              if (val?.equalsIgnoreCase(obj.firstName))
		                                                       { return false} 
		                                              } 
	                                                         )      // masked password, 3-10 alphabetical characters & password can't be first name 
		}  
    	
}