<%--
  Created by IntelliJ IDEA.
  User: merih
  Date: 11/19/18
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/facultyCss/home.css">
<<<<<<< HEAD


    <script src="https://code.jquery.com/jquery-1.9.1.min.js"></script>
    <spring:url value="/js/facultyJs/facultyHome.js" var="faculty"/>
    <script src="${facultyHome}"></script>
=======
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
>>>>>>> 8d592616d9d8dfdc36830c657985ca8ea3ad03cc
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


        <c:forEach items="${students}" var="stu">
        <tr>
            <td><c:out value="${stu.id}"/></td>
            <td><c:out value="${stu.firstName}"/></td>
            <td><c:out value="${stu.lastName}"/></td>
            <td><c:out value="${stu.entryDate}"/></td>
            <td><c:out value="${stu.registrationNumber}"/></td>

            <div class="btn-group-vertical" id="side">
                <td> <button class="btn btn-info" id="seeDetail">Details</button></td>
                    <td> <button class="btn btn-info" id="del">Delete</button></td>
            </div>

    </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>