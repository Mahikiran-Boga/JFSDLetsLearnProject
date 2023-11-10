<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%
  Integer empid = (Integer) session.getAttribute("empid");
  if(empid == null) {
    response.sendRedirect("emplogin");
  }
%>

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
    input[type="month"], input[type="text"],
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
  <title>Let's learn Add Book</title>
  <link rel="stylesheet" href="/css/empstyle.css">
  <link rel="shortcut icon" type="image/png" href="/images/book.png"/>

</head>
<body>
  <nav>
    <div class="nav-content">
      <div class="logo">
        <a href="employeehome" class="" target="_top"style="color: brown;"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 !
   <img src="/images/book.png" width="30px" height="30" />
</a>
      </div>
      <ul class="nav-links">
           <li><a href="employeehome">Home</a></li>
        <li><a href="viewallrequests">Book Requests</a></li>
         <li><a href="addabook">Add Book</a></li>
       <li><a href="updateemployee">Update Profile</a></li>
               <li><a href="updatebook">Update Book</a></li>
       

        <li><a href="emplogout">Logout</a></li>
      </ul>
    </div>
  </nav>
  <section class="home"></section>
 
  <div class="centered">
    <div class="login-container">
    
       <h3><font color="green">${message}</font></h3><br>
      <a href="addabook" class="" target="_top" style="color: darkpink;"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 ! 𝑨𝒅𝒅 𝑩𝒐𝒐𝒌
   <img src="/images/book.png" width="20px" height="20" /><br>
</a>
      <br>
      <form class="login-form" method="post" enctype="multipart/form-data" action="upload" onsubmit="return validateFile()">
        <div class="input-row">
          <div class="form-group">
            <label for="bookId">Book ID:</label>
            <input type="number" id="bookId" name="bookId" required>
          </div>
          <div class="form-group">
            <label for="bookName">Book Name:</label>
            <input type="text" id="bookName" name="bookName" required>
          </div>
        </div>
        <div class="input-row">
          <div class="form-group">
            <label for="year">Year:</label>
            <input type="month" id="year" name="year" required>
          </div>
          <div class="form-group">
            <label for="author">Author:</label>
            <input type="text" id="author" name="author" required>
          </div>
        </div>
        <div class="input-row">
          <div class="form-group">
            <label for="publisher">Publisher:</label>
            <input type="text" id="publisher" name="publisher" required>
          </div>
        </div><br>
         <div class="input-row">
          <div class="form-group">
            <label for="file">Book:</label>
            <input type="file" id="book" name="book" accept=".pdf" required>
          </div>
        </div>
        <button type="submit">Add Book</button>
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
   <script>
        function validateFile() {
            var fileInput = document.getElementById('book');
            var filePath = fileInput.value;
            var allowedExtensions = /(\.pdf)$/i;
            
            if (!allowedExtensions.exec(filePath)) {
                alert('Invalid file format. Please select a .pdf file.');
                fileInput.value = ''; // Clear the file input field
                return false;
            }
            return true;
        }
    </script>
</body>
</html>
