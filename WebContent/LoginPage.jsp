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
	<form action="Login" method="post">
		<h3 id="h1">${message1} ${ADDED_IN_DATABASE}</h3>
		<div class="col-lg-offset-4 col-lg-4">
			<h3 style="color: aliceblue">Login</h3>
			<div class="form-group ">
				<label for="Email" style="color: aliceblue">Email address</label> <input
					type="email" class="form-control" id="userId"
					aria-describedby="email" name="userId" required> <small
					class="form-text text-muted" style="color: aliceblue">We'll
					never share your email with anyone else.</small>
			</div>
			<div class="form-group">
				<label for="Password" style="color: aliceblue">Password</label> <input
					type="password" class="form-control" id="pwd" name="pwd">
			</div>



			<button id="login" type="submit" name="submit"
				class="btn btn-primary form-control">login</button>

		</div>
	</form>
	<a href="forgotPassword.jsp">Forgot Password?</a>
	<a href="SignUP.jsp"> Register</a>

</body>
</html>
