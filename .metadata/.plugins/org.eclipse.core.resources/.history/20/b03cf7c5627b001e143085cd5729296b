<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
  <style>
     body {
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
      background-color: #eee;
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


    .additional-links {
      text-align: center;
      margin-top: 20px;
      color: #000000;
    }

    .centered {
      position: absolute;
      top: 62%;
      left: 50%;
      transform: translate(-50%, -50%);
    }

    .login-container {
      width: 350px;
      margin: 100px auto;
      padding: 20px;
      background-color: rgba(255, 255, 255, 0.3);
      border-radius: 10px;
      backdrop-filter: blur(10px);
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
    }
    .login-form label {
  margin-bottom: 5px; /* You can adjust this value as needed */
}
.login-form .form-group {
  margin-bottom: 15px; /* You can adjust this value as needed */
}


    .login-form input[type="password"]  input[type="text"],
    input[type="date"], input[type="text"],input[type="email"],
    input[type="number"]{
      width: 100%;
      margin-bottom: -15px;
      padding:10px;
      border: none;
      border-radius: 5px;
      background-color: rgba(255, 255, 255, 0.8);
      outline: none;
    }
  .login-form input[type="file"]::-webkit-file-upload-button {
    background-color: 	black;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

.login-form input[type="file"]::-webkit-file-upload-button:hover {
    background-color: grey;
}
  


 
  </style>
  <meta charset="UTF-8">
  <title>Let's learn Contact Us</title>
  <link rel="stylesheet" href="/css/style.css">
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
           <li><a href="home">Home</a></li>
       <li><a href="about">About</a></li>
       <li><a href="newarrivals">New Arrivals </a></li>
          <li><a href="contactus">Contact Us </a></li>
   <li><a href="memlogin">Member Sign In</a></li>
        <li><a href="emplogin">Employee Sign In</a></li>

      </ul>
    </div>
  </nav>
  <section class="home"></section>
 
  <div class="centered">
    <div class="login-container">
     <a href="contactus" class="" target="_top" style="color: darkpink;"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 ! 𝑪𝒐𝒏𝒕𝒂𝒄𝒕 𝑼𝒔
   <img src="/images/book.png" width="20px" height="20" /><br>
</a>
       <h3><font color="green">${message}</font></h3><br>
      <h1>Contact Us</h1>
      <br>
      <form class="login-form" method="get" enctype="multipart/form-data" action="contactus">
        <div class="input-row">
          
          <div class="form-group">
            <label for="bookName">Full name:</label>
            <input type="text" id="name"  name="name" required>
        </div>
       
          <div class="form-group">
            <label for="year">Email:</label>
            <input type="email" id="email" name="email" required>
          </div>
           </div>
            <div class="input-row">
           <div class="form-group">
            <label for="author">Message:</label>
            <br>
           <textarea id="message" name="message" style="width: 300px; height: 100px;"  required></textarea>
          </div>
       
        
        </div>
        <br>
         
        <button type="submit">Send</button>
      </form>
    </div>
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
