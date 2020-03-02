<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
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


			<form class="bd-search d-flex align-items-center">
				<span class="algolia-autocomplete"
					style="position: relative; display: inline-block; direction: ltr;"><input
					type="search" class="form-control ds-input" id="search-input"
					placeholder="Search..." aria-label="Search for..."
					autocomplete="off" spellcheck="false" role="combobox"
					aria-autocomplete="list" aria-expanded="false"
					aria-owns="algolia-autocomplete-listbox-0" dir="auto"
					style="position: relative; vertical-align: top;">
				<pre aria-hidden="true"
						style="position: absolute; visibility: hidden; white-space: pre; font-family: -apple-system, BlinkMacSystemFont,&amp; quot; Segoe UI&amp;quot; , Roboto , &amp;quot; Helvetica Neue&amp;quot; , Arial , sans-serif, &amp;quot; Apple Color Emoji&amp;quot; , &amp; quot; Segoe UI Emoji&amp;quot; , &amp; quot; Segoe UI Symbol&amp;quot;; font-size: 16px; font-style: normal; font-variant: normal; font-weight: 400; word-spacing: 0px; letter-spacing: normal; text-indent: 0px; text-rendering: auto; text-transform: none;"></pre><span
					class="ds-dropdown-menu" role="listbox"
					id="algolia-autocomplete-listbox-0"
					style="position: absolute; top: 100%; z-index: 100; left: 0px; right: auto; display: none;"><div
							class="ds-dataset-1"></div></span></span>
				<button
					class="btn btn-link bd-search-docs-toggle d-md-none p-0 ml-3"
					type="button" data-toggle="collapse" data-target="#bd-docs-nav"
					aria-controls="bd-docs-nav" aria-expanded="false"
					aria-label="Toggle docs navigation">
					<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 30 30"
						width="30" height="30" focusable="false">
					<title>Menu</title>
					<path stroke="currentColor" stroke-width="2" stroke-linecap="round"
						stroke-miterlimit="10" d="M4 7h22M4 15h22M4 23h22"></path></svg>
				</button>
			</form>


			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ml-auto mt-2 mt-lg-0">
					<li class="nav-item active"><a class="nav-link text-light"
						href="#">Logout <span class="sr-only">(current)</span></a></li>
				</ul>
			</div>
			</nav>
			<%@ include file="busFooter.jsp"%>


			<!-- Menu Toggle Script -->
			<script>
				$("#menu-toggle").click(function(e) {
					e.preventDefault();
					$("#wrapper").toggleClass("toggled");
				});
			</script>
</body>
</html>