	// pathname is contextRoot/path/path/ so we want to get [1] 
    // that is where contextRoot is
	// [0] has "" as a result of split 
	var contextRoot = "/" + window.location.pathname.split( '/' )[1];
	 var e = document.getElementById("semid");
	 
function displayBlocks(){
	var strUser = e.options[e.selectedIndex].value;

   	 $.ajax({
		type: 'GET',
		url: contextRoot + '/getBlocks/'+strUser,
//		url: '/Book5Rest/addCategory',
		dataType: "json",           // Accept header
 		success: function(data){
 		   $('#tbl_products>tbody').html("");
 			$.each(data, function(k, result) {
 		 			  /* var $tr = $('<tr/>');
 			    $tr.append($('<td/>').html(result.id));
 			    $tr.append($('<td/>').html(result.blockName));
 			   
 			    $('.list-order tr:last').before($tr);*/
 			    
 			 var td0=$('<td>').text(result.id);
 		        
 		         var td1 = $('<td>').text(result.blockName);
 		        var td2 = $('<td>').text("01-01-2018");
 		       var td3 = $('<td>').text("01-01-2018");
 		       var url="/admin/section?blockid="+result.id;
 		      var td4 = $('<td>').html("<a class='btn btn-primary' href='"+url+"'><span style='color:white;font-size: 11px'><strong>Sections</strong></span></a>");
 		        
 		         var tr = $('<tr>').append(td0).append(td1).append(td2).append(td3).append(td4);
 		         $('#tbl_products>tbody').append(tr);
 			    
 			});

		},
 
		error: function(errorObject ){	
			console.log(errorObject);

		/*	if (errorObject.responseJSON.errorType == "ValidationError") {
	 			$('#success').html("");
	 			$('#errors').html("");
	 			$("#errors").append( '<H3 align="center"> Error(s)!! <H3>');                
	  			    $("#result").append( '<p>');
	  	
	  			    var errorList = errorObject.responseJSON.errors;
	 	 	        $.each(errorList,  function(i,error) {			   
	 		    		$("#errors").append( error.message + '<br>');
			    	});
	 	 	        $("#errors").append( '</p>');
	 	 	        $('#result').show();
			}
			else {
				alert(errorObject.responseJSON.errors(0));   // "non" Validation Error
			}*/
 		}
	});
}

 
resetForm = function(id) {
    var element = document.getElementById(id);
    $(element)[0].reset();

    }	  
	


make_hidden = function(id) {
    var e = document.getElementById(id);
        e.style.display = 'none';
        }	   

make_visible = function(id) {
    var e = document.getElementById(id);
    e.style.display = 'block';
 }	   


