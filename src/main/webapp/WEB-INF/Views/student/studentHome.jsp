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
    <%--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"--%>
            <%--integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"--%>
            <%--crossorigin="anonymous"></script>--%>
    <%--<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"--%>
            <%--integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"--%>
            <%--crossorigin="anonymous"></script>--%>
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
    <button class="btn btn-info" id="selectCourse">Select Courses</button>
    <button class="btn btn-info" id="preReq">Courses needing prerequesits</button>
    <button class="btn btn-info" id="approvedWaivers">View Approved Waivers</button>
    <button class="btn btn-info" id="enrolledCourse">View Enrolled Courses</button>
    <button class="btn btn-info" id="registrationNumber">View Registration Number</button>
    <button class="btn btn-info" id="availableCourses">View Available Courses</button>
</div>
<table id="courseList" class="table table-bordered">
    <thead>
    <tr>
        <th scope="col">Section No</th>
        <th scope="col">Professor</th>
        <th scope="col">Course</th>
        <th scope="col">Course Code</th>
        <th scope="col">credit</th>
        <th scope="col">Enroll</th>

    </tr>
    </thead>
    <tbody>
    <tr>
        <td>Mark</td>
        <td>Otto</td>
        <td>@mdo</td>
        <td>Mark</td>
        <td>Otto</td>
        <td>@mdo</td>
    </tr>
    </tbody>
</table>
</body>
</html>
