<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%
  String empuname = (String)session.getAttribute("empuname");
  if(empuname == null) {
    response.sendRedirect("emplogin");
  }
%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title> Let's learn Employee Home </title>

    <link rel="stylesheet" href="/css/empstyle.css">
    <link rel="shortcut icon" type="image/png" href="/images/book.png"/>

    <style>
  .centered {
  position: absolute;

  top: 33%;
  left: 50%;
  transform: translate(-50%, -50%);
}
body{
  height: 104vh;
}

    </style>

   </head>
<body>

  <nav>
    <div class="nav-content">
      <div class="logo">
        <a href="employeehome" class="" target="_top" style="color: brown;"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 !
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
       <br><br>
    <br><br>
    
   <p style="text-align: center;font-size: 15pt">Welcome ${empuname}</p>

    <h1 style="font-size:3vw;"> <font color="black">𝑯𝒆𝒍𝒍𝒐 𝑳𝒊𝒃𝒓𝒂𝒓𝒊𝒂𝒏 !<br>
                       𝑳𝒆𝒕'𝒔 𝑴𝒂𝒌𝒆 𝒂 𝑫𝒂𝒚 𝑪𝒐𝒖𝒏𝒕 !...</font></h1>
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
    