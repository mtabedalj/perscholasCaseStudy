<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Login page</title>
<link rel="stylesheet" href="./css/login.css">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<link href="./css/simple-sidebar.css" rel="stylesheet">
<script src="./vendor/jquery/jquery.min.js"></script>
<script src="./vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
</head>

<body>

	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="./../index.jsp">Home</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Business
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Clinet</a></li>
				<li class="nav-item"><a class="nav-link" href="./login.jsp">Login</a>
				</li>

			</ul>
		</div>
	</div>
	</nav>


	<!-- Page Content -->
	<div class="container-fluid " style="margin-top:60px; margin-left:100px">
		<div class="row no-gutter">
			<div class="col-md-8 col-lg-6">
				<div class="login d-flex align-items-center py-5">
					<div class="container">
						<div class="row">
							<div class="col-md-9 col-lg-8 mx-auto">
								<h3 class="login-heading mb-4">Welcome</h3>
								<form action="/PerscholasCaseStudy/SignUpServlet" method="POST">
									<div class="form-label-group">
										<input type="email" id="inputEmail" name="inputEmail"
											class="form-control" placeholder="Email address" required
											autofocus> <label for="inputEmail">Email
											address</label>
									</div>

									<div class="form-label-group">
										<input type="password" id="inputPassword" name="inputPassword"
											class="form-control" placeholder="Password" required>
										<label for="inputPassword">Password</label>
									</div>
									<!-- Material inline 1 -->
									<div class="form-check form-check-inline">
										<input type="radio" class="form-check-input" value="client"
											id="materialInline1" name="userType">
										<label class="form-check-label" for="materialInline1">Client</label>
									</div>

									<!-- Material inline 2 -->
									<div class="form-check form-check-inline">
										<input type="radio" class="form-check-input" value="business"
											id="materialInline2" name="userType">
										<label class="form-check-label" for="materialInline2">Business</label>
									</div>


									<button
										class="btn btn-lg btn-primary btn-block btn-login text-uppercase font-weight-bold mb-2"
										name="submit" type="submit">Sign up</button>

								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!-- Footer -->
	<footer class="py-5 bg-dark">
	<div class="container">
		<p class="m-0 text-center text-white">Copyright &copy;
			MahmoudAjawad 2019</p>
	</div>
	<!-- /.container --> </footer>
	<script>
		$("#menu-toggle").click(function(e) {
			e.preventDefault();
			$("#wrapper").toggleClass("toggled");
		});
	</script>


</body>

</html>
