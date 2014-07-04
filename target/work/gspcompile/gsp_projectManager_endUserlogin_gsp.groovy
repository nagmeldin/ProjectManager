import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_projectManager_endUserlogin_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/endUser/login.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("entityName"),'value':(message(code: 'endUser.label', default: 'EndUser'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',6,['code':("ProjectManagement Login"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',9,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',12,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',13,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',13,['class':("list"),'action':("logout")],2)
printHtmlPart(7)
invokeTag('message','g',17,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
createTagBody(3, {->
printHtmlPart(13)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(14)
expressionOut.print(error.field)
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('message','g',24,['error':(error)],-1)
printHtmlPart(17)
})
invokeTag('eachError','g',25,['bean':(endUserInstance),'var':("error")],3)
printHtmlPart(18)
})
invokeTag('hasErrors','g',27,['bean':(endUserInstance)],2)
printHtmlPart(19)
expressionOut.print(hasErrors(bean: endUserInstance, field: 'userName', 'error'))
printHtmlPart(20)
invokeTag('message','g',33,['code':("endUser.userName.label"),'default':("User Name")],-1)
printHtmlPart(21)
invokeTag('textField','g',36,['name':("userName"),'required':(""),'value':(endUserInstance?.userName)],-1)
printHtmlPart(22)
expressionOut.print(hasErrors(bean: endUserInstance, field: 'password', 'error'))
printHtmlPart(23)
invokeTag('message','g',42,['code':("endUser.password.label"),'default':("Password")],-1)
printHtmlPart(21)
invokeTag('field','g',45,['type':("password"),'name':("password"),'pattern':(endUserInstance.constraints.password.matches),'required':(""),'value':(endUserInstance?.password)],-1)
printHtmlPart(24)
createTagBody(2, {->
printHtmlPart(25)
invokeTag('render','g',51,['template':("form")],-1)
printHtmlPart(26)
invokeTag('submitButton','g',54,['name':("login"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(27)
})
invokeTag('form','g',56,['url':([resource:endUserInstance, action:'save'])],2)
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',60,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402542275000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
