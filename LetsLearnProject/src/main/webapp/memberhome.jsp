<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%
  Integer memid = (Integer) session.getAttribute("memid");
  if(memid == null) {
    response.sendRedirect("memlogin");
  }
%>
    
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>

  <style>

    .search-container {
      display: flex;
      align-items: center;
      margin-bottom: 300px;
      width: 750px;
    }

    .search-container input[type="text"] {
      padding: 8px;
      border: 1px solid #ccc;
      border-radius:10px;
      width:100%;
      padding: 12px 12px;
      font-size: 40px;

    }

    .search-container button {
      padding: 12px 12px;
      border: none;
      background-color: #4CAF50;
      color: #fff;
      border-radius: 4px;
      cursor: pointer;
      font-size: 40px;

    }
     
      
    .form-group {
      margin-bottom: 20px;
    }

    .input-row {
      display: flex;
      flex-wrap: wrap;
      justify-content: space-between;
    }

    .h1 {
      color: white;
    }

    .input-row .form-group {
      width: calc(50% - 10px);
    }
    
   
    .centered {
      position: absolute;
      top: 45%;
      left: 50%;
      transform: translate(-50%, -50%);
    }

   

    .message p {
  font-size: 30px; /* Adjust the font size as needed */
  text-align: center;
  animation: slideIn 1.5s ease-in-out forwards;
}

@keyframes slideIn {
  0% {
    opacity: 0;
    transform: translateY(-20px);
  }
  100% {
    opacity: 1;
    transform: translateY(0);
  }
}





    /* Your additional styles here */
  </style>
  <meta charset="UTF-8">
  <title>Let's learn Member Home</title>
  <link rel="stylesheet" href="/css/memberhome.css">
  <link rel="stylesheet" href="/css/bookcategories.css">
  <link rel="shortcut icon" type="image/png" href="/images/book.png"/>


  

</head>
<body>
  <nav>
    <div class="nav-content">
      <div class="logo">
        <a href="memberhome" class="" target="_top"style="color: brown;"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 !
   <img src="/images/book.png" width="30px" height="30" />
</a>
      </div>
      <ul class="nav-links">
        <li><a href="memberhome">Home</a></li>
        <li><a href="requestabook">Request a Book</a></li>
        <li><a href="viewallbooks">Find a Book</a></li>
        <li><a href="viewmyrequests">MyRequests</a></li>
        <li><a href="updateprofile">Update Profile</a></li>
        <li><a href="memlogout">Logout</a></li>
      
      </ul>
    </div>
  </nav>
  <section class="home"></section>
  <br><br>
  <br><br>
  <div class="centered">
       <br><br>
    <br><br>
    
   <p style="text-align: center;font-size: 15pt"> </p>

    <h1 style="font-size:3vw;"> <font color="black">𝑯𝒆𝒍𝒍𝒐 ${memuname} 😊 !!
                       𝑳𝒆𝒕'𝒔 𝑺𝒕𝒂𝒓𝒕 𝑳𝒆𝒂𝒓𝒏𝒊𝒏𝒈 𝑯𝒆𝒓𝒆 !!..</font></h1>
   </div>
  


    <br><br>
    <br><br>

</div>

  
     
  <script>
    let nav = document.querySelector("nav");
    window.onscroll = function() {
      if(document.documentElement.scrollTop > 20){
        nav.classList.add("sticky");
      } else {
        nav.classList.remove("sticky");
      }
    }
  </script>
</body>
</html>
