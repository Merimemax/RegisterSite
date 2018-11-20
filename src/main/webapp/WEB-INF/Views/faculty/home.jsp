<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: merih
  Date: 11/19/18
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/css/facultyCss/home.css">
</head>

<body>
<p>WelCome To Faculty Page </p>
<h2>List of students</h2>

<table>
    <tr>
        <th>Id</th>
        <th>firstName</th>
        <th>lastName</th>
        <th> RegistrationNumber</th>
        <th>EntryDate</th>
        <th><a href="url">SeeDetails </a></th>

        <th><a href="url">Delete </a></th>

    </tr>

    <c:forEach var="stu" items="${}">
        <c:out value="${stu.id}" />

    <c:out value="${stu.firstName}" />

    <c:out value="${stu.lastName}" />

    <c:out value="${stu.registrationNumber}" />

        <c:out value="${stu.entryDate}" />

    </c:forEach>
</table>
</body>
</html>