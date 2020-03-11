<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Business Profile</title>
<style>
#theJump {
	padding: 2rem 1rem;
	margin-bottom: 2rem;
	border-radius: 0.3rem;
	background: #000064; /* old browsers fallback color*/
	background: -webkit-linear-gradient(to right, #1BADD8, #00003E);
	background: linear-gradient(to right, #1BADD8, #00003E);
}
</style>
</head>
<body>
	<%@ include file="busHeader.jsp"%>


	<div class="jumbotron jumbotron-fluid" id="theJump">
		<h1 class="display-4" style="color: white; text-align: center">${business.name}</h1>
		<p class="lead" style="color: white; text-align: center">${business.aboutSection}</p>
	</div>
	<div id="address" class="d-flex justify-content-center">
		
	</div>
	<br>
	<br>
<table class="table d-flex justify-content-center">
<tr style="  margin-bottom: 50px">
<td><i class="material-icons"
			style="color: DodgerBlue; margin-right: 40px">location_on</i></td>
<td>

 <span>${business.addressLine},</span>
		<span>${business.city},</span><span>${business.state}</span> 

</td>

</tr> 

<tr style="  margin-bottom: 20px">
<td><i class="material-icons"
				style="color: DodgerBlue; margin-right: 100px">schedule</i></td>
<td>
	<div>
			<div class="row">
				<span style="margin-right: 100px">Sunday</span>
				<div id="isSundayClose"
					value="${hoursList.getShopOpenDays().get('isSundayClose')}">
					<span style="margin-right: 25px"><c:out
							value="${hoursList.getOpenTimes().get('SundayOpen')}"></c:out></span> <span><c:out
							value="${hoursList.getCloseTimes().get('SundayClose')}"></c:out></span>
				</div>
			</div>
			<div class="row">

				<span style="margin-right: 94px">Monday</span>
				<div id="isMondayClose"
					value="${hoursList.getShopOpenDays().get('isMondayClose')}">
					<span style="margin-right: 25px"><c:out
							value="${hoursList.getOpenTimes().get('MondayOpen')}"></c:out></span> <span><c:out
							value="${hoursList.getCloseTimes().get('MondayClose')}"></c:out></span>
				</div>
			</div>
			<div class="row">

				<span style="margin-right: 94px">Tuesday</span>
				<div id="isTuesdayClose"
					value="${hoursList.getShopOpenDays().get('isTuesdayClose')}">
					<span style="margin-right: 25px"><c:out
							value="${hoursList.getOpenTimes().get('TuesdayOpen')}"></c:out></span> <span><c:out
							value="${hoursList.getCloseTimes().get('TuesdayClose')}"></c:out></span>
				</div>
			</div>
			<div class="row">

				<span style="margin-right: 72px">Wednesday</span>
				<div id="isWednesdayClose"
					value="${hoursList.getShopOpenDays().get('isWednesdayClose')}">
					<span style="margin-right: 25px"><c:out
							value="${hoursList.getOpenTimes().get('WednesdayOpen')}"></c:out></span>
					<span><c:out
							value="${hoursList.getCloseTimes().get('WednesdayClose')}"></c:out></span>
				</div>
			</div>
			<div class="row">

				<span style="margin-right: 90px">Thursday</span>
				<div id="isThursdayClose"
					value="${hoursList.getShopOpenDays().get('isThursdayClose')}">
					<span style="margin-right: 25px"><c:out
							value="${hoursList.getOpenTimes().get('ThursdayOpen')}"></c:out></span>
					<span><c:out
							value="${hoursList.getCloseTimes().get('ThursdayClose')}"></c:out></span>
				</div>
			</div>
			<div class="row">

				<span style="margin-right: 110px">Friday</span>
				<div id="isFridayClose"
					value="${hoursList.getShopOpenDays().get('isFridayClose')}">
					<span style="margin-right: 25px"><c:out
							value="${hoursList.getOpenTimes().get('FridayOpen')}"></c:out></span> <span><c:out
							value="${hoursList.getCloseTimes().get('FridayClose')}"></c:out></span>
				</div>
			</div>
			<div class="row">

				<span style="margin-right: 90px">Saturday</span>
				<div id="isSaturdayClose"
					value="${hoursList.getShopOpenDays().get('isSaturdayClose')}">
					<span style="margin-right: 25px"><c:out
							value="${hoursList.getOpenTimes().get('SaturdayOpen')}"></c:out></span>
					<span><c:out
							value="${hoursList.getCloseTimes().get('SaturdayClose')}"></c:out></span><br><br>
				</div>
			</div>

		</div>
</td>
</tr>

<tr style="  margin-bottom: 20px">
<td><i class="material-icons"
			style="color: DodgerBlue; margin-right: 100px">phone</i></td>
<td><span><c:out
				value="${business.phone}"></c:out></span><br><br></td>

</tr>

<tr style="  margin-bottom: 50px">
<td><i class="material-icons"
			style="color: DodgerBlue; margin-right: 85px">whatshot</i></td>
<td>
	<c:forEach items="${promotionList}" var="item">
									 
 
												<div id="promoName" name="promoName"><c:out
														value="${item.promoName}"></c:out></div>

  
									 


								</c:forEach>




</td>

</tr>
 

<tr style="  margin-top: 50px">
<td>
<i class="material-icons"
			style="color: DodgerBlue; margin-right: 100px">list</i>
</td>
<td>
	<c:forEach items="${allServices}" var="item">
									<div class="container" id="thePromo"
										 >
										<div class="row">
										 

												<span name="nameVal" style="margin-right: 20px"><c:out
														value="${item.serviceName}"></c:out></span><br> <span 
													name="priceVal"><c:out value="${item.price}"></c:out></span>


										 
 										</div>
									</div>


								</c:forEach>

</td>

</tr>

<tr style="  margin-top: 50px">
<td>
<i class="material-icons"
			style="color: DodgerBlue; margin-right: 100px">rate_review</i>
</td>
<td>
	<c:forEach items="${rList}" var="item">
									<ul class="container" id="thePromo"
										 >
 										 

												<li name="nameVal" style="margin-right: 20px"><c:out
														value="${item.revContent}"></c:out></li> 


										 
 									</ul>


								</c:forEach>

</td>

</tr>
</table>
 <%@ include file="busFooter.jsp"%>


	<!-- Menu Toggle Script -->
	<script>
		$("#menu-toggle").click(function(e) {
			e.preventDefault();
			$("#wrapper").toggleClass("toggled");
		});
	</script>

	<script>
		var days = [ "isSundayClose", "isMondayClose", "isTuesdayClose",
				"isWednesdayClose", "isThursdayClose", "isFridayClose",
				"isSaturdayClose" ];

		window.addEventListener('load', function() {
			for (var i = 0; i < days.length; i++) {
				var checkVal = document.getElementById(days[i]).getAttribute(
						'value');
				console.log("val is: " + checkVal);
				if (checkVal === "on") {
					document.getElementById(days[i]).innerHTML = "closed";
				} else {
					console.log("hm");

				}

			}

		});
	</script>
</body>
</html>