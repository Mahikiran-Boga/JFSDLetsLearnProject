<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
         <%
  String uname = (String) session.getAttribute("uname");
  if(uname == null) {
    response.sendRedirect("admin");
  }
%>
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
  color:black;
}

.input-row {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
}
.h1{
color:white;

}

.input-row .form-group {
  width: calc(50% - 10px);
}

input[type="text"],
input[type="date"],
input[type="number"],
input[type="email"],
select,
textarea {
  width: 100%;
  padding: 10px;
  font-size: 16px;
  border: 1px solid #ccc;
  border-radius: 4px;
}





         .additional-links {
      text-align: center; /* Center-align the content */
      margin-top: 20px; /* Add some top margin */
      margin-left: 0px;
      color: 000000px;
    }

  
.centered {
  position: absolute;

  top: 33%;
  left: 50%;
  transform: translate(-50%, -50%);
}
   .login-container {
      height: 390px;
      width: 600px;
      margin: 100px auto;
      margin-bottom: -150px;
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
    width:50%;
   align-items: center;
    border-radius: 40px;
    transition: background-color 0.3s ease, transform 0.3s ease;
    }
    
    .login-form button[type="submit"]:hover {
      background-color:rgb(29, 101, 125);/* Change the background color on hover */
    transform: scale(1.05); /* Slightly scale up the button on hover */    }

  </style>
  <meta charset="UTF-8">
  <title>Let's learn Add Member</title>
  <link rel="stylesheet" href="/css/adminstyle.css">
  <link rel="shortcut icon" type="image/png" href="/images/book.png"/>

</head>
<body>
  <nav>
    <div class="nav-content">
      <div class="logo">
        <a href="adminhome" class="" target="_top"style="color: brown;"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 !
   <img src="/images/book.png" width="30px" height="30" />
</a>
      </div>
      <ul class="nav-links">
        <li><a href="adminhome">Home</a></li>
        <li><a href="addemp">Add Employee</a></li>
        <li><a href="adduser">Add Member</a></li>
        <li><a href="viewallemps">Remove Employee</a></li>
        <li><a href="deleteuser">Delete Member</a></li>

        <li><a href="adminlogout">Logout</a></li>
      </ul>
    </div>
  </nav>
  
  <section class="home">
    <div class="centered">
        <div class="login-container">
        <a href="adduser" class="" target="_top" style="color: darkpink;"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 ! 𝑨𝒅𝒅 𝑴𝒆𝒎𝒃𝒆𝒓
   <img src="/images/book.png" width="20px" height="20" /><br>
</a>
           <h3><font color="green">${message}</font></h3><br>
        
            <form class="login-form"  method="post" action="addmember">
            
                <div class="input-row">
                  <div class="form-group">
                    <label for="name">FullName:</label>
                    <input type="text" id="name" name="name" required>
                  </div>
                   <div class="form-group">
                    <label for="name">Academic ID:</label>
                    <input type="number" id="id" name="mid" required>
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
                    <label for="address">Username:</label>
                    <input type="text" id="phone" name="username" required>
        
                    
                  </div>
                </div>
                <div class="input-row">
                  <div class="form-group">
                    <label for="phone">Phone:</label>
                    <input type="number" id="phone" name="contactno" required>
                  </div>
                     <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email" required>
                  </div>
                </div>
               
             
              <button type="submit">Add Member</button>
            </form>
    </div></div>

</section>
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
    