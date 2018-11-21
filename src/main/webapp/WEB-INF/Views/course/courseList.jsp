<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Courses </title>
</head>
<body>

<div id=container>


<h2>List of Courses</h2>

<input type="button" value="AddCourse" onclick="window.location.href='showFormForAdd';return false;"/>

<table>
				<tr>
					<th>Course Code</th>
					<th>Course Name</th>
					<th>credit</th>
					<th>Edit</th>
					
					
				</tr>
				
				<c:forEach var="course" items="${courses}">
				<c:url var="updatelink" value="/showFormForUpdate">
				<c:param name="id" value="${course.id}"/>
				</c:url>
				
				<c:url var="deletelink" value="/delete">
				<c:param name="id" value="${course.id}"/>
				</c:url>
				
					<tr>
						<td> ${course.courseCode} </td>
						<td> ${course.courseName} </td>
						<td> ${course.credit} </td>
						<td><a href="${updatelink}"> Edit </a><td>
						<td><a href="${deletelink}">Delete</a></td>
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>


</div>

</body>
</html>