import projectmanager.Project
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_projectManager_projectshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/project/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'project.label', default: 'Project'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (projectInstance?.name)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("project.name.label"),'default':("Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(projectInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (projectInstance?.description)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("project.description.label"),'default':("Description")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(projectInstance),'field':("description")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (projectInstance?.dueDate)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("project.dueDate.label"),'default':("Due Date")],-1)
printHtmlPart(21)
invokeTag('formatDate','g',48,['date':(projectInstance?.dueDate)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (projectInstance?.billType)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("project.billType.label"),'default':("Bill Type")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(projectInstance),'field':("billType")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (projectInstance?.owner)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("project.owner.label"),'default':("Owner")],-1)
printHtmlPart(25)
createTagBody(3, {->
expressionOut.print(projectInstance?.owner?.encodeAsHTML())
})
invokeTag('link','g',66,['controller':("endUser"),'action':("show"),'id':(projectInstance?.owner?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (projectInstance?.tasks)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("project.tasks.label"),'default':("Tasks")],-1)
printHtmlPart(27)
for( t in (projectInstance.tasks) ) {
printHtmlPart(28)
createTagBody(4, {->
expressionOut.print(t?.encodeAsHTML())
})
invokeTag('link','g',76,['controller':("task"),'action':("show"),'id':(t.id)],4)
printHtmlPart(29)
}
printHtmlPart(30)
}
printHtmlPart(31)
createTagBody(2, {->
printHtmlPart(32)
createTagBody(3, {->
invokeTag('message','g',85,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',85,['class':("edit"),'action':("edit"),'resource':(projectInstance)],3)
printHtmlPart(33)
invokeTag('actionSubmit','g',86,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(34)
})
invokeTag('form','g',88,['url':([resource:projectInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(35)
})
invokeTag('captureBody','sitemesh',90,[:],1)
printHtmlPart(36)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1401141659000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
