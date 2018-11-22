<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: melathadgu
  Date: 11/21/18
  Time: 6:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="<spring:url value="/css/facultyCss/detail.css" />"/>
</head>
<body>
<h1> welcome to ${student.firstName} 's page</h1><hr>
<h2> About Student ${student.firstName} </h2>

<p> FirstName: ${student.firstName}</p>
<p> LastName: ${student.lastName}</p>
<p> EntryDate:${student.entryDate}</p>
<p> RegistrationNumber: ${student.registrationNumber}</p><hr>
<h2> Enrolled Course:</h2>


        <p>course-id :cs123</p>
        <p>Course-Name:WAA</p>
        <p>Course-Credit:4</p>
<h1> ADD your comments here for  ${student.firstName} </h1>
<form action="">
    <textarea id="commentarea" rows="6" cols="180">

    </textarea><br> <br>
    <input id ="su" type="submit">
</form>
</body>
</html>
