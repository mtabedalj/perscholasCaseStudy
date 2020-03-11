<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/algoliasearch@4/dist/algoliasearch-lite.umd.js"></script>

<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

<link href="./vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="./css/simple-sidebar.css" rel="stylesheet">
<script src="./vendor/jquery/jquery.min.js"></script>
<script src="./vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
</head>
<body>

	<div class="d-flex" id="wrapper">


		<!-- /#sidebar-wrapper -->

		<!-- Page Content -->
		<div id="page-content-wrapper">

			<nav
				class="navbar navbar-expand-lg navbar-light bg-dark border-bottom">
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<form action="LookUpServlet" method="post"
				style="margin-left: 90px; width: 340px;">
				<input style="width: 70%;" type="text" class="form-control"
					name="busName" id="busName" placeholder="Enter Business Name"
					aria-label="Username" aria-describedby="basic-addon1">
			</form>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ml-auto mt-2 mt-lg-0">
					<li class="nav-item active"><a class="nav-link text-light"
						href="${pageContext.request.contextPath}/LogoutServlet">Logout
							<span class="sr-only">(current)</span>
					</a></li>
				</ul>
			</div>
			</nav>

			<header class="bg py-5 mb-5"
				style="background-image: url('assets/s6.jpg');     background-size:cover;
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-position: center; 
    height:620px
    ">
			<div class="container h-100">
				<div class="row h-100 align-items-center">
					<div class="col-lg-12">


						</p>
					</div>
				</div>
			</div>
			</header>
			<span class="d-flex justify-content-center">${emptyList}</span>

			<div>
				<c:forEach items="${businessList}" var="item">

					<div class="d-flex justify-content-center" style="height:300px">
						<form action="ViewBusinessServlet" method="post">
						<input type="hidden" name="emailVal"  value="${item.email}">
							<button class="btn-light">

								<span><c:out value="${item.name}"></c:out></span><br> <span><c:out
										value="${item.phone}"></c:out></span>


							</button>
						</form>
					</div>



				</c:forEach>
			</div>



			<!-- Menu Toggle Script -->
			<script>
				$("#menu-toggle").click(function(e) {
					e.preventDefault();
					$("#wrapper").toggleClass("toggled");
				});
			</script>
</body>
</html>