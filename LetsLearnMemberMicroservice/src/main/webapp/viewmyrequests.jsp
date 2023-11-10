<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
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
.custom-table .accept-button {
  background-color: green;
  color: white;
  border: none;
  padding: 8px 12px;
  cursor: pointer;
  border-radius: 5px;
}

.custom-table .accept-button:hover {
  background-color: green;
}

  
.centered {
  position: absolute;

  top: 33%;
  left: 50%;
  transform: translate(-50%, -50%);
}
   .login-container {
      height: 550px;
      width: 860px;
      margin: 100px auto;
      margin-bottom: -250px;
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
    .custom-table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 20px;
}

.custom-table th, .custom-table td {
  border: 1px solid ;
  padding: 10px;
  text-align: left;
}

.custom-table th {
  background-color: #f2f2f2;
}

.custom-table .delete-button {
  background-color: #ff6666;
  color: white;
  border: none;
  padding: 8px 12px;
  cursor: pointer;
  border-radius: 5px;
}

.custom-table .delete-button:hover {
  background-color: #ff4d4d;
}

  </style>
  <meta charset="UTF-8">
  <title>Let's learn Delete Employee</title>
  <link rel="stylesheet" href="/member/css/memberhome.css">
  <link rel="shortcut icon" type="image/png" href="/member/images/book.png"/>

</head>
<body>
  <nav>
    <div class="nav-content">
      <div class="logo">
        <a href="memberhome" class="" target="_top"style="color: brown;"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 !
   <img src="/member/images/book.png" width="30px" height="30" />
</a>
      </div>
      <ul class="nav-links">
        <li><a href="memberhome">Home</a></li>
        <li><a href="requestabook">Request a Book</a></li>
        <li><a href="viewallbooks">Find a Book</a></li>
        <li><a href="viewmyrequests">MyRequests</a></li>
        <li><a href="updateprofile">Update Profile</a></li>
        <li><a href="memlogin">Logout</a></li>

      </ul>
    </div>
  </nav>
  
  <section class="home">
    <div class="centered">
        <div class="login-container">
         <h3><font color="green">${message}</font></h3><br>
        
      
            <table class="custom-table">
                <thead>
                  <tr align="center">
                   
                    <th>Requested Book</th>
                    <th>Author</th>
                    <th>Year</th>
                    <th>Publisher</th>
                    <td>Status</td>
                  </tr>
                </thead>
                <tbody>
                <h1 style="color: brown"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 !
   <img src="/member/images/book.png" width="20px" height="20" /> &nbsp;&nbsp;Book Requests Status</h1>
                <c:forEach items="${reqdata}" var="req">
                 
                  <tr>
                    
                    <td>${req.bookName}</td>
                     <td>${req.author}</td>
                    <td>${req.year}</td>
                     <td>${req.publisher}</td>
                    
                   
                  
                    <c:if test="${req.status==true}" >
                     <td bgcolor="green">Approved/Added</td>
                   </c:if>
                   <c:if test="${req.status==false}" >
                   <td bgcolor="red">Pending/Rejected</td>
                  </c:if>
                   </td>
                   
                
</td>
                  </tr>
                  </c:forEach>
                </tbody>
              </table>
      
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
    