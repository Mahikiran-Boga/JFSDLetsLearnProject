<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <style>
    .form-group {
      margin-bottom: 20px;
    }

    label {
      display: block;
      margin-bottom: 5px;
      color: black;
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
    input[type="file"]
    {
  width: 100%;

      font-size: 16px;
      border: 1px solid #ccc;
      border-radius: 4px;
      margin-bottom: 10px;
    }

    input[type="text"],
    input[type="date"],
    input[type="number"],
    input[type="email"],
    select,
    textarea,
    input[type="password"] {
      width: 100%;

      padding: 10px;
      font-size: 16px;
      border: 1px solid #ccc;
      border-radius: 4px;
      margin-bottom: 10px;
    }

    .login-form button[type="submit"] {
      border: none;
      outline: 0;
      display: inline-block;
      padding: 12px;
      color: white;
      background-color: rgb(87, 87, 113);
      text-align: center;
      cursor: pointer;
      width: 100%;
      border-radius: 40px;
      transition: background-color 0.3s ease, transform 0.3s ease;
    }

    .login-form button[type="submit"]:hover {
      background-color: rgb(29, 101, 125);
      transform: scale(1.05);
    }

    .additional-links {
      text-align: center;
      margin-top: 20px;
      color: #000;
    }

    .centered {
      position: absolute;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
    }

    .login-container {
      width: 600px;
      padding: 20px;
      height: 500px;
      margin-top: 100px;
      background-color: transparent;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
      text-align: center;
    }

    .login-container h1 {
      font-size: 24px;
      margin-bottom: 20px;
      color: rgb(87, 87, 113);
    }
  </style>
  <meta charset="UTF-8">
  <title> Let's learn Registration </title>
  <link rel="stylesheet" href="/css/style.css">
  <link rel="shortcut icon" type="image/png" href="/images/book.png" />
</head>

<body>
  <nav>
    <div class="nav-content">
      <div class="logo">
        <a href="login" class="" target="_top" style="color: brown;"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 ! <img src="/images/book.png" width="30px" height="30" /> </a>
      </div>
      <ul class="nav-links">
        <li><a href="home">Home</a></li>
        <li><a href="about">About</a></li>
        <li><a href="newarrivals">New Arrivals </a></li>
       <li><a href="memlogin">Member Sign In</a></li>
        <li><a href="emplogin">Employee Sign In</a></li>
      </ul>
    </div>
  </nav>

  <section class="home"></section>
  <div class="centered">
    <div class="login-container">
      
      <h1>Let's learn! Sign Up Now</h1>
      
       <h3><font color="red">${message}</font></h3><br>
      <form class="login-form" method="post" action="register" enctype="multipart/form-data">
        <div class="input-row">
          <div class="form-group">
            <label for="name">Full Name:</label>
            <input type="text" id="name" name="name" placeholder="Enter Full Name" required>
          </div>
          <div class="form-group">
            <label for="id">Academic ID:</label>
            <input type="text" id="id" name="sid"  placeholder="Enter College ID" pattern="^(18|19|20|21|22|23)000(30|31|32)([0-9]{3})$" title="Invalid College ID"  required>
          </div>
        </div>
        <div class="input-row">
          <div class="form-group">
            <label for="gender">Gender:</label>
            <select id="gender" name="gender" required>
              <option value="">--Select Gender--</option>
              <option value="male">Male</option>
              <option value="female">Female</option>
              <option value="other">Other</option>
            </select>
          </div>
          <div class="form-group">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" pattern="^[a-zA-Z0-9_]{3,20}$" title="Username contains A-Z, a-z ,0-9 ,_" placeholder="Must Contain Lowercase Only" required>
          </div>
        </div>
        <div class="input-row">
          <div class="form-group">
            <label for="phone">Phone:</label>
            <input type="text" id="phone" name="contact" pattern="[6789][0-9]{9}" placeholder="Contact Number" required>
          </div>
          <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" pattern=".+@gmail\.com" title="email format must be xxx@gmail.com" placeholder="Enter Your Email ID" required>
          </div>
        </div>
        <div class="input-row">
         <label for="email">Profile:</label>
            <input type="file" id="profile" name="profile" required>
          <div class="form-group">
           
          
        </div>
        <button type="submit">Sign Up</button>
      </form>
     
    </div>
  </div>

  <script>
    let nav = document.querySelector("nav");
    window.onscroll = function() {
      if (document.documentElement.scrollTop > 20) {
        nav.classList.add("sticky");
      } else {
        nav.classList.remove("sticky");
      }
    }
  </script>

</body>

</html>
    