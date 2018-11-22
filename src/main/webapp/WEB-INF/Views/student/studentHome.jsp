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

    <a class="btn btn-info" id="selectCourse" href="/student/selectCourse?studid=${student.semesterList}">Select Courses</a>
    <a class="btn btn-info" id="approvedWaivers" >View Approved Waivers</a>
    <a class="btn btn-info" id="enrolledCourse" >View Enrolled Courses</a>
    <%--<a class="btn btn-info" id="enrolledCourse" href="/student/enrolledcourses?id='${student.id}'">View Enrolled Courses</a>--%>

</div>
<section id="enrolled" style="display: block">
    <h3>Enrolled Courses</h3>
    <table id="courseList" class="table table-bordered">
        <thead>
        <tr>
            <th scope="col">Course Id</th>
            <th scope="col">Course Code</th>
            <th scope="col">Course Name</th>
            <th scope="col">Course Credit</th>
        </tr>
        </thead>
        <tbody>
<c:forEach items="${course}" var="enrolled" >
        <tr>
            <td>${enrolled.id}</td>
            <td>${enrolled.courseCode}</td>
            <td>${enrolled.courseName}</td>
            <td>${enrolled.credit}</td>
        </tr>
</c:forEach>
        </tbody>
    </table>
</section>

<%--<section id="waivered" style="display: none">--%>
    <%--<h3>Waived Courses</h3>--%>
    <%--<c:forEach items="${student.waiveredCourse}" var="waived">--%>

    <%--</c:forEach>--%>
    <%--<table id="courseList" class="table table-bordered">--%>
        <%--<thead>--%>
        <%--<tr>--%>
            <%--<th scope="col">Course</th>--%>
            <%--<th scope="col">Course Code</th>--%>
            <%--<th scope="col">credit</th>--%>
        <%--</tr>--%>
        <%--</thead>--%>
        <%--<tbody>--%>
        <%--<tr>--%>
            <%--<td>${section.course.courseName}</td>--%>
            <%--<td>${section.course.courseCode}</td>--%>
            <%--<td>${section.course.credit}</td>--%>
        <%--</tr>--%>
        <%--</tbody>--%>
    <%--</table>--%>
<%--</section>--%>



</body>
</html>
