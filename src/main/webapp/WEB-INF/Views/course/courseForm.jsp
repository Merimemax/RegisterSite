<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <!DOCTYPE html>

<html>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<head>
<title>Course Registration Form </title>
</head>
<body>
<div class="pull-right" style="padding-right:50px">
			<a href="?lang=US">English</a>|<a href="?lang=pt">Portuguese</a>
		</div>

<div>
<h3>Save Course </h3>

<form:form action="saveCourse" modelAttribute="Course" method="post">
<table>
	<tbody>
	<tr>
	<form:errors path="*" cssClass="alert alert-danger" element="div"/>
	 <td><form:input type ="hidden" path="id"/></td>
		
	</tr>
	
	<tr>
	<td></td>
	<td></td>
	<td><div style="clear;both;"></div>
	<p>
	<a class="btn btn-default" href="${pageContext.request.contextPath}/courseList"/>backtoList</a>
	</p><td>
<tr>
<td> <label for="id"><spring:message code="lang.form.courseCode.label" /></label></td>
<td><form:input path="courseCode"/></td>
</tr>

<tr>
<td> <spring:message code="lang.form.courseName.label" /></td>
<td><form:input path="courseName"/></td>
</tr>

<tr>

<td> <spring:message code="lang.form.prerequiste.label" /></td>
<td>
<form:select  path="prerequiste.id">
<form:option value="0" label="--Select prerequisite"/>
<form:options items="${courses}" itemLabel="courseName" itemValue="id"/>
</form:select>
 </td>
 
</tr>

<tr>
<td> <spring:message code="lang.form.credit.label" /></td>
<td><form:input path="credit"/></td>
</tr>

<tr>
<td><label class="control-label" for="uploadfile">Upload File:</label><td>

	<form method="POST" enctype="multipart/form-data" id="fileUploadForm">
					<div class="form-group">
						<br>
						<input type="file" class="form-control" id="uploadfile" placeholder="Upload File"  name="uploadfile"></input>
					</div>
					
					<a href="/files" class="btn btn-default" role="button">Files</a>
				</form>
					</div>

</tr>

<tr>
<td><input type="submit" class="btn btn-default" id="btnSubmit value="save"/></td>
</tr>





</tbody>
</table>
</form:form>
</div>



</body>

</html>