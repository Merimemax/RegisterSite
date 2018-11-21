$(function() {

    $("#selectCourse").click(selectCourse);
    $("#preReq").click(showPreReq);
    $("#approvedWaivers").click(approvedWaivers);
    $("#enrolledCourse").click(enrolledCourse);
    $("#registrationNumber").click(registrationNumber);
    $("#availableCourses").click(availableCourses);

  let url = window.location.pathname.split("/")[1];


  function selectCourse() {
    alert("Are you ready to select course!! " + url );

    $.get(url + "/courses", function (courses) {

        alert("Here is your result!! ");
    });
  }

    function showPreReq() {
        alert("Are you ready to see pre Req!! " + url );

        $.get(url + "/courses", function (courses) {

            alert("Here is your result for Pre Req!! ");
        });
    }

    function approvedWaivers() {
        alert("Are you ready to see your approved waivers!! " + url );

        $.get(url + "/courses", function (courses) {

            alert("Here is your result!! ");
        });
    }


    function enrolledCourse() {
        alert("Are you ready to enrolled Course!! " + url );

        $.get(url + "/courses", function (courses) {

            alert("Here is your result!! ");
        });
    }


    function registrationNumber() {
        alert("Are you ready to see your registration Number!! " + url );

        $.get(url + "/courses", function (courses) {

            alert("Here is your result!! ");
        });
    }



    function availableCourses() {
        alert("Are you ready to select course!! " + url );

        $.get(url + "/courses", function (courses) {

            alert("Here is your result!! ");
        });
    }




});