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
<form action = "addBusinessServlet" method="post" class="needs-validation" style="width:70%; margin:20px">
  <div class="form-row">
    <div class="col-md-4 mb-3">
      <label for="validationCustom01">name</label>
      <input type="text" class="form-control" name = "name" id="validationCustom01" placeholder="Business name" value="${businessList.name}" required>
    </div>
    <div class="col-md-4 mb-3">
      <label for="validationCustom02">Phone Number</label>
      <input type="text" class="form-control" name = "phone" id="validationCustom02" placeholder="ex: 313-873-9240" value="${businessList.phone}" required>
 
    </div>
    <div class="col-md-4 mb-3">
      <label for="validationCustomUsername">Address Line</label>
      <div class="input-group">
         <input type="text" name = "addressLine"class="form-control" value="${businessList.addressLine}" id="validationCustomUsername" placeholder="ex: 9240 Conant st" aria-describedby="inputGroupPrepend" required>

      </div>
    </div>
  </div>
  <div class="form-row">
    <div class="col-md-6 mb-3">
      <label for="validationCustom03">City</label>
      <input type="text" class="form-control" value="${businessList.city}" name = "city" id="validationCustom03" placeholder="City" required>
    </div>
    <div class="col-md-3 mb-3">
      <label for="validationCustom04">State</label>
      <input type="text" class="form-control" name = "state" value="${businessList.state}" id="validationCustom04" placeholder="State" required>
    </div>
  </div>
    <div class="form-row">
    <div class="col-md-6 mb-3">
      <label for="validationCustom03">About</label>
      <input  type="text" class="form-control"  value="${businessList.aboutSection}" name = "about"id="validationCustom05" placeholder="About the business" required>
     </div>
 
    </div>
   
  <div class="form-group">
   
  </div>
  
   
   <button class="btn btn-primary" type="submit">Submit</button>
</form>



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
