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
	<form action="SignUp" method="post">
		<h3 id="h1">Register ${warning1} ${warning}</h3>
		<h3 id="h1">${DATABASE_WARNING}${ADDED_IN_DATABASE}</h3>
		<div class="col-lg-offset-4 col-lg-4">
			<h3 style="color: aliceblue">Sign Up</h3>
			<div class="form-group ">
				<label for="" style="color: aliceblue">First Name</label> <input
					type="text" class="form-control" id="FirstName"
					aria-describedby="fname" name="FirstName" required>

			</div>
			<div class="form-group ">
				<label for="" style="color: aliceblue">Last Name</label> <input
					type="text" class="form-control" id="LastName"
					aria-describedby="lname" name="LastName" required>

			</div>
			<div class="form-group ">
				<label for="Email" style="color: aliceblue">Email address</label> <input
					type="email" class="form-control" id="email"
					aria-describedby="email" name="email" required>

			</div>
			<div class="form-group ">
				<label for="Email" style="color: aliceblue">Mobile Number</label> <input
					type="text" class="form-control" id="mobile" aria-describedby=""
					name="mobile" required>

			</div>
			<div class="form-group ">
				<label for="" style="color: aliceblue">Age</label> <input
					type="text" class="form-control" id="age" aria-describedby=""
					name="age" required>

			</div>
			<div class="form-group ">
				<label for="" style="color: aliceblue">Location</label> <input
					type="text" class="form-control" id="location" aria-describedby=""
					name="location" required>

			</div>
			<div class="form-group " style="color: aliceblue">
				<input type="radio" value="Male" name="gender">Male<input
					type="radio" value="Female" name="gender">Female<br> <br>

			</div>
			<div class="form-group">
				<label for="Password" style="color: aliceblue">Password</label> <input
					type="password" class="form-control" id="pwd" name="password">
			</div>
			<div class="form-group">
				<label for="Password" style="color: aliceblue">Re-Type
					Password</label> <input type="password" class="form-control" id="repwd"
					name="rePassword">
			</div>
			<br />


			<button id="login" type="submit" name="submit"
				class="btn btn-primary form-control">Register</button>

		</div>
	</form>
	<a href="forgotPassword.jsp">Forgot Password?</a>


</body>
</html>
