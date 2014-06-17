package projectmanager

class ProjController {
	
    static defaultAction = 'edit'

	def index()
	{
		// render 'Message from Proj Controller '
	}
	
	def main()
	{
		// render 'Message from Proj Controller '
	}
	
	def edit( )
	{
		def projFlag_1= "Activate Project Controller"    // local values
		def projFlag_2= "Deactivate Project Controller"  // local values
		
		 [key_1:projFlag_1,key_2:projFlag_2]
	  
	}
	
	
	def list( )
	{
		def allproj= Proj.list()  // This includes Names and categories
	 
		
		 [allproj:allproj]
	  
	}
}


