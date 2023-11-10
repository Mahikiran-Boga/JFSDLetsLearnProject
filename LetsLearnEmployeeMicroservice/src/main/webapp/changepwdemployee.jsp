<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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


    .additional-links {
      text-align: center;
      margin-top: 20px;
      color: #000000;
    }

    .centered {
      position: absolute;
      top: 54%;
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
    width:100%;
    align-items: center;
    border-radius: 40px;
    transition: background-color 0.3s ease, transform 0.3s ease;
    }

    .login-form button[type="submit"]:hover {
      background-color:rgb(29, 101, 125);/* Change the background color on hover */
    transform: scale(1.05); /* Slightly scale up the button on hover */    }
  </style>
  <meta charset="UTF-8">
  <title>Let's learn Change Password</title>
  <link rel="stylesheet" href="/css/empstyle.css">
  <link rel="shortcut icon" type="image/png" href="/images/book.png"/>

</head>
<body>
  <nav>
  <div class="nav-content">
      <div class="logo">
        <a href="employeehome.html" class="" target="_top"style="color: brown;"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 !
   <img src="/images/book.png" width="30px" height="30" />
</a>
      </div>
      <ul class="nav-links">
           <li><a href="employeehome">Home</a></li>
        <li><a href="#">Book Returns</a></li>
        <li><a href="bookbarrows">Book Borrows</a></li>
         <li><a href="addabook">Add Book</a></li>
        <li><a href="deletebook">Remove Book</a></li>
        <li><a href="changepwdemployee">ChangePassword</a></li>

        <li><a href="login">Logout</a></li>
      </ul>
    </div>
  </nav>
  <section class="home"></section>
 
  <div class="centered">
    <div class="login-container">
      <h1>Change Password</h1>
      <br>
      <form class="login-form">
        <input type="password" placeholder="Old Password" required>
        <input type="password" placeholder="New Password" required>
        <input type="password" placeholder="Reenter New Password" required>
        <br><br>
        <button type="submit">Submit</button>
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
    