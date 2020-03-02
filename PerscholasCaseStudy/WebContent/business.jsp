<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Business Page</title>
 
</head>

<body>
<%@ include file="busHeader.jsp"%>

 
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
