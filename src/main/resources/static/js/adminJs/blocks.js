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
 			$.each(data, function(k, v) {
 			    console.log("hi"+ v.blockName);
 			});
//			$('#errors').html("");
// 			$("#result").append( '<H3 align="center"> OKAY!! <H3>');                
//	 	    $('#result').show();
		},
 
		error: function(errorObject ){	

			if (errorObject.responseJSON.errorType == "ValidationError") {
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
			}
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


