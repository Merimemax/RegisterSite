<%--
  Created by IntelliJ IDEA.
  User: merih
  Date: 11/19/18
  Time: 11:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="true" %>
<html>
<head>
    <title>StudentHome</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>

</head>
<body>
<nav class="navbar navbar-light bg-light">
    <a class="navbar-brand" href="#">
        <img src="https://cdn4.iconfinder.com/data/icons/basic-17/80/22_BO_open_book-512.png" width="30" height="30" class="d-inline-block align-top" alt="">
        MUM Compro
    </a>

    <span class="navbar-text">
     Welcome ${student.firstName}
    </span>
    <form class="form-inline my-2 my-lg-0">
        <a  class="btn btn-outline-success my-2 my-sm-0" href="<c:url value="/logout"/>" >
            Log Out
        </a>
    </form>
</nav>


<div class="btn-group-vertical">
    <button id="preReq">Courses needing prerequesits</button>
    <button id="approvedWaivers">View Approved Waivers</button>
    <button id="enrolledCourse">View Enrolled Courses</button>
    <button id="registrationNumber">View Registration Number</button>
    <button id="availablecourses">View Available Courses</button>
</div>

</body>
</html>
