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

<strong>Hi !</strong> ${userMessage}<a href="${pageContext.request.contextPath}/courseList" class="alert-link">Back to Course List </a>.

<h2>List of Courses</h2>

<input type="button" value="AddCourse" onclick="window.location.href='showFormForAdd';return false;"/>
<br>
<br>
<form:form action="search" method="POST">
			Search Courses: <input type="text" name="theSearchName" />
				
				<input type="submit" value="Search" class="add-button" />
			
			</form:form>
<br>
<br>
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
				<c:param name="coursecode" value="${course.courseCode}"/>
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