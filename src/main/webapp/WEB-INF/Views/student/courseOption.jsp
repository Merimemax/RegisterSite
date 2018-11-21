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
</head>
<body>
<h1>Course Option</h1>

<c:forEach var="sem" items="${semester}">
<h3>${sem.semesterName}</h3>
  <c:forEach var="blocK" items="${sem.blockList}" >
      <h3>${blocK.blockName}</h3>

      <c:forEach var="section" items="${blocK.sections}" >



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



      </c:forEach>
  </c:forEach>

</c:forEach>


</body>
</html>
