 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
   
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">    
 <link rel="stylesheet" type="text/css"href="<spring:url value="/css/adminCss/blocks.css" />"/>

<h1> Sections  </h1>
<a href="<spring:url value="/admin/section/add/${blockid}" />" class="btn btn-info ">
          <span class="glyphicon glyphicon-plus"></span> Add Section 
        </a>


 
 		<!-- Success - or Validation errors -->
    	<div id="result" style="display:none" >   	
    	    <p id="success" > 
    
    		</p> 
    		<p id="errors" > 
    
    		</p>
    	</div>
 
  <!--  	<div id="formInput" style="display:none" >  -->


	<!-- No action method handled by AJAX-->
	<%-- <form id="categoryForm" >

			<input type="hidden" name="id" value="0">
			
       
         <p>
            
            <label for="semid"> Semester : </label>
          <select id="semid" name="id">
       <c:forEach items="${semesters}" var="semester">
          <option value="${semester.id}">${semester.semesterName}</option>
          </c:forEach> 
       
          </select>
             <input type="button" value="Display Blocks" onclick="displayBlocks();return false;">
        </p>
 
            
    
    </form> --%>

<table id="tbl_products" class="table table-dark ">
    <thead >
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Block Name</th>
        <th scope="col">Start Date</th>
        <th scope="col">End Date</th>
       	<th scope="col">Sections</th>
       	<th scope="col">Edit</th>
      
    </tr>
    </thead>
    <tbody>
  <c:forEach items="${sections}" var="section">
   <tr >

        <td>${section.id}</td>

        <td>${section.sectionNo}</td>

        <td><c:out value="${section.course.courseName}"/></td>

        <td><c:out value="${section.proffessor.firstName}"/></td>
     
        <td> <a class="btn btn-primary" href="<spring:url value="/admin/section/${section.id}" />"  ><span style='color:white;font-size: 11px'><strong>Students</strong></span></a> </td>

		<td> <a class="glyphicon glyphicon-pencil wht" href="<spring:url value="/admin/section/edit/${blockid}?sectionid=${section.id}" />"  ></a> </td>
		<td> <a class="glyphicon glyphicon-trash wht" href="<spring:url value="/admin/section/delete/${blockid}?sectionid=${section.id}" />"  ></a> </td>
	
    </tr> 
</c:forEach>
    </tbody>
</table>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <spring:url value="/js/adminJs/blocks.js" var="blk" />
 <script src="${blk}"></script>



</div>