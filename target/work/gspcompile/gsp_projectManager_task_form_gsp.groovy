import projectmanager.Task
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_projectManager_task_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/task/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: taskInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("task.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'required':(""),'value':(taskInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: taskInstance, field: 'description', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("task.description.label"),'default':("Description")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("description"),'required':(""),'value':(taskInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: taskInstance, field: 'dueDate', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("task.dueDate.label"),'default':("Due Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',28,['name':("dueDate"),'precision':("day"),'value':(taskInstance?.dueDate)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: taskInstance, field: 'assignee', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("task.assignee.label"),'default':("Assignee")],-1)
printHtmlPart(2)
invokeTag('select','g',37,['id':("assignee"),'name':("assignee.id"),'from':(projectmanager.EndUser.list()),'optionKey':("id"),'required':(""),'value':(taskInstance?.assignee?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: taskInstance, field: 'projectName', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("task.projectName.label"),'default':("Project Name")],-1)
printHtmlPart(2)
invokeTag('select','g',46,['id':("projectName"),'name':("projectName.id"),'from':(projectmanager.Project.list()),'optionKey':("id"),'required':(""),'value':(taskInstance?.projectName?.id),'class':("many-to-one")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1401141677000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
