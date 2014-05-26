<%@ page import="projectmanager.Task" %>



<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="task.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${taskInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="task.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="description" required="" value="${taskInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'dueDate', 'error')} required">
	<label for="dueDate">
		<g:message code="task.dueDate.label" default="Due Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dueDate" precision="day"  value="${taskInstance?.dueDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'assignee', 'error')} required">
	<label for="assignee">
		<g:message code="task.assignee.label" default="Assignee" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="assignee" name="assignee.id" from="${projectmanager.EndUser.list()}" optionKey="id" required="" value="${taskInstance?.assignee?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'projectName', 'error')} required">
	<label for="projectName">
		<g:message code="task.projectName.label" default="Project Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="projectName" name="projectName.id" from="${projectmanager.Project.list()}" optionKey="id" required="" value="${taskInstance?.projectName?.id}" class="many-to-one"/>

</div>

