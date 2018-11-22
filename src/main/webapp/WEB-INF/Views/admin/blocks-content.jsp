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
            
            <label for="semid">  </label>
            <div class="form-group col-md-6">
          <select id="semid" name="id" class="form-control">
       <c:forEach items="${semesters}" var="semester">
          <option value="${semester.id}">${semester.semesterName}</option>
          </c:forEach> 
       
          </select>
        </div>
              <i class="glyphicon glyphicon-hand-left lg"></i>  <input type="button" value="Display Blocks" class="btn btn-info btn-lg" onclick="displayBlocks();return false;">
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



    </tbody>
</table>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <spring:url value="/js/adminJs/blocks.js" var="blk" />
 <script src="${blk}"></script>



</div>