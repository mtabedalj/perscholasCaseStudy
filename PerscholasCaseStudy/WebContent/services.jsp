<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Service Page</title>


</head>

<body>

	<%@ include file="busHeader.jsp"%>

	<div class="container">
		<div class="row d-flex justify-content-between"">
			<div class="col-lg-6 d-flex justify-content-start">
				<form action="AddServiceServlet" method="post"
					style="width: 85%; margin: 50px;" id="theForm">
					<div class="form-group">

						<label for="serviceName">Service Name</label> <select
							class="selectpicker" name="serviceName" id="serviceName">
							<option>Haircut</option>
							<option>Shave</option>
							<option>Beard trim</option>
							<option>Hair color</option>
							<option>Beard color</option>


						</select>
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Service Price</label> <input
							type="text" class="form-control" id="exampleInputPassword1"
							name="servicePrice">
					</div>

					<button type="button" class="btn btn-primary" OnClick="checkVal()">Add
						Service</button>
				</form>


			</div>

			<div class="col-lg-6 d-flex justify-content-start"
				style="margin-top: 50px">
				<div class="container-fluid  ">
					<div class="list-group">
						<div id="thePromoList">
							<div class="list-group">

								<c:forEach items="${allServices}" var="item">
									<div class="container" id="thePromo"
										style="border-radius: 3px; border: 1px solid gainsboro;">
										<div class="row">
											<div class="col-sm-10">

												<span name="nameVal"><c:out
														value="${item.serviceName}"></c:out></span><br> <span
													name="priceVal"><c:out value="${item.price}"></c:out></span>


											</div>

											<div class="col-sm-2 align-self-center">
												<form id="servForm" action="deleteServiceServlet"
													method="post">
													<input type="hidden" name="myField" id="myField" value="" />

													<button type="button">
														<i class="material-icons" onClick="deleteService(event)">delete_forever</i>
													</button>
												</form>
											</div>
										</div>
									</div>


								</c:forEach>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>



	<script>
		function deleteService(event) {

			var myobj = event.target;
			myobj.previousSibling.value;
			var servicename = myobj.parentElement.parentElement.parentElement.parentElement.innerText
					.split('\n')[0];
			myobj.parentElement.previousElementSibling.value = servicename;
			myobj.parentElement.previousElementSibling.setAttribute("name",
					"theService");
			myobj.parentElement.parentElement.submit();
		}
	</script>














	<%@ include file="busFooter.jsp"%>



	<script type="text/javascript">
		function checkVal() {
			var val = document.getElementById("exampleInputPassword1").value;
			if (val != NaN && val > 0) {
				document.getElementById("theForm").submit();

			} else {
				alert("Please Enter a valid value for the price");
			}
		}
	</script>
	<!-- Menu Toggle Script -->
	<script>
		$("#menu-toggle").click(function(e) {
			e.preventDefault();
			$("#wrapper").toggleClass("toggled");
		});
	</script>

</body>

</html>
