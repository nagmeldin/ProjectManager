<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'endUser.label', default: 'EndUser')}" />
		<title><g:message code="ProjectManagement Login" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#create-endUser" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="logout"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="create-endUser" class="content scaffold-create" role="main">
			<h1><g:message code="default.create.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${endUserInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${endUserInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			
			
			
		<div class="fieldcontain ${hasErrors(bean: endUserInstance, field: 'userName', 'error')} required">
	<label for="userName">
		<g:message code="endUser.userName.label" default="User Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="userName" required="" value="${endUserInstance?.userName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: endUserInstance, field: 'password', 'error')} required">
	<label for="password">
		<g:message code="endUser.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="password" name="password" pattern="${endUserInstance.constraints.password.matches}" required="" value="${endUserInstance?.password}"/>

     </div>	
					
			<g:form url="[resource:endUserInstance, action:'save']" >
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<fieldset class="buttons">
					<g:submitButton name="login" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
				</fieldset>
			</g:form>
		</div>
		
		
	</body>
</html>
