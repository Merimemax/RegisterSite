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
    <link rel="stylesheet" type="text/css" href="<spring:url value="/css/facultyCss/home.css" />"/>

    <script src="https://code.jquery.com/jquery-1.9.1.min.js"></script>
    <spring:url value="/js/facultyJs/facultyHome.js" var="faculty"/>
    <script src="${faculty}"></script>

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
                <td> <button class=" btn btn-info" onclick="showDetails('${stu.id}')">Details</button></td>
                    <td> <button class=" btn btn-info" onclick="showDetails('${stu.id}')" >Delete</button></td>
            </div>

    </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>