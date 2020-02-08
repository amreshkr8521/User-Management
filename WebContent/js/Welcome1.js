
$(document).ready(function() {
  $("#age").click(function() {
    var data = "Location" + "location";
      $.ajax({
      url : "Age",
      data :data,
      type : 'get',
      success : function(data,status) {
        $('#ShowData').html(data);
      }
    });
  });
$("#location").click(function() {
  var data = "Location" + "location";
  $.ajax({
    url : "location",
    data :data,
    type : 'get',
    success : function(data,status) {
      $('#ShowData').html(data);
    }
  });
});
$("#male").click(function() {
  var data = "male" + "male";
  $.ajax({
    url : "male",
    data :data,
    type : 'get',
    success : function(data,status) {
      $('#ShowData').html(data);
    }
  });
});
$("#female").click(function() {
  var data = "female" + "female";
  $.ajax({
    url : "Female",
    data :data,
    type : 'get',
    success : function(data,status) {
      $('#ShowData').html(data);
    }
  });
});

$("#Registration").click(function() {
  var data = "Location" + "location";
  $.ajax({
    url : "Registration",
    data :data,
    type : 'get',
    success : function(data,status) {
      $('#ShowData').html(data);
    }
  });
});
$("#update").click(function() {
    var data = "Location" + "location";
      $.ajax({
      url : "Update",
      data :data,
      type : 'get',
      success : function(data,status) {
       alert(status);
      }
    });
  });
});
