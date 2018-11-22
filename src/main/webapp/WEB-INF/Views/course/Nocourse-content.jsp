<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css"href="<spring:url value="/css/adminCss/blocks.css" />"/>
  
  <section class="panel panel-default">
  <div class="panel-heading"> 
<h3 class="panel-title">Hello Happy Thanks Giving ! you entered a wrong data please enter again  ! </h3> 
</div> 


<div class="panel-body">




<div class="panel-title" >
  <strong class="panel-title">Hello Happy Thanks Giving ! you entered a wrong data please enter again  !</strong>${msg}<a href="${pageContext.request.contextPath}/courseList" class="alert-link">Back to Course List </a>.
</div>


</div><!-- panel-body // -->
</section><!-- panel// -->

  

	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>