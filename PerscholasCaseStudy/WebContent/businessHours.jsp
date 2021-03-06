<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>BusinessHour Page</title>

</head>

<body>
	<%@ include file="busHeader.jsp"%>
 	<form action="AddHoursServlet" method="post"
		style="width: 80%; margin: 50px;" id="theForm">
 
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Day</th>
					<th scope="col">Open Time</th>
					<th scope="col">Close Time</th>
					<th scope="col">Closed</th>

				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Sunday</td>
					<td><input type="time" class="Selectpicker" name="SundayOpen" value="${hoursList.getOpenTimes().get('SundayOpen')}"
						id="SundayOpen" 
						style="border-radius: 3px; border: 1px solid gainsboro;" ></td>
					<td><input type="time" class="selectpicker" name="SundayClose"  value = "${hoursList.getCloseTimes().get('SundayClose')}"
						id="SundayClose"
						style="border-radius: 3px; border: 1px solid gainsboro;"></td>
						<td><input type="checkbox" class="checkbox" name="isSundayClose"  value = "${hoursList.getShopOpenDays().get('isSundayClose')}"
						id="isSundayClose"  ></td>
				</tr>
				<tr> 
					<td>Monday</td>
					<td><input type="time" class="selectpicker" name="MondayOpen" value="${hoursList.getOpenTimes().get('MondayOpen')}"
						id="MondayOpen"
						style="border-radius: 3px; border: 1px solid gainsboro;"></td>
					<td><input type="time" class="selectpicker" name="MondayClose" value = "${hoursList.getCloseTimes().get('MondayClose')}"
						id="MondayClose"
						style="border-radius: 3px; border: 1px solid gainsboro;"></td>
						<td><input type="checkbox" class="checkbox" name="isMondayClose"  value = "${hoursList.getShopOpenDays().get('isMondayClose')}"
						id="isMondayClose"  ></td>
				</tr>
				<tr>
					<td>Tuesday</td>
					<td><input type="time" class="selectpicker" name="TuesdayOpen" value="${hoursList.getOpenTimes().get('TuesdayOpen')}"
						id="TuesdayOpen"
						style="border-radius: 3px; border: 1px solid gainsboro;"></td>
					<td><input type="time" class="selectpicker" value = "${hoursList.getCloseTimes().get('TuesdayClose')}"
						name="TuesdayClose" id="TuesdayClose"
						style="border-radius: 3px; border: 1px solid gainsboro;"></td>
						<td><input type="checkbox" class="checkbox" name="isTuesdayClose"  value = "${hoursList.getShopOpenDays().get('isTuesdayClose')}"
						id="isTuesdayClose"  ></td>
				</tr>
				<tr>
					<td>Wednesday</td>
					<td><input type="time" class="selectpicker" value="${hoursList.getOpenTimes().get('WednesdayOpen')}"
						name="WednesdayOpen" id="WednesdayOpen"
						style="border-radius: 3px; border: 1px solid gainsboro;"></td>
					<td><input type="time" class="selectpicker" value = "${hoursList.getCloseTimes().get('WednesdayClose')}"
						name="WednesdayClose" id="WednesdayClose"
						style="border-radius: 3px; border: 1px solid gainsboro;"></td>
						<td><input type="checkbox" class="checkbox" name="isWednesdayClose"  value = "${hoursList.getShopOpenDays().get('isWednesdayClose')}"
						id="isWednesdayClose"  ></td>
				</tr>
				<tr>
					<td>Thursday</td>
					<td><input type="time" class="selectpicker" value="${hoursList.getOpenTimes().get('ThursdayOpen')}"
						name="ThursdayOpen" id="ThursdayOpen"
						style="border-radius: 3px; border: 1px solid gainsboro;"></td>
					<td><input type="time" class="selectpicker" value = "${hoursList.getCloseTimes().get('ThursdayClose')}"
						name="ThursdayClose" id="ThursdayClose"
						style="border-radius: 3px; border: 1px solid gainsboro;"></td>
						<td><input type="checkbox" class="checkbox" name="isThursdayClose" value = "${hoursList.getShopOpenDays().get('isThursdayClose')}"
						id="isThursdayClose" ></td>
				</tr>
				<tr>
					<td>Friday</td>
					<td><input type="time" class="selectpicker" name="FridayOpen" value="${hoursList.getOpenTimes().get('FridayOpen')}"
						id="FridayOpen"
						style="border-radius: 3px; border: 1px solid gainsboro;"></td>
					<td><input type="time" class="selectpicker" name="FridayClose" value = "${hoursList.getCloseTimes().get('FridayClose')}"
						id="FridayClose"
						style="border-radius: 3px; border: 1px solid gainsboro;"></td>
						<td><input type="checkbox" class="checkbox" name="isFridayClose"   value = "${hoursList.getShopOpenDays().get('isFridayClose')}"
						id="isFridayClose"  ></td>
				</tr>
				<tr>
					<td>Saturday</td>
					<td><input type="time" class="selectpicker" value="${hoursList.getOpenTimes().get('SaturdayOpen')}"
						name="SaturdayOpen" id="SaturdayOpen"
						style="border-radius: 3px; border: 1px solid gainsboro;"></td>
					<td><input type="time" class="selectpicker" value = "${hoursList.getCloseTimes().get('SaturdayClose')}"
						name="SaturdayClose" id="SaturdayClose"
						style="border-radius: 3px; border: 1px solid gainsboro;"></td>
							<td><input type="checkbox" class="checkbox" name="isSaturdayClose"  value = "${hoursList.getShopOpenDays().get('isSaturdayClose')}"
						id="isSaturdayClose"  ></td>
						</tr>
			</tbody>
		</table>


		<button type="submit" class="btn btn-primary">Set Hours</button><br><br>
		<div class = "row">
				<div style="height:15px;width:15px;background-color:FireBrick; margin-top:3px;margin-right:5px"></div><span>This color indicates shop off days</span>
		
		</div>
	</form>


	<%@ include file="busFooter.jsp"%>


	<!-- Menu Toggle Script -->
	<script>
		$("#menu-toggle").click(function(e) {
			e.preventDefault();
			$("#wrapper").toggleClass("toggled");
		});
	</script>
	<script type="text/javascript">
//	function handleClosingDays(){
//		var days = ["isSundayClose","isMondayClose","isTuesdayClose","isWednesdayClose","isThursdayClose","isFridayClose","isSaturdayClose"];
//		var open = ["SundayOpen","MondayOpen","TuesdayOpen","WednesdayOpen","ThursdayOpen","FridayOpen","SaturdayOpen"];
//		var close = ["SundayClose","MondayClose","TuesdayClose","WednesdayClose","ThursdayClose","FridayClose","SaturdayClose"];


	//	for(var i = 0; i<days.length;i++){
	//		if(document.getElementById(days[i]).checked){
	//			document.getElementById(open[i]).style.visibility = "hidden";
	//			document.getElementById(close[i]).style.visibility = "hidden";

	//		}
	//		else{
		//		document.getElementById(open[i]).style.visibility = "visible";
		//		document.getElementById(close[i]).style.visibility = "visible";

		//	}
			
		//}
		
	//}
	//
	</script>
	<script>
	var days = ["isSundayClose","isMondayClose","isTuesdayClose","isWednesdayClose","isThursdayClose","isFridayClose","isSaturdayClose"];

	window.addEventListener('load',function(){
		for(var i = 0; i<days.length;i++){
		var checkVal = document.getElementById(days[i]).value;
 		if(checkVal==="on"){
 			document.getElementById(days[i]).parentElement.parentElement.style.backgroundColor  = "FireBrick";
		}
 		else{
 			console.log("hm");

 		}
			
		}
		
	});
	</script>
</body>

</html>
