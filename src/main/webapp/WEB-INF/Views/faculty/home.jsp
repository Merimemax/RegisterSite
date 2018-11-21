<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/facultyCss/home.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>

<h2>List of students</h2>

<table class="table">
    <thead class="thead-light">
    <tr>
        <th scope="col">Id</th>
        <th scope="col">First Name</th>
        <th scope="col">Last Name</th>
        <th scope="col">Entry Date</th>
        <th scope="col">Registration Number</th>
        <th scope="col">Details</th>
        <th scope="col">Action</th>
    </tr>
    </thead>
    <tbody>

    <tr var="stu" items="${students}">

        <td>${stu.id}</td>

        <td>${stu.firstName}</td>

        <td><c:out value="${stu.lastName}"/></td>

        <td><c:out value="${stu.entryDate}"/></td>

        <td><c:out value="${stu.registrationNumber}"/></td>

        <td> <a class="btn btn-primary"><strong>Details</strong></a> </td>

        <td> <a class="btn btn-primary"><strong>Action</strong></a> </td>


    </tr>

    </tbody>
</table>
</body>
</html>