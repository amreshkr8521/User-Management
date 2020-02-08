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
	<form action="delete" method="post">

		<div class="col-lg-offset-4 col-lg-4">
			<h3 style="color: aliceblue">Delete</h3>
			<div class="form-group ">
				<label for="" style="color: aliceblue">Email</label> <input
					type="email" class="form-control" id="FirstName"
					aria-describedby="email" name="email" required> <small
					class="form-text text-muted" style="color: aliceblue">We'll
					never share your email with anyone else.</small>
			</div>




			<button id="login" type="submit" name="submit"
				class="btn btn-primary form-control">Delete</button>
		</div>
	</form>
</body>
</html>
