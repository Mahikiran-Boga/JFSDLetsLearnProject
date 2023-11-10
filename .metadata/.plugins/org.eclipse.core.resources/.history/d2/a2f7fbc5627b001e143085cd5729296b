<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<!-- Designined by CodingLab | www.youtube.com/codinglabyt -->
<html lang="en" dir="ltr">
  <head>
    <style>

      
         .additional-links {
      text-align: center; /* Center-align the content */
      margin-top: 20px; /* Add some top margin */
      margin-left: 0px;
      color: #000000;
    }

  
.centered {
  position: absolute;

  top: 33%;
  left: 50%;
  transform: translate(-50%, -50%);
}
   .login-container {
      
      width: 300px;
      margin: 100px auto;
      padding: 20px;
      background-color: rgba(255, 255, 255, 0.3);
      border-radius: 10px;
      backdrop-filter: blur(10px);
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
    }

    /* Login form */
    .login-form input[type="number"],
    .login-form input[type="password"], .login-form input[type="text"] {
      width: 100%;
      padding: 10px;	
      margin-bottom: 15px;
      border: none;
      border-radius: 5px;
      background-color: rgba(255, 255, 255, 0.8);
      outline: none;
    }
    
    .login-form button[type="submit"] {
      border: none;
    outline: 0;
    display: inline-block;
    padding: 12px;
    color: white;
    background-color:rgb(87, 87, 113);
    text-align: center;
    cursor: pointer;
    width: 100%;
    border-radius: 40px;
    transition: background-color 0.3s ease, transform 0.3s ease;
    }
    
    .login-form button[type="submit"]:hover {
      background-color:rgb(29, 101, 125);/* Change the background color on hover */
    transform: scale(1.05); /* Slightly scale up the button on hover */    }


    @media (max-width: 400px) {
  .login-container {
    width: 80%;
    max-width: 300px;
    margin: 100px auto;
    padding: 20px;
    background-color: rgba(255, 255, 255, 0.9);
    border-radius: 10px;
    backdrop-filter: blur(10px);
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
  }

  /* Login form */
  .login-form input[type="email"],
  .login-form input[type="password"] {
    width: calc(100% - 20px);
    padding: 10px;
    margin-bottom: 15px;
    border: none;
    border-radius: 5px;
    background-color: rgba(255, 255, 255, 0.8);
    outline: none;
  }
  
  .login-form button[type="submit"] {
    border: none;
    outline: none;
    display: inline-block;
    padding: 12px;
    color: white;
    background-color: rgb(87, 87, 113);
    text-align: center;
    cursor: pointer;
    width: calc(100% - 20px);
    border-radius: 40px;
    transition: background-color 0.3s ease, transform 0.3s ease;
  }
  
  .login-form button[type="submit"]:hover {
    background-color: rgb(29, 101, 125);
    transform: scale(1.05);     
  }
}

    </style>
    <meta charset="UTF-8">
    <title> Let's Member learn Login </title>
    <link rel="stylesheet" href="/css/style.css">
    <link rel="shortcut icon" type="image/png" href="/images/book.png"/>

   </head>
<body>
  <nav>


    <div class="nav-content">
      <div class="logo">
        <a href="/" class="" target="_top"style="color: brown;"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 !
   <img src="/images/book.png" width="30px" height="30" />
</a>
      </div>
      <ul class="nav-links">
          <li><a href="home">Home</a></li>
       <li><a href="about">About</a></li>
       <li><a href="newarrivals">New Arrivals </a></li>
          <li><a href="contactus">Contact Us </a></li>
        <li><a href=memlogin>Member Sign In</a></li>
        <li><a href="emplogin">Employee Sign In</a></li>      </ul>
    </div>
  </nav>
  <section class="home"></section>
    



  
   <div class="centered">
       <br><br>
    <br><br>  <br><br>
    <br><br>  <br><br>
    <br><br>
     <div class="login-container">
    <h3 id="errorMessage"><font color="red">${message}</font></h3><br>
     
    <a href="memlogin" class="" target="_top" style="color: darkpink;"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 ! 𝑴𝒆𝒎𝒃𝒆𝒓 𝑳𝒐𝒈𝒊𝒏
   <img src="/images/book.png" width="20px" height="20" /><br>
</a>
    <br>
    <form class="login-form" method="post" action="checkmemlogin">
      <input type="number" placeholder="Enter College ID" name="email" required>
      <input type="password" placeholder="Password" name="password" required>
     
      <img src="captchaImage.jsp" alt="CAPTCHA" /><br>
      <input type="text" id="captcha" name="captcha" placeholder="Enter Captcha" style="width: 110px" required />
      <br>
      <a href="forgotpassword">Forgot Password?</a><br><br>
      <button type="submit">Sign In</button>
    </form>

     <div class="additional-links">
                <a href="memberreg">Not a Member yet?</a><br><br>


      </div>
   </div>

</div>
  <script>
  let nav = document.querySelector("nav");
    window.onscroll = function() {
      if(document.documentElement.scrollTop > 20){
        nav.classList.add("sticky");
      }else {
        nav.classList.remove("sticky");
      }
    }
  </script>
  <script type="text/javascript">
    // Wait for 3 seconds (3000 milliseconds) and then hide the error message
    setTimeout(function() {
        document.getElementById("errorMessage").style.display = "none";
    }, 1000);
</script>

</body>
</html>
    