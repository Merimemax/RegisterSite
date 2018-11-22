<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css"href="<spring:url value="/css/adminCss/blocks.css" />"/>
  <section class="panel panel-default">
<div class="panel-heading"> 
<h3 class="panel-title">Section Form</h3> 
</div> 
<div class="panel-body">
  
<form:form  modelAttribute="newSection" method="POST" action="/admin/section/add/${blockid}" class="form-horizontal" role="form" >
<div style="text-align: center;">
		<form:errors style="color:red;font-size:12px" path="*" class="err"/>
	</div>
	<div class="form-group">
    <label for="tech" class="col-sm-3 control-label">Section Name :</label>
    <div class="col-sm-3">
   <form:select path="sectionNo" class="form-control">
	 <form:option value="" label="----Select----"/>
	 <form:option value="M-115" label="M-115"/>
	 <form:option value="M-218" label="M-218"/>
	  <form:option value="V-32" label="V-32"/>
	  <form:option value="V-48" label="V-48"/>
	   <form:option value="V-47" label="V-47"/>
   </form:select>
   <div style="text-align: center;">
		<form:errors path="sectionNo" style="color:red;font-size:12px"  class="err" />
	</div>
    </div>
  </div> <!-- form-group // -->

   <div class="form-group">
    <label for="name" class="col-sm-3 control-label">Capacity :</label>
    <div class="col-sm-9">
      <form:input class="form-control" path="capacity" id="name"  />
    </div>
    <div class="err"  style="text-align: center;">
		<form:errors path="capacity" style="color:red;font-size:12px"/>
	</div>
  </div> <!-- form-group // -->
  
  <div class="form-group">
    <label for="tech" class="col-sm-3 control-label">Lesson :</label>
    <div class="col-sm-3">
   <form:select path="course.id" class="form-control">
  	 <form:options items="${courses}" itemValue="id" itemLabel="courseName"/>
	</form:select>
    <div style="text-align: center;">
		<form:errors path="course.id" class="err" />
	</div>
    </div>
  </div> <!-- form-group // -->
  
  <div class="form-group">
    <label for="tech" class="col-sm-3 control-label">Professor :</label>
    <div class="col-sm-3">
   <form:select path="proffessor.id" class="form-control">
	 <form:options items="${professors}" itemValue="id" itemLabel="firstName"/>
	</form:select>
   <div style="text-align: center;">
		<form:errors path="proffessor.id" class="err" />
	</div>
    </div>
  </div> <!-- form-group // -->
  
 
  
  <hr>
  <div class="form-group">
    <div class="col-sm-offset-3 col-sm-9">
     <!--  <input type="submit" class="btn btn-primary">Save Section</button> -->
      <input id="submit" class="btn btn-primary" type="submit" value="Save Section">
    </div>
  </div> <!-- form-group // -->
</form:form>
  
</div><!-- panel-body // -->
</section><!-- panel// -->

  

	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>