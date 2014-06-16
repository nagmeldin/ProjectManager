class BootStrap {

    def init = { servletContext ->
		
		       new projectmanager.EndUser(firstName: "joe", lastName: "doe", userName:"jdoe" , password: "password").save()  //server restart
		       new projectmanager.EndUser(firstName: "anne", lastName: "doe", userName:"adoe" , password: "password").save()  //server restart
		
		    
                }
    def destroy = {
		             //server shutdown
                  }
}
