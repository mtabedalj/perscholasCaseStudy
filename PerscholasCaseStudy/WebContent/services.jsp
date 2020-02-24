<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Business Page</title>


</head>

<body>

	<%@ include file="busHeader.jsp"%>

	<div class="container-fluid d-flex justify-content-center ">
		<div class="list-group w-50 p-3 d-flex justify-content-center">
			<div class="d-flex flex-row">
				<button type="button"
					class="list-group-item list-group-item-action  bg-light" disabled>
					Service List</button>
			</div>


			<div id="theServiceList">
				<form action="/PerscholasCaseStudy/AddServiceServlet">
					<c:forEach items="${allServices}" var="item">
						<button class='list-group-item list-group-item-action'>
							<span name="nameVal"><c:out value="${item.serviceName}"></c:out></span><br>
							<span name="priceVal"><c:out value="${item.price}"></c:out></span>

						</button>
					</c:forEach>
				</form>
			</div>
			<button type="button" id="addService"
				class="list-group-item list-group-item-action d-flex justify-content-center text-primary">
				<i class="material-icons text-primary " style="font-size: 26px;">add</i>Add
				a new service
			</button>

		</div>
	</div>

	<div class="modal" id="modal01" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">Modal title</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<form action="/PerscholasCaseStudy/AddServiceServlet"
							method="POST">

							<label for="serviceName" class="col-form-label">Service
								Name:</label> <input type="text" class="form-control" id="serviceName"
								name="serviceName"> <label for="servicePrice"
								class="col-form-label">Service Price:</label> <input type="text"
								class="form-control" id="servicePrice" name="servicePrice">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Close</button>
							<button type="submit" class="btn btn-primary" id="saveChanges"
								name="submit">Save changes</button>
						</form>

					</div>


				</div>

			</div>
		</div>
	</div>

	<%@ include file="busFooter.jsp"%>
	<script>
		$(document)
				.ready(
						function() {
							$("#addService")
									.click(
											function() {

												$("#theServiceList")
														.append(
																"<button  class='list-group-item list-group-item-action'><span>Service Name</span> <br> <span>price</span></button>");
											});

						});
	</script>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#theServiceList").on('click', 'button', function() {
				$("#theServiceList button").attr("data-toggle", "modal");
				$("#theServiceList button").attr("data-target", "#modal01");

			});
		});
	</script>

	<script type="text/javascript">
		
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
