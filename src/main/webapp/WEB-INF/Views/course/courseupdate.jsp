<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   <!DOCTYPE html>

<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<head>
<title>Course Registration Form </title>
</head>
<body>


<div>
<h3> update Course </h3>
<form:form action="saveCourse" modelAttribute="Course" method="post">
<table>
	<tbody>
		<tr>
	<td></td>
	<td></td>
	<td><div style="clear;both;"></div>
	<p>
	<a class="btn btn-default" href="${pageContext.request.contextPath}/courseList"/>backtoList</a>
	</p><td>
<tr>
	<tr>
		<td><form:input type ="hidden" path="id" value="${course.id}"/></td>
	</tr>
<tr>
<td> <label>Course Code:	</label></td>
<td><form:input path="courseCode" value="${course.courseCode}"/></td>
</tr>

<tr>
<td> <label>Course Name:	</label></td>
<td><form:input path="courseName" value="${course.courseName}"/></td>
</tr>

<tr>
<td> <label> Pre_Requiste Course:	</label></td>
<td>
<form:select  path="prerequiste.id">
<form:option selected="selected" value="0" label="--Select prerequisite"/>
<form:options selected="selected"  items="${courses}" itemLabel="courseName" itemValue="id"/>
</form:select>
<td>
</tr>

<tr>
<td> <label> Course Credit:	</label></td>
<td><form:input path="credit" value="${course.credit}"/></td>
</tr>

<tr>
<td><input type="submit" value="update"/></td>
</tr>


</tbody>
</table>
</form:form>
</div>



</body>

</html>