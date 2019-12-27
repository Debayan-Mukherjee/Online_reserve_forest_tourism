<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="new2.css">
   

  <link rel='stylesheet' type='text/css' href='css/style1.css' />
  <link rel='stylesheet' type='text/css' href='css/print.css' media="print" />
  <script type='text/javascript' src='js/jquery-1.3.2.min.js'></script>
  <script type='text/javascript' src='js/example.js'></script>

</head>

<body>
<div class="container-fluid bg-img-pay">
  <div id="page-wrap">

    <textarea disabled id="header">BOOK YOUR TICKET</textarea>

    <div id="identity">


      <div id="customer">

        <table id="meta">
          
          <tr>
            <td class="meta-head">Date of Booking</td>
            <td><textarea id="date">March 15, 2019</textarea></td>
          </tr>

        </table>

      </div>

      <table id="items">

        <tr>
          <th>Item</th>
          <th>Description</th>
          <th>Unit Cost</th>
          <th>Quantity</th>
          <th>Price</th>
        </tr>
<%
response.setContentType("text/html");   
HttpSession session1 = request.getSession(false);

String email=(String)session1.getAttribute("uname");
String password=(String)session1.getAttribute("uname1");
session1.setMaxInactiveInterval(60);
%>

    <form action="paymentTable" method="get">
        <tr class="item-row">
          <td class="item-name">
            <div class="delete-wpr">Entry Fees<a class="delete" href="javascript:;" title="Remove row">X</a></div>
          </td>
          <td class="description">Child (3 to 12 years)</td>
          <td><textarea disabled class="cost" style="background-color:#ffd7b3">10.00</textarea></td>
          <td><textarea class="qty" name="children">0</textarea></td>
          <td><span class="price">0.0</span></td>
        </tr>

        <tr class="item-row">
          <td class="item-name">
            <div class="delete-wpr">Entry Fees<a class="delete" href="javascript:;" title="Remove row">X</a></div>
          </td>
          <td class="description">Adult (More than 12 years)</td>
          <td><textarea disabled class="cost" style="background-color:#ffd7b3">50.00</textarea></td>
          <td><textarea class="qty" name="adults">1</textarea></td>
          <td><span class="price">50.00</span></td>
        </tr>

        <tr class="item-row">
          <td class="item-name">
            <div class="delete-wpr">Entry Fees<a class="delete" href="javascript:;" title="Remove row">X</a></div>
          </td>
          <td class="description">Foreign Nationals</td>
          <td><textarea disabled class="cost" style="background-color:#ffd7b3">100.00</textarea></td>
          <td><textarea class="qty" name="foreigners">0</textarea></td>
          <td><span class="price">0.0</span></td>
        </tr>

        <tr class="item-row">
          <td class="item-name">
            <div class="delete-wpr">Camera<a class="delete" href="javascript:;" title="Remove row">X</a></div>
          </td>

          <td class="description">Handy-Cam </td>
          <td><textarea disabled class="cost"  style="background-color:#ffd7b3">100.00</textarea></td>
          <td><textarea class="qty"name="handy-cam">0</textarea></td>
          <td><span class="price">0.0</span></td>
        </tr>

        <tr class="item-row">
          <td class="item-name">
            <div class="delete-wpr">Camera<a class="delete" href="javascript:;" title="Remove row">X</a></div>
          </td>

          <td class="description">High-end Video Camera </td>
          <td><textarea disabled class="cost" style="background-color:#ffd7b3">500.00</textarea></td>
          <td><textarea class="qty"name="high-end-video-cam">0</textarea></td>
          <td><span class="price">0.0</span></td>
        </tr>

        <tr class="item-row">
          <td class="item-name">
            <div class="delete-wpr">Camara<a class="delete" href="javascript:;" title="Remove row">X</a></div>
          </td>

          <td class="description">Movie Camera </td>
          <td><textarea disabled class="cost" style="background-color:#ffd7b3">4000.00</textarea></td>
          <td><textarea class="qty" name="movie-camera">0</textarea></td>
          <td><span class="price">0.0</span></td>
        </tr>
          
<!-- </form> -->
  
    <!--    <tr id="hiderow">
          <td colspan="5"><a id="addrow" href="javascript:;" title="Add a row">Add a row</a></td>
        </tr>
-->
        <tr>
          <td colspan="2" class="blank"> </td>
          <td colspan="2" class="total-line">Total</td>
          <td class="total-value">
            <div id="total">50.00</div>
          </td>
        </tr>

      </table>

      <div id="terms">
        <h5>Terms</h5>
        <textarea>Ticket will be valid for 7 days from booking day.</textarea>
      </div>

    </div>
    
 <div class="container-fluid" style="margin-top:40px;margin-bottom:40px">  
 <div id="terms">
        <h5>Extra Facility</h5>
        <textarea>To get free pick and drop facility, please check our facility is available to your nearest station or not</textarea>
      </div>
 <div class="row">
   
      <div class="col-xl-6">
            <select class="custom-select  mb-6">
                  <option selected>Pick up station</option>
                  <option value="volvo">Suri</option>
                  <option value="fiat">Durgapur</option>
                  <option value="audi"> Burdwan</option>
                  <option value="audi">Siliguri</option>
                </select>
          </div> 
               
          <div class="col-xl-6">
                <select class="custom-select  mb-3">
                  <option selected>Drop Station</option>
                 
                  <option value="">Howrah</option>
                  
                </select>
          </div>  
      </div>         
</div>


    <div class="row" style="margin-top:20px;padding-bottom:20px;padding-left:50px;padding-right:30px">
      <div class="col-xl">
        <div class="container_fluid">
      <!--     <form action="/action_page.php">--> 

            <div class="row">
              <div class="col-50">
               
                
                <label for="email"><i class="fa fa-envelope"></i> Email</label>
                <input type="text" id="email" name="email" value=<% out.println(email);%>>
                <label for="cname">Name on Card</label>
                <input type="text" id="cname" name="cardname" value="Debayan Mukherjee">

                <label for="ccnum">Credit card number</label>
                <input type="text" id="ccnum" name="cardnumber" value="1111-2222-3333-4444">
                
                </div>
             

              <div class="col-50">
           
                <label for="fname">Accepted Cards</label>
                <div class="icon-container">
                  <i class="fa fa-cc-visa" style="color:navy;"></i>
                  <i class="fa fa-cc-amex" style="color:blue;"></i>
                  <i class="fa fa-cc-mastercard" style="color:red;"></i>
                  <i class="fa fa-cc-discover" style="color:orange;"></i>
                </div>
                
                
                <label for="expmonth">Exp Month</label>
                <input type="text" id="expmonth" name="expmonth" placeholder="September">
                
                <div class="row">
                  <div class="col-50">
                    <label for="expyear">Exp Year</label>
                    <input type="text" id="expyear" name="expyear" placeholder="2022">
                  </div>
                  <div class="col-50">
                    <label for="cvv">CVV</label>
                    <input type="text" id="cvv" name="cvv" placeholder="352">
                  </div>
                </div>
              </div>

            </div>

            <input type="submit" value="E-ticket generation" class="btn">
          </form>
        </div>
      </div>

    </div>


<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.slim.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"> </script>


</body>

</html>
    