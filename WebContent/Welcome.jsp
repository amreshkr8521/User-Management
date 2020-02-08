<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Welcome</title>
<link rel="icon" href="img/mdb-favicon.ico" type="image/x-icon">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.11.2/css/all.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/mdb.min.css">
<link rel="stylesheet" href="css/Welcome.css">
<script src="js/welcome.js"></script>


</head>

<body>
	<%
		response.setHeader("Pragma", "no-cache");
		if (session.getAttribute("user") == null)
			response.sendRedirect("LoginPage.jsp");
	%>
	<header>
		<nav class="navbar navbar-expand-lg navbar-dark special-color-dark">
			<a class="navbar-brand text-uppercase" href="#">Welcome</a>

			<div class="collapse navbar-collapse" id="navbarSupportedContent2">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item dropdown mega-dropdown active"><a
						class="nav-link dropdown-toggle text-uppercase"
						id="navbarDropdownMenuLink2" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false">Details <span
							class="sr-only">(current)</span>
					</a>
						<div
							class="dropdown-menu mega-menu v-2 z-depth-1 special-color py-5 px-3"
							aria-labelledby="navbarDropdownMenuLink2">
							<div class="row">
								<div class="col-md-6 col-xl-3 sub-menu mb-xl-0 mb-4">
									<h6
										class="sub-title text-uppercase font-weight-bold white-text">Data</h6>
									<ul class="list-unstyled">
										<li class="sub-title text-uppercase"><a
											class="menu-item pl-1 mt-2" href="#"> <label for=""
												id="male">Male</label>
										</a></li>
										<li class="sub-title text-uppercase"><a
											class="menu-item pl-1 mt-2" href="#"> <label for=""
												id="female">Female</label>
										</a></li>
										<li class="sub-title text-uppercase"><a
											class="menu-item pl-1 mt-2" href="#"> <label for=""
												id="location">location</label>
										</a></li>
										<li class="sub-title text-uppercase"><a
											class="menu-item pl-1 mt-2" href="#"> <label for=""
												id="age">Age</label>
										</a></li>
										<li class="sub-title text-uppercase"><a
											class="menu-item pl-1 mt-2" href="#"> <label for=""
												id="Registration"> Registration History</label>
										</a></li>
									</ul>
								</div>
							</div>
						</div></li>
				</ul>
			</div>
			<div class="collapse navbar-collapse" id="navbarSupportedContent2">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item dropdown mega-dropdown active"><a
						class="nav-link dropdown-toggle text-uppercase"
						id="navbarDropdownMenuLink2" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false">Graph <span
							class="sr-only">(current)</span>
					</a>
						<div
							class="dropdown-menu mega-menu v-2 z-depth-1 special-color py-5 px-3"
							aria-labelledby="navbarDropdownMenuLink2">
							<div class="row">
								<div class="col-md-6 col-xl-3 sub-menu mb-xl-0 mb-4">
									<h6
										class="sub-title text-uppercase font-weight-bold white-text">graph</h6>
									<ul class="list-unstyled">
										<li class="sub-title text-uppercase"><a
											class="menu-item pl-1 mt-2" href="#"> <label for=""
												id="male" onclick="fun()">Male</label>
										</a></li>
										<li class="sub-title text-uppercase"><a
											class="menu-item pl-1 mt-2" href="#"> <label for=""
												id="female" onclick="fun1()">Female</label>
										</a></li>
										<li class="sub-title text-uppercase"><a
											class="menu-item pl-1 mt-2" href="#"> <label for=""
												id="age" onclick="fun2()">Age</label>
										</a></li>
									</ul>
								</div>
							</div>
						</div></li>
				</ul>
			</div>
			<div>

				<ul class="navbar-nav mr-auto">
					<li class="nav-item dropdown mega-dropdown active"><a
						class="nav-link dropdown-toggle text-uppercase"
						id="navbarDropdownMenuLink2" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false">Setting <span
							class="sr-only">(current)</span>
					</a>
						<div
							class="dropdown-menu mega-menu v-2 z-depth-1 special-color py-5 px-3"
							aria-labelledby="navbarDropdownMenuLink2">
							<div class="row">
								<div class="col-md-6 col-xl-3 sub-menu mb-xl-0 mb-4">
									<h6
										class="sub-title text-uppercase font-weight-bold white-text">Setting</h6>
									<ul class="list-unstyled">
										<li class="sub-title text-uppercase"><a
											class="menu-item pl-1 mt-2" href="Update.jsp"> Update</a></li>
										<li class="sub-title text-uppercase"><a
											class="menu-item pl-1 mt-2" href="Delete.jsp"> delete </a></li>
									</ul>
								</div>
							</div>
						</div></li>
				</ul>
				<form action="logout" method="post">
					<div>
						<button class="btn btn-primary" type="submit" name="logout">logout</button>
					</div>
				</form>
			</div>
		</nav>
	</header>
	<div class="row">
		<div class="col-md-4">
			<div class="card ">
				<div class="card-header ">
					<h5 class="card-title">Graph</h5>
					<p class="card-category"></p>
				</div>
				<div class="card-body ">
					<div id="chartContainer" style="height: 300px; width: 100%;"></div>
					<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
				</div>
				<div class="card-footer ">
					<hr>
				</div>
			</div>
		</div>
		<div class="card col-md-3">
			<div class="card-header">List</div>
			<div class="card-body" id="ShowData"></div>
			</td>
			</tr>
		</div>
	</div>
	<script type="text/javascript" src="js/jquery.min.js"></script>

	<script type="text/javascript" src="js/popper.min.js"></script>

	<script type="text/javascript" src="js/bootstrap.min.js"></script>

	<script type="text/javascript" src="js/mdb.min.js"></script>
	<script type="text/javascript" src="welcome.js"></script>



	<script>
		$(document).ready(function() {
			$("#age").click(function() {
				var data = "Location" + "location";
				$.ajax({
					url : "Age",
					data : data,
					type : 'get',
					success : function(data, status) {
						$('#ShowData').html(data);
					}
				});
			});
			$("#location").click(function() {
				var data = "Location" + "location";
				$.ajax({
					url : "location",
					data : data,
					type : 'get',
					success : function(data, status) {
						$('#ShowData').html(data);
					}
				});
			});
			$("#male").click(function() {
				var data = "male" + "male";
				$.ajax({
					url : "male",
					data : data,
					type : 'get',
					success : function(data, status) {
						$('#ShowData').html(data);
					}
				});
			});
			$("#female").click(function() {
				var data = "female" + "female";
				$.ajax({
					url : "Female",
					data : data,
					type : 'get',
					success : function(data, status) {
						$('#ShowData').html(data);
					}
				});
			});
			$("#Registration").click(function() {
				var data = "Location" + "location";
				$.ajax({
					url : "Registration",
					data : data,
					type : 'get',
					success : function(data, status) {
						$('#ShowData').html(data);
					}
				});
			});
			$("#update").click(function() {
				var data = "Location" + "location";
				$.ajax({
					url : "Update",
					data : data,
					type : 'get',
					success : function(data, status) {
						alert(status);
					}
				});
			});
		});
	</script>
</body>
</html>
