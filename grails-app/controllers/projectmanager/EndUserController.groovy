package projectmanager



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class EndUserController {

	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

 
	   def index(Integer max) {
		
		params.max = Math.min(max ?: 10, 100)
	
		respond EndUser.list(params), model:[endUserInstanceCount: EndUser.count()]
	   
		/*
		render view: "mylogin", model: [EndUser: EndUser.get(params.id) ]
		*/
	
		
		log.info('index() has been accessed')
	}
	
	//-------------- User Authentication-----------------------------
	/*
	def login = {}
				//////////
	  def authenticate = {
	  def user = EndUser.findByUserNameAndPassword(params.userName, params.password) // sql query
	  if(user){
				session.user = user     // user session creation
				flash.message = "Hello ${user.firstName}!"
			   redirect(action:"login")	
		   }else{
			flash.message = "Sorry, ${params.firstName}. Please try again."
			  redirect(action:"login")
				}
		 }
				//////////
	   def logout = {
			 flash.message = "Goodbye ${session.user.firstName}"
			  session.user = null
			   redirect(action:"login")
			   }
	*/
		


	def show(EndUser endUserInstance) {
		respond endUserInstance
	}
	
	   def mylogin( ) 
	     {	 
		   render view: "mylogin", model: [EndUser: EndUser.get(params.id) ]   
	     }

	def create() {
		respond new EndUser(params)
	}

	@Transactional
	def save(EndUser endUserInstance) {
		if (endUserInstance == null) {
			notFound()
			return
		}

		if (endUserInstance.hasErrors()) {
			respond endUserInstance.errors, view:'create'
			return
		}

		endUserInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.created.message', args: [message(code: 'endUser.label', default: 'EndUser'), endUserInstance.id])
				redirect endUserInstance
			}
			'*' { respond endUserInstance, [status: CREATED] }
		}
	}

	def edit(EndUser endUserInstance) {
		respond endUserInstance
	}

	@Transactional
	def update(EndUser endUserInstance) {
		if (endUserInstance == null) {
			notFound()
			return
		}

		if (endUserInstance.hasErrors()) {
			respond endUserInstance.errors, view:'edit'
			return
		}

		endUserInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [message(code: 'EndUser.label', default: 'EndUser'), endUserInstance.id])
				redirect endUserInstance
			}
			'*'{ respond endUserInstance, [status: OK] }
		}
	}

	@Transactional
	def delete(EndUser endUserInstance) {

		if (endUserInstance == null) {
			notFound()
			return
		}

		endUserInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [message(code: 'EndUser.label', default: 'EndUser'), endUserInstance.id])
				redirect action:"index", method:"GET"
			}
			'*'{ render status: NO_CONTENT }
		}
	}

	protected void notFound() {
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.not.found.message', args: [message(code: 'endUser.label', default: 'EndUser'), params.id])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}
}
