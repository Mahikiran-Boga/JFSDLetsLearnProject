<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
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
.custom-table .accept-button {
  background-color: green;
  color: white;
  border: none;
  
  padding: 8px 18px;
  cursor: pointer;
  border-radius: 5px;
}

.custom-table .accept-button:hover {
  background-color: green;
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
      height: 430px;
      width: 1020px;
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
    .custom-table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 20px;
}

.custom-table th, .custom-table td {
  border: 1px solid #ccc;
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
        <a href="viewallemps" class="" target="_top" style="color: darkpink;"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 ! 𝑹𝒆𝒎𝒐𝒗𝒆 𝑬𝒎𝒑𝒍𝒐𝒚𝒆𝒆
   <img src="/images/book.png" width="20px" height="20" /><br>
</a>
         <h3><font color="green">${message}</font></h3><br>
        
      
            <table class="custom-table">
                <thead>
                  <tr>
                    <th>Full Name</th>
                    <th>Date Joined</th>
                    <th>Gender</th>
                    <th>Username</th>
                    <th>Phone</th>
                    <th>Email</th>
                    <th>Access</th>
                    <th>Grant Access</th>
                    <th>Remove Access</th>
                  </tr>
                </thead>
                <tbody>
                <c:forEach items="${emplist}" var="emp">
                 
                  <tr>
                    <td>${emp.name}</td>
                    <td>${emp.joinedDate}</td>
                    <td>${emp.gender}</td>
                    <td>${emp.username}</td>
                    <td>${emp.contact}</td>
                    <td>${emp.email}</td>
                   
                       <c:if test="${emp.status==true}" >
                     <td bgcolor="green">Granted</td>
                   </c:if>
                   <c:if test="${emp.status==false}" >
                   <td bgcolor="red">Removed</td>
                  </c:if>
                    
                 
                     <td><a href="empaction?employee_id=${emp.id}&employee_status=true"><button class="accept-button" style="font-weight: bold; color: black;" >Grant Access</button></a></td>
                   <td> <a href="empaction?employee_id=${emp.id}&employee_status=false"><button class="delete-button" >Remove Access</button></a>
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
    