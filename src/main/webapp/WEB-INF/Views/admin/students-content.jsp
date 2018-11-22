 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
   
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">    
 <link rel="stylesheet" type="text/css"href="<spring:url value="/css/adminCss/blocks.css" />"/>

<h1> Students</h1>


 
 		<!-- Success - or Validation errors -->
    	<div id="result" style="display:none" >   	
    	    <p id="success" > 
    
    		</p> 
    		<p id="errors" > 
    
    		</p>
    	</div>
 
  
<table id="tbl_products" class="table table-dark ">
    <thead >
    <h3>Capacity :${capacity}</h3>
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Registration Number</th>
        <th scope="col">Id Number</th>
        <th scope="col">Email</th>
       	
      
    </tr>
    </thead>
    <tbody>
  <c:forEach items="${students}" var="student">
   <tr >

        <td>${student.firstName}</td>

        <td>${student.registrationNumber}</td>

        <td><c:out value="${student.dateOfBirth}"/></td>

        <td><c:out value="${student.email}"/></td>
     
       

    </tr> 
</c:forEach>
    </tbody>
</table>
<br>
<br>



<h2>Wait-Listed Students</h2>
<hr>

 
 		<!-- Success - or Validation errors -->
    	<div id="result" style="display:none" >   	
    	    <p id="success" > 
    
    		</p> 
    		<p id="errors" > 
    
    		</p>
    	</div>
 
  
<table id="tbl_products" class="table table-dark ">
    <thead >
  
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Registration Number</th>
        <th scope="col">Id Number</th>
        <th scope="col">Email</th>
       	
      
    </tr>
    </thead>
    <tbody>
  <c:forEach items="${wstudents}" var="student">
   <tr >

        <td>${student.firstName}</td>

        <td>${student.registrationNumber}</td>

        <td><c:out value="${student.dateOfBirth}"/></td>

        <td><c:out value="${student.email}"/></td>
     
       

    </tr> 
</c:forEach>
    </tbody>
</table>

 <select name="algoNo" class="form-control">
	 
	 <option value="FIFO" label="FIFO"/>
	 <option value="LIFO" label="LIFO"/>
	 </select>
	 <br>
	 <a   href="<spring:url value="/admin/algorithm/${secid}" />" class="btn btn-info btn-lg" > RUN    </a>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <spring:url value="/js/adminJs/blocks.js" var="blk" />
 <script src="${blk}"></script>



</div>