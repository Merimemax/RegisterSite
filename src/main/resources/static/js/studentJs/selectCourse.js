$(function() {

    $("#selectCourse").click(selectCourse);
    $("#waivered").click(approvedWaivers);
    $("#enrolled").click(enrolledCourse);
    // $("#registrationNumber").click(registrationNumber);
    // $("#availableCourses").click(availableCourses);

  let url = window.location.pathname.split("/")[1];


  function selectCourse() {
    // alert("Are you ready to select course!! " + url );


    $("waivered").css({ display: "none" });
    $("enrolled").css({ display: "none" });
    //
    // $.get(url + "/courses", function (semester) {
    //     alert("Here is your result!! " + semester.semesterName);
    // },error(function () {
    //     alert("Error cant' find semester")
    // }));
  }



    function approvedWaivers() {
        $("waivered").css({ display: "block" });
        $("enrolled").css({ display: "none" });
        // alert("Are you ready to see your approved waivers!! " + url );
        //
        // $.get(url + "/courses", function (courses) {
        //
        //     alert("Here is your result!! ");
        // });
    }


    function enrolledCourse() {
        $("waivered").css({ display: "none" });
        $("enrolled").css({ display: "block" });
        // alert("Are you ready to enrolled Course!! " + url );
        //
        // $.get(url + "/courses", function (courses) {
        //
        //     alert("Here is your result!! ");
        // });
    }


    // function availableCourses() {
    //     alert("Are you ready to select course!! " + url );
    //
    //     $.get(url + "/courses", function (courses) {
    //
    //         alert("Here is your result!! ");
    //     });
    // }

});