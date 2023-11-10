<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
.delete-container {
    width: 100%;
    max-width: 400px;
    margin: 0 auto;
    padding: 20px;
    background-color: rgba(255, 255, 255, 0.8);
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
    text-align: center;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
}



.delete-container h1 {
    font-size: 24px;
    margin-bottom: 20px;
    color: rgb(87, 87, 113);
}

.input-group {
    margin-bottom: 20px;
}

.input-group label {
    display: block;
    margin-bottom: 5px;
    color: black;
}

.input-group input[type="text"] {
    width: 100%;
    padding: 10px;
    font-size: 16px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

.delete-button {
    border: none;
    outline: 0;
    display: inline-block;
    padding: 12px 24px;
    color: white;
    background-color: rgb(87, 87, 113);
    text-align: center;
    cursor: pointer;
    border-radius: 5px;
    transition: background-color 0.3s ease, transform 0.3s ease;
}

.delete-button:hover {
    background-color: rgb(29, 101, 125);
    transform: scale(1.05);
}

.success-message {
    color: green;
    font-weight: bold;
    margin-top: 10px;
}


  </style>
  <meta charset="UTF-8">
  <title>Let's learn Delete Member</title>
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
 
      
            <div class="delete-container">
                   <h3><font color="green">${message}</font></h3><br>
            
                <h1>Remove Member</h1>
                <form id="deleteForm" action="delete" method="post" onsubmit="return confirm('Are you sure you want to delete this member?');">
                    <div class="input-group">
                        <label for="employeeId"> Enter Member ID:</label>
                        <input type="text" id="employeeId" name="employeeId"  pattern="^(18|19|20|21|22|23)000(30|31|32)([0-9]{3})$" title="Invalid College ID" required>
                    </div>
                    <button type="submit" class="delete-button">Delete</button>
                </form>
               
            </div>
      
    

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
  <script>
  document.getElementById("deleteForm").onsubmit = function() {
	    return confirm("Are you sure you want to delete this member?");
	};

  
  </script>
</body>
</html>
