<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>

  <style>
   .book-table th,
.book-table td {
  padding: 10px;
  border: 1px solid #ccc;
  color: #000000; /* Set the text color to black */
}
    .search-container {
      display: flex;
      align-items: center;
     
      margin-bottom: 10px;
      z-index: 1; /* Add a higher z-index to ensure the cards are on top */
    }

    .search-container input[type="number"] {
      padding: 8px;
      border: 1px solid #ccc;
      border-radius: 4px;
      width: 60%;
    }

    .search-container button {
      padding: 8px 12px;
      border: none;
      background-color: #4CAF50;
      color: #fff;
      border-radius: 4px;
      cursor: pointer;
    }
     
      button {
      padding: 8px 12px;
      border: none;
      background-color:red;
      color: white;
      border-radius: 4px;
      cursor: pointer;
    } 
    .form-group {
      margin-bottom: 20px;
    }

    label {
      display: block;
      margin-bottom: 6px;
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

   
    .centered {
      position: absolute;
      top: 45%;
      left: 50%;
      transform: translate(-50%, -50%);
    }

    .login-container {
      height: 250px;
      width: 600px;
      margin: 100px auto;
      margin-bottom: -100px;
      padding: 20px;
      background-color: rgba(255, 255, 255, 0.3);
      border-radius: 10px;
      backdrop-filter: blur(10px);
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
      z-index: 1; /* Add a higher z-index to ensure the cards are on top */
    }

   .book-table {
      width: 100%;
      border-collapse: collapse;
      margin-top: 20px;
      color: #000000;
      z-index: -1; /* Add a higher z-index to ensure the cards are on top */
    }

   

    .book-table img {
      max-width: 100px;
      max-height: 100px;
    }

   

    /* Your additional styles here */
  </style>
  <meta charset="UTF-8">
  <title>Let's learn Remove Book</title>
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
  <br><br>
  <br><br>
  <div class="centered">
    <br><br>
    <br><br>
     <div class="search-container">
        <input type="number" placeholder="Enter Book Id">
        <button class="search-button">Search</button>
      </div>
    <div class="login-container">
      <h1>Remove Book</h1>
      <br>

    
      <!-- Table to display added books -->
      <table class="book-table">
        <thead>
          <tr>
            <th>Book Id</th>
            <th>Book Name</th>
            <th>Year</th>
            <th>Author</th>
            <th>Publisher</th>
            <th>Photo</th>
            <th>Remove Button</th>
            <!-- Add more headers if needed -->
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>123</td>
            <td>Sample Book</td>
            <td>2023-08-20</td>
            <td>John Doe</td>
            <td>CodingLab Publications</td>
            <td><img src="book.jpg" alt="Book Photo"></td>
            <td><button class="delete-button">Delete</button></td>
          </tr>
        </tbody>
      </table>
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
