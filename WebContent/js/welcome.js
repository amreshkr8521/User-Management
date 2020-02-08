
function fun(){
		var chart = new CanvasJS.Chart("chartContainer", {
		animationEnabled: true,
		theme: "light2",
		title:{
		  text: "Male Age Line Chart"
		},
		axisY:{
		  includeZero: false
		},
		data: [{
		  type: "area",
		  dataPoints: [
		    { y: 21 },
		    { y: 23 },
		  ]
		}]
		});
		chart.render();
	}
	function fun1(){
		var chart = new CanvasJS.Chart("chartContainer", {
		animationEnabled: true,
		theme: "light2",
		title:{
		  text: "Female Age Line Chart"
		},
		axisY:{
		  includeZero: false
		},
		data: [{
		  type: "line",
		  dataPoints: [
		    { y: 20 },
		  ]
		}]
		});
		chart.render();
	}
	function fun2(){
		var chart = new CanvasJS.Chart("chartContainer", {
		animationEnabled: true,
		theme: "light2",
		title:{
		  text: "Age Line Chart"
		},
		axisY:{
		  includeZero: false
		},
		data: [{
		  type: "line",
		  dataPoints: [
		    { y: 20 },
		    { y: 21 },
		    { y: 23 },
		  ]
		}]
		});
		chart.render();
	}
