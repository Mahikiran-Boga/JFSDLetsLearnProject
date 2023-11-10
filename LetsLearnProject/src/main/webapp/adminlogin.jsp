<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <style>
/* CSS */

 
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
    .login-form input[type="email"],
    .login-form input[type="password"] {
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
    <title> Let's learn Login </title>
    <link rel="stylesheet" href="/css/adminstyle.css">
    <link rel="shortcut icon" type="image/png" href="/images/book.png"/>

   </head>
<body>
 


 
  <section class="home"></section>
    
   <div class="centered">
       <br><br>
    <br><br>  <br><br>
    <br><br>  <br><br>
    <br><br>
     <div class="login-container">
    <h3><font color="blue">${message}</font></h3><br>
     
    <h1 style="color: darkpink">𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 Administration </h1><br>
    <br>
    <form class="login-form" method="post" action="checkadminlogin">
      <input type="email" placeholder="Email ID" name="email" required>
      <input type="password" placeholder="Password" name="password" required><br><br>
      <button type="submit">Log In</button>
    </form>

     <div class="additional-links">


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


</body>
</html>
    