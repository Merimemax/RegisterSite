 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

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
 
<table>
<tr style="width: 100%;">
    <th style="width: 19%;">Category</th>
    <th style="width: 21%;">Title</th>
    <th style="width: 21%;">ISBN</th>
    <th style="width: 21%;">Author</th>
    <th style="width: 23%;">Date</th>
    <th style="width: 15%;"></th>
</tr>
<c:forEach items="${books}" var="book">
    <tr>
        <td>${book.category.name}</td>
        <td>${book.title}</td>
         <td>${book.isbn.ISBNFormatted}</td>
        <td>${book.author}</td>
        <td><spring:eval expression="book.publishDate" /></td>
        
        <!-- Spring:url for handling Spring template/@PathVariable -->
        <spring:url value="/book_edit/{id}"  var="edit" >
   				<spring:param name="id" value="${book.id}" />
 		</spring:url>
         
        <td><a href="${edit}">Edit</a></td>
    </tr>
</c:forEach>
</table>
  	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
  	
  <spring:url value="/js/adminJs/blocks.js" var="blk" />
 <script src="${blk}"></script>



</div>