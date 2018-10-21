class BootStrap {

    def init = { servletContext ->
		
		       new projectmanager.EndUser(firstName: "Joe", lastName: "Doe", userName:"jdoe" , password: "password").save()  //server restart
		       new projectmanager.EndUser(firstName: "Anne", lastName: "Doe", userName:"adoe" , password: "password").save()  //server restart
                }
    def destroy = {
		             //server shutdown
                  }
}
