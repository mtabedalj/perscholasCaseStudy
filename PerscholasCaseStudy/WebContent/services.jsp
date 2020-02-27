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


	<form action="AddServiceServlet" method="post"
		style="width: 25%; margin: 50px;" id="theForm">
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

		<button type="button" class="btn btn-primary" OnClick ="checkVal()">Add Service</button>
	</form>




	<div class="container-fluid d-flex justify-content-center ">
		<div class="list-group w-50 p-3 d-flex justify-content-center">
			<div id="theServiceList">
				<div class="list-group">

					<c:forEach items="${allServices}" var="item">

						<button type="button"
							class="list-group-item list-group-item-action">
							<span name="nameVal"><c:out value="${item.serviceName}"></c:out></span><br>
							<span name="priceVal"><c:out value="${item.price}"></c:out></span>
						</button>


					</c:forEach>
				</div>
			</div>

		</div>
	</div>



	<%@ include file="busFooter.jsp"%>



	<script type="text/javascript">
		function checkVal(){
			var val = document.getElementById("exampleInputPassword1").value;
			if(val!=NaN && val>0){
				document.getElementById("theForm").submit();

			}
			else
				{
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
