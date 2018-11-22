 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
   
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">    
 <link rel="stylesheet" type="text/css"href="<spring:url value="/css/adminCss/blocks.css" />"/>

<h1> List Of Courses  </h1>
<br>
<br>
          
   <div><input type="button" value="AddCourse"	class="btn btn-info btn-lg btn-block" onclick="window.location.href='showFormForAdd';return false;"/></div> 
        
        
        
  
       
      
       <div>
       <br>
		<br>
		<form:form action="search" method="POST">
			Search Courses: <input type="text" name="theSearchName" />
				
				<input type="submit" value="Search" class="add-button" />
			
			</form:form>
			<br>
<br>
</div>

 
 <table class="table table-dark " class="border border-primary">

                       <tr>
						<td> ${editcourses.courseCode} </td>
						<td> ${editcourses.courseName} </td>
						<td> ${editcourses.credit} </td>
						
						</tr>

				<tr>
					<th >Course Code</th>
					<th>Course Name</th>
					<th>credit</th>
					<th>Edit</th>
					
				</tr>
				
				
				<c:forEach var="course" items="${courses}">
				<c:url var="updatelink" value="/showFormForUpdate">
				<c:param name="id" value="${course.id}"/>
				<c:param name="coursecode" value="${course.courseCode}"/>
				</c:url>
				
				<c:url var="deletelink" value="/delete">
				<c:param name="id" value="${course.id}"/>
				</c:url>
				
					<tr>
						<td> ${course.courseCode} </td>
						<td> ${course.courseName} </td>
						<td> ${course.credit} </td>
						<td><a class="glyphicon glyphicon-pencil wht" href="${updatelink}">  </a><td>
						<td><a class= "glyphicon glyphicon-trash wht" href="${deletelink}"></a></td>
						
					</tr>
				
				</c:forEach>
						
			</table>
 		


<table id="tbl_products" class="table table-dark ">
  
</table>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <spring:url value="/js/adminJs/blocks.js" var="blk" />
 <script src="${blk}"></script>



</div>