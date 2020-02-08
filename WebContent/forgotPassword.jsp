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
	<form action="forgot" method="post">
		<h3 id="h1">Register ${warning1} ${warning}</h3>
		<h3 id="h1">${DATABASE_WARNING}${ADDED_IN_DATABASE}</h3>
		<div class="col-lg-offset-4 col-lg-4">
			<h3 style="color: aliceblue">Re-Set Password</h3>
			<div class="form-group ">
				<label for="Email" style="color: aliceblue">Email</label> <input
					type="email" class="form-control" id="email"
					aria-describedby="email" name="email" required>

			</div>
			<div class="form-group ">
				<label for="Email" style="color: aliceblue">Mobile</label> <input
					type="text" class="form-control" id="mobile"
					aria-describedby="mobile" name="mobile" required>

			</div>
			<div class="form-group ">
				<label for="Email" style="color: aliceblue">Password</label> <input
					type="password" class="form-control" id="password"
					aria-describedby="password" name="password" required>

			</div>
			<div class="form-group ">
				<label for="Email" style="color: aliceblue">Re Password</label> <input
					type="password" class="form-control" id="RePassword"
					aria-describedby="password" name="RePassword" required>

			</div>





			<button id="forgotPassword" type="submit" name="forgot"
				class="btn btn-primary form-control">Re-Set</button>

		</div>
	</form>



</body>
</html>
