 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
   
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">    
 <link rel="stylesheet" type="text/css"href="<spring:url value="/css/adminCss/blocks.css" />"/>

<h1>Semester Blocks</h1>


 
 		<!-- Success - or Validation errors -->
    	<div id="result" style="display:none" >   	
    	    <p id="success" > 
    
    		</p> 
    		<p id="errors" > 
    
    		</p>
    	</div>
 
  <!--  	<div id="formInput" style="display:none" >  -->


	<!-- No action method handled by AJAX-->
	<form id="categoryForm" >

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
 
            
    
    </form>

<table id="tbl_products" class="table table-dark ">
    <thead >
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Block Name</th>
        <th scope="col">Start Date</th>
        <th scope="col">End Date</th>
       	<th scope="col">Sections</th>
      
    </tr>
    </thead>
    <tbody>

    <%-- <tr var="stu" items="${students}">

        <td>${stu.id}</td>

        <td>${stu.firstName}</td>

        <td><c:out value="${stu.lastName}"/></td>

        <td><c:out value="${stu.entryDate}"/></td>

        <td><c:out value="${stu.registrationNumber}"/></td>

        <td> <a class="btn btn-primary"><strong>Details</strong></a> </td>

        <td> <a class="btn btn-primary"><strong>Action</strong></a> </td>


    </tr> --%>

    </tbody>
</table>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <spring:url value="/js/adminJs/blocks.js" var="blk" />
 <script src="${blk}"></script>



</div>