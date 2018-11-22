
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
   <!DOCTYPE html>

<html>
<body>
<head>
<title>NoCourseFound</title>


</head>
<div class="alert alert-danger" >

<div >
  <strong>Hi !</strong> ${msg}<a href="${pageContext.request.contextPath}/courseList" class="alert-link">Back to Course List </a>.
</div>

</div>

</body>
</html>