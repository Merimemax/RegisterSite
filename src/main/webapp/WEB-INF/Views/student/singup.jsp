<%--
  Created by IntelliJ IDEA.
  User: merih
  Date: 11/19/18
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>sign up</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css"href="<spring:url value="/css/studentCss/singup.css" />"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">MUM Student Regitration</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="/signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
            <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        </ul>
    </div>
</nav>

<form:form modelAttribute="student" action="singup" method="post">
    <h3>Sign UP!</h3>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="inputEmail4">First Name</label>
            <form:input  path="firstName" type="text" class="form-control" id="inputEmail4" placeholder="First Name" />
        </div>
        <div class="form-group col-md-6">
            <label for="inputPassword4">Last Name</label>
            <form:input  path="lastName" type="text" class="form-control" id="inputPassword4" placeholder="Last Name" />
        </div>
    </div>

    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="inputEmail4">Email</label>
            <form:input  path="email" type="text" class="form-control" id="inputEmail4" placeholder="Email" />
        </div>
        <div class="form-group col-md-6">
            <label for="inputPassword4">Password</label>
            <input type="password"  name="password" class="form-control" id="inputPassword4" placeholder="Password">
        </div>
    </div>

    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="inputEmail4">Date of Birth</label>
            <form:input  path="dateOfBirth" type="text" class="form-control" id="inputEmail4" placeholder="Date Of Birth" />
        </div>
        <div class="form-group col-md-6">
            <label for="inputPassword4">Entry Date</label>
            <form:input  path="entryDate" type="text" class="form-control" id="inputPassword4" placeholder="Entry Date" />
        </div>
    </div>
    <button type="submit" class="btn btn-secondary">Sign in</button>
</form:form>
</body>
</html>
