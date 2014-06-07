import projectmanager.Project
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_projectManager_project_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/project/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: projectInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("project.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'required':(""),'value':(projectInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: projectInstance, field: 'description', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("project.description.label"),'default':("Description")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("description"),'required':(""),'value':(projectInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: projectInstance, field: 'dueDate', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("project.dueDate.label"),'default':("Due Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',28,['name':("dueDate"),'precision':("day"),'value':(projectInstance?.dueDate)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: projectInstance, field: 'billType', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("project.billType.label"),'default':("Bill Type")],-1)
printHtmlPart(2)
invokeTag('select','g',37,['name':("billType"),'from':(projectInstance.constraints.billType.inList),'required':(""),'value':(projectInstance?.billType),'valueMessagePrefix':("project.billType")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: projectInstance, field: 'owner', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("project.owner.label"),'default':("Owner")],-1)
printHtmlPart(2)
invokeTag('select','g',46,['id':("owner"),'name':("owner.id"),'from':(projectmanager.EndUser.list()),'optionKey':("id"),'required':(""),'value':(projectInstance?.owner?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: projectInstance, field: 'tasks', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("project.tasks.label"),'default':("Tasks")],-1)
printHtmlPart(9)
for( t in (projectInstance?.tasks) ) {
printHtmlPart(10)
createTagBody(2, {->
expressionOut.print(t?.encodeAsHTML())
})
invokeTag('link','g',58,['controller':("task"),'action':("show"),'id':(t.id)],2)
printHtmlPart(11)
}
printHtmlPart(12)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'task.label', default: 'Task')]))
})
invokeTag('link','g',61,['controller':("task"),'action':("create"),'params':(['project.id': projectInstance?.id])],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1401141658000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
