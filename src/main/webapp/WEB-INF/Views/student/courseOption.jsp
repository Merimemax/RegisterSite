<%--
  Created by IntelliJ IDEA.
  User: merih
  Date: 11/21/18
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
    <title>StudentHome</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="<spring:url value="/css/studentCss/studentHome.css" />"/>
    <script src="https://code.jquery.com/jquery-1.9.1.min.js"></script>
    <spring:url value="/js/studentJs/courseOption.js" var="options"/>
    <script src="${options}"></script>
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
        <h3>Course Option</h3>
        <a class="btn btn-outline-success my-2 my-sm-0" href="<c:url value='/login'/>">Log Out</a>
    </form>
</nav>

<c:forEach var="sem" items="${semester}">
    <h3>Semester ${sem.semesterName}</h3>
    <c:forEach var="blocK" items="${sem.blockList}">
        <hr>
        <br>
        <h3>Block ${blocK.blockName}</h3>

        <c:forEach var="section" items="${blocK.sections}">


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
                    <td>${section.id}</td>
                    <td>${section.proffessor.firstName}</td>
                    <td>${section.course.courseName}</td>
                    <td>${section.course.courseCode}</td>
                    <td>${section.course.credit}</td>

                    <%--<%! String daynamicId = "'${section.id}' + '${student.id}'"; %>--%>
                    <td><button class="btn btn-info" onclick="changeStatus('${section.id}' + '-' + '${student.id}')">Sign Up</button></td>


                </tr>
                </tbody>
            </table>

        </c:forEach>
    </c:forEach>
    <hr>
    <br><br>
</c:forEach>


</body>
</html>
