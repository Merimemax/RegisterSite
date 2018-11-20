<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   <!DOCTYPE html>

<html>
<head>
<title>Course Registration Form </title>
</head>
<body>
<div>
<h3>Save Course </h3>
<form:form action="saveCourse" modelAttribute="Course" method="post">
<table>
	<tbody>
	<tr>
		<td><form:input type ="hidden" path="id"/></td>
	</tr>
<tr>
<td> <label>Course Code:	</label></td>
<td><form:input path="courseCode"/></td>
</tr>

<tr>
<td> <label>Course Name:	</label></td>
<td><form:input path="courseName"/></td>
</tr>

<tr>
<td> <label> Pre_Requiste Course:	</label></td>
<td><form:input path ="prerequiste"/> </td>
</tr>

<tr>
<td> <label> Course Credit:	</label></td>
<td><form:input path="credit"/></td>
</tr>

<tr>
<td><input type="submit" value="save"/></td>
</tr>


</tbody>
</table>
</form:form>
</div>



</body>

</html>