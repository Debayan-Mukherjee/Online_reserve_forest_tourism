<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Revalia" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Neucha" rel="stylesheet">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
  <link rel="stylesheet" href="css/style3.css">
</head>
<body>
<nav class="navbar navbar-expand-sm  body con_opacity2 sticky-top">
 
  <a class="navbar-brand" href="#"></a>

<ul class="navbar-nav ">
  <li class="nav-item">
    <a class="nav-link yu" style="color:#ff9900"href="Nandankanan_home.html">Home</a>
  </li>
  

 <li class="nav-item dropdown">

        <a class="nav-link dropdown-toggle yu" style="color:#ff9900" href="#" id="navbardrop" data-toggle="dropdown">
          About Us
        </a>
        <div class="dropdown-menu ">
          <a class="dropdown-item " style="color:green" href="nandankanan_history.html">History</a>
          <a class="dropdown-item " style="color:green" href="nandankanan_mission.html">Mission</a>
        </div>
      </li>

  <li class="nav-item dropdown">

    <a class="nav-link dropdown-toggle yu" style="color:#ff9900"href="#" id="navbardrop" data-toggle="dropdown">
      Animal
    </a>
    <div class="dropdown-menu ">
        <form action="newArrival" method="get">
           <a class="dropdown-item " style="color:green" href="newArrival">New Arrival</a>
        </form>
         <form action="newBorn" method="get"> 
          <a class="dropdown-item " style="color:green" href="newBorn">New Born</a>
         </form> 
          <form action="feeding_time" method="get">
          <a class="dropdown-item " style="color:green" href="feeding_time">Feeding time</a>
          </form>
        </div>
  </li>

<li class="nav-item dropdown">

        <a class="nav-link dropdown-toggle yu" style="color:#ff9900" href="#" id="navbardrop" data-toggle="dropdown">
         Conservation
        </a>
        <div class="dropdown-menu ">
          <a class="dropdown-item " style="color:green" href="nandankanan_gharial_breeding.html">Nandankanan gharial breeding</a>
         
        </div>
      </li>

 <a class="navbar-brand" style="color:#ff9900" href="nandankanan_booking.html">
         <img src="images2/ticket.png" alt="logo" style="width:70%;">
       </a>
</ul>
</nav>

 <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.slim.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"> </script>
</body>
</html>