<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css"href="<spring:url value="/css/adminCss/blocks.css" />"/>
  
  <section class="panel panel-default">
  <div class="panel-heading"> 
<h3 class="panel-title">Course Registration Form</h3> 
</div> 


<div class="panel-body">
<div class="pull-right" style="padding-right:50px">
			<a href="?lang=US">English</a>|<a href="?lang=pt">Portuguese</a>
		</div>




<form:form action="saveCourse" modelAttribute="Course" method="post" class="form-horizontal">

<div style="text-align: center;">
	<form:errors path="*" cssClass="alert alert-danger" element="div"/>
	 <form:input type ="hidden" path="id"/>
		</div>
		
		<hr>
  <div class="form-group">
    <div class="col-sm-offset-10 col-sm-9">
		<a class="glyphicon glyphicon-step-backward" href="${pageContext.request.contextPath}/courseList"/>backtoList</a>

	</div>
	</div>
	
<div class="form-group">
<div class=" col-sm-9">
 <label for="id" class="control-label" ><spring:message code="lang.form.courseCode.label" /></label>
<form:input class="form-control" path="courseCode"/>
</div>
</div>


<div class="form-group">
<div class="col-sm-9">
 <label class="control-label"><spring:message code="lang.form.courseName.label" /></label>
<form:input  class="form-control" path="courseName"/>
</div>
</div>


<div class="form-group">
<div class="col-sm-9">
<label class="control-label"><spring:message code="lang.form.prerequiste.label" /></label>
<form:select class="form-control"  path="prerequiste.id">
<form:option value="0" label="--Select prerequisite"/>
<form:options items="${courses}" itemLabel="courseName" itemValue="id"/>
</form:select>
 </div>
 </div>


<div class="form-group">
<div class="col-sm-9">
 <label class="control-label"><spring:message code="lang.form.credit.label" /></label>
<form:input class="form-control" path="credit"/>

</div>
</div>



 <hr>
  <div class="form-group">
    <div class="col-sm-offset-3 col-sm-9">
<input type="submit" class="btn btn-primary" id="btnSubmit value="Save Course"/>
</div>
</div>







</form:form >
</div><!-- panel-body // -->
</section><!-- panel// -->

  

	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>