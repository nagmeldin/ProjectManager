import projectmanager.EndUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_projectManager_endUser_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/endUser/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: endUserInstance, field: 'firstName', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("endUser.firstName.label"),'default':("First Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("firstName"),'required':(""),'value':(endUserInstance?.firstName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: endUserInstance, field: 'lastName', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("endUser.lastName.label"),'default':("Last Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("lastName"),'required':(""),'value':(endUserInstance?.lastName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: endUserInstance, field: 'userName', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("endUser.userName.label"),'default':("User Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("userName"),'required':(""),'value':(endUserInstance?.userName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: endUserInstance, field: 'password', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("endUser.password.label"),'default':("Password")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['type':("password"),'name':("password"),'required':(""),'value':(endUserInstance?.password)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: endUserInstance, field: 'projects', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("endUser.projects.label"),'default':("Projects")],-1)
printHtmlPart(8)
for( p in (endUserInstance?.projects) ) {
printHtmlPart(9)
createTagBody(2, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',49,['controller':("project"),'action':("show"),'id':(p.id)],2)
printHtmlPart(10)
}
printHtmlPart(11)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'project.label', default: 'Project')]))
})
invokeTag('link','g',52,['controller':("project"),'action':("create"),'params':(['endUser.id': endUserInstance?.id])],1)
printHtmlPart(12)
expressionOut.print(hasErrors(bean: endUserInstance, field: 'tasks', 'error'))
printHtmlPart(13)
invokeTag('message','g',61,['code':("endUser.tasks.label"),'default':("Tasks")],-1)
printHtmlPart(8)
for( t in (endUserInstance?.tasks) ) {
printHtmlPart(9)
createTagBody(2, {->
expressionOut.print(t?.encodeAsHTML())
})
invokeTag('link','g',67,['controller':("task"),'action':("show"),'id':(t.id)],2)
printHtmlPart(10)
}
printHtmlPart(11)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'task.label', default: 'Task')]))
})
invokeTag('link','g',70,['controller':("task"),'action':("create"),'params':(['endUser.id': endUserInstance?.id])],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1401141697000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
