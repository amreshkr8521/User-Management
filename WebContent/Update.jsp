<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="css/login.css">

<body>
	<form action="update" method="post">

		<div class="col-lg-offset-4 col-lg-4">
			<h3 style="color: aliceblue">Update</h3>
			<div class="form-group ">
				<label for="" style="color: aliceblue">First Name</label> <input
					type="text" class="form-control" aria-describedby="fname"
					name="FirstName">
			</div>
			<div class="form-group ">
				<label for="" style="color: aliceblue">Last Name</label> <input
					type="text" class="form-control" id="LastName"
					aria-describedby="lname" name="LastName">
			</div>
			<div class="form-group ">
				<label for="Email" style="color: aliceblue">Email address</label> <input
					type="email" class="form-control" id="email"
					aria-describedby="email" name="email" required> <small
					class="form-text text-muted" style="color: aliceblue">Correct
					user email required</small>
			</div>
			<div class="form-group ">
				<label for="Email" style="color: aliceblue">Mobile Number</label> <input
					type="text" class="form-control" id="mobile" aria-describedby=""
					name="mobile" required> <small class="form-text text-muted"
					style="color: aliceblue">Correct user mobile number</small>
			</div>
			<div class="form-group ">
				<label for="" style="color: aliceblue">Age</label> <input
					type="text" class="form-control" id="age" aria-describedby=""
					name="age">
			</div>
			<div class="form-group ">
				<label for="" style="color: aliceblue">Location</label> <input
					type="text" class="form-control" id="location" aria-describedby=""
					name="location">
			</div>
			<button id="login" type="submit" name="submit"
				class="btn btn-primary form-control">Update</button>
		</div>
	</form>
</body>
</html>
