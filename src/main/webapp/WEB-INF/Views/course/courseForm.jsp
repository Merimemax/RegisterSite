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

<form:form action="saveCourse" modelAttribute="Course" method="post">


<form:input path="id"/>
<form:input path="courseCode"/>
<form:input path="courseName"/>
<form:input path ="prerequiste"/> 
<form:input path="credit"/>

<input type="submit" value="save"/>

</form:form>



</div>



</body>

</html>