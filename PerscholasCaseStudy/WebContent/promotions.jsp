<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<title>Promo page</title>


</head>

<body>

	<%@ include file="busHeader.jsp"%>


	<div class="container">
		<div class="row d-flex justify-content-between"">
			<div class="col-lg-6 d-flex justify-content-start">
				<form action="AddPromotionServlet" method="post"
					style="width: 50%; margin: 50px;" id="theForm">
					<div class="form-group">

						<label for="serviceName">Promotion Name</label> <input type="text"
							class="form-control" id="exampleInputPassword1"
							name="promotionName">
					</div>
					<div>
						<label for="startDate">Start Date</label><br> <input
							style="border-radius: 3px; border: 1px solid gainsboro"
							type="date" id="startDate" name="startDate">
					</div>
					<br>
					<div>
						<label for="endDate">End Date</label><br> <input
							style="border-radius: 3px; border: 1px solid gainsboro"
							type="date" id="endDate" name="endDate">
					</div>
					<br>
					<div>
						<label for="promoContent">Promotion Details</label><br>
						<textarea id="promoContent" name="promoContent" rows="4" cols="50"
							style="border-radius: 3px; border: 1px solid gainsboro; width: 100%">
 </textarea>
					</div>
					<button type="submit" class="btn btn-primary">Add
						Promotion</button>
				</form>

			</div>

			<div class="col-lg-6 d-flex justify-content-start"
				style="margin-top: 50px">
				<div class="container-fluid  ">
					<div class="list-group">
						<div id="thePromoList">
							<div class="list-group">

								<c:forEach items="${promotionList}" var="item">
									<div class="container" id="thePromo"
										style="border-radius: 3px; border: 1px solid gainsboro;">
										<div class="row">
											<div class="col-sm-10">

												<span id="promoName" name="promoName"><c:out
														value="${item.promoName}"></c:out></span><br> <span
													id="date" name="date"><c:out
														value="${item.startDate}-${item.endDate}"></c:out></span><br>
												<span id="promoContent" name="promoContent"><c:out
														value="${item.promoContent}"></c:out></span>


											</div>

											<div class="col-sm-2 align-self-center">
												<form id = "bromoForm" action="deletePromotionServlet" method="post">
												<input type="hidden" name="myField" id="myField" value="" />
												
													<button type="button">
														<i class="material-icons" onClick="deletePromo(event)">delete_forever</i>
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
		function deletePromo(event) {
 
			var myobj = event.target;
			myobj.previousSibling.value;
			var promoname = myobj.parentElement.parentElement.parentElement.parentElement.innerText.split('\n')[0];
			myobj.parentElement.previousElementSibling.value = promoname;
			myobj.parentElement.previousElementSibling.setAttribute("name","thePromo");

			 myobj.parentElement.parentElement.submit();
		}
	</script>







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
