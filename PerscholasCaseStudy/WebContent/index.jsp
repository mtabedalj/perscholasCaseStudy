<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Main page</title>

  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  <link href="./assets/css/open-iconic-bootstrap.css" rel="stylesheet">

  <link href="./css/simple-sidebar.css" rel="stylesheet">
  <script src="./vendor/jquery/jquery.min.js"></script>
  <script src="./vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons"rel="stylesheet">
</head>

<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
    <div class="container">
      <a class="navbar-brand" href="./index.jsp">
      <img src="./trimmer.png" alt="" style="width: auto; height:80px"></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarResponsive">

        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="./business.jsp">Business
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Clinet</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="./login.jsp">Login</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Header -->
  <header class="bg-success py-5 mb-5">
    <div class="container h-100">
      <div class="row h-100 align-items-center">
        <div class="col-lg-12">
          <h1 class="display-4 text-white mt-5 mb-2">How to maximize your benfits from our website</h1>
          <p class="lead mb-5 text-white-50">This website allows you to manage your salon. Salons can post their profile, offers and promotions.
           Clients can locate their favorite salon on our website by simply looking them up by their name. Clients can see the salon information
           and get advantage of their specials and promotions.


          </p>
        </div>
      </div>
    </div>
  </header>

  <!-- Page Content -->
  <div class="container" id = "theDiv">

    <div class="row">
      <div class="col-md-8 mb-5">
        <h2>What We Do</h2>
        <hr>
        <p>We value the relationship between businesses and clients and we believe that this platform allows you to strengthen that relationship even more. By creating a profile,
         your clients can know about your salon, the services you provide, hours of operation and current promotions offered by you.
        On the other hand, clients get to know more about their salon</p>
        <a class="btn btn-primary btn-lg" href="./html/login.jsp">I am a business &raquo;</a>
          <a class="btn btn-primary btn-lg" href="#">I am a client &raquo;</a>

      </div>
      <div class="col-md-4 mb-5">
        <h2>Contact Us</h2>
        <hr>
        <address>
          <strong>Mahmoud Abedaljawad</strong>
          <br>Dearborn Hts, MI 48127
          <br>
        </address>
        <address>
        <span class="oi oi-phone"></span>
        <abbr title="Phone"></abbr>
          (313) 695-5606
          <br>
            <span class="oi oi-envelope-closed"></span>
          <abbr title="Email"></abbr>
          <a href="mailto:#">mabedalj@umich.edu</a>
        </address>
      </div>
    </div>
    <!-- /.row -->

    <div class="row">
      <div class="col-md-4 mb-5">
        <div class="card h-100">
          <img class="card-img-top" src="./assets/i1.jpg" alt="">
          <div class="card-body">
            <h4 class="card-title">How to Run a Successful Barber Shop</h4>
            <p class="card-text">Learn more about some tips that will help you to create the best environment for your clients.</p>
          </div>
          <div class="card-footer">
            <a href="https://www.evergreenbeauty.edu/2012/12/how-to-run-a-successful-barber-shop/" class="btn btn-primary">Find Out More!</a>
          </div>
        </div>
      </div>
      <div class="col-md-4 mb-5">
        <div class="card h-100">
          <img class="card-img-top" src="./assets/i2.jpg" alt="">
          <div class="card-body">
            <h4 class="card-title">How to Pick a Barber</h4>
            <p class="card-text">First time in a barbershop, follow these tips to know if this is the right barbershop for you!</p>
          </div>
          <div class="card-footer">
            <a href="https://www.artofmanliness.com/articles/how-to-pick-a-barber/" class="btn btn-primary">Find Out More!</a>
          </div>
        </div>
      </div>
      <div class="col-md-4 mb-5">
        <div class="card h-100">
          <img class="card-img-top" src="./assets/i4.jpg" alt="">
          <div class="card-body">
            <h4 class="card-title">Tips for barbers</h4>
            <p class="card-text">Best approch to build your clientele.
            </p>
          </div>
          <div class="card-footer">
            <a href="https://behindthechair.com/articles/5-more-tips-that-will-make-you-a-way-better-barber/" class="btn btn-primary">Find Out More!</a>
          </div>
        </div>
      </div>
    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->

  <!-- Footer -->
  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; MahmoudAjawad 2019</p>
    </div>
    <!-- /.container -->
  </footer>
  <script>
    $("#menu-toggle").click(function(e) {
      e.preventDefault();
      $("#wrapper").toggleClass("toggled");
    });
  </script>

</body>

</html>
