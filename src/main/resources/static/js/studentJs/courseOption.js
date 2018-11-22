function changeStatus(id) {
        alert("you are signed up " + id);

        $.post("/student/enroll?id="+id , function (result) {
            alert("Here your are!! " + result);
            $("#"+id).html('Save');

        });

}