<%--
  Created by IntelliJ IDEA.
  User: merih
  Date: 11/19/18
  Time: 11:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="true" %>
<html>
<head>
    <title>StudentHome</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="<spring:url value="/css/studentCss/studentHome.css" />"/>
    <script src="https://code.jquery.com/jquery-1.9.1.min.js"></script>
    <spring:url value="/js/studentJs/selectCourse.js" var="selectCourse"/>
    <script src="${selectCourse}"></script>

</head>
<body>

<nav class="navbar navbar-light bg-light">
    <a class="navbar-brand" href="#">
        <img src="https://cdn4.iconfinder.com/data/icons/basic-17/80/22_BO_open_book-512.png" width="30" height="30"
             class="d-inline-block align-top" alt="">
        MUM Compro
    </a>

    <span class="navbar-text">
     Welcome ${student.firstName}
    </span>
    <form class="form-inline my-2 my-lg-0">
        <a class="btn btn-outline-success my-2 my-sm-0" href="<c:url value='/login'/>">Log Out</a>
    </form>
</nav>

<div class="btn-group-vertical" id="side">
    <a class="btn btn-info" id="selectCourse" href="/student/selectCourse">Select Courses</a>
    <a class="btn btn-info" id="preReq" href="/student/selectCourse">Courses needing prerequesits</a>
    <a class="btn btn-info" id="approvedWaivers" href="/student/approvedWaivers">View Approved Waivers</a>
    <a class="btn btn-info" id="enrolledCourse" href="/student/enrolledcourses?id='${student.id}'">View Enrolled Courses</a>
    <a class="btn btn-info" id="registrationNumber" href="/student/selectCourse">View Registration Number</a>

</div>

<section id="waivered">

</section>

<section id="enrolled">

</section>

<section id="registrationNum">

</section>

</body>
</html>
