<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c"%> 
    
    <%
  Integer memid = (Integer) session.getAttribute("memid");
  if(memid == null) {
    response.sendRedirect("memlogin");
  }
%>
    
    
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Let's learn Find a Book</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="shortcut icon" type="image/png" href="/images/book.png"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.0/css/all.min.css" rel="stylesheet">
    <style>
        /* Global Styles */
      .pagination {
  display: flex;
  justify-content: center;
  align-items: center;
  margin-bottom: 20px; /* Adjust the margin as needed */
}

.pagination {
  display: flex;
  justify-content: center;
  align-items: center;
  margin-bottom: 20px;
  background-color: white; /* Set the background color to white */
  padding: 10px; /* Add padding to the container */
}

.pagination {
  display: flex;
  justify-content: center;
  align-items: center;
  margin-bottom: 20px;
  padding: 10px; /* Add padding to the container */
}

.pagination a {
  color: black;
  padding: 12px 24px;
  text-decoration: none;
  border: 2px solid #ddd;
  margin: 0 5px;
  background-color: white; /* Set the background color to white for each box */
}

.pagination a.active {
  background-color: #4CAF50;
  color: white;
  border: 2px solid #4CAF50;
}

.pagination a:hover:not(.active) {
  background-color: #ddd;
}

.pagination a:first-child {
  border-top-left-radius: 10px;
  border-bottom-left-radius: 10px;
}

.pagination a:last-child {
  border-top-right-radius: 10px;
  border-bottom-right-radius: 10px;
}

     .searchInput {
        width: 600px;
        height: 40px;
        border-radius: 5px;
        border: 1px solid #ccc; /* Border color and thickness */
        background-color: #f9f9f9; /* Background color */
        color: #333; /* Text color */
        padding: 8px; /* Padding inside the input field */
        font-size: 14px; /* Font size */
        outline: none; /* Remove the outline when input is focused */
    }

    .searchInput::placeholder {
        color: #999; /* Placeholder text color */
    }

        body {
            margin: 0;
            padding: 0;
            overflow-x: hidden;
            font-family: 'Poppins', sans-serif;
            background-color: aliceblue;
        }

        .navbar {
            font-family: 'Poppins', sans-serif;
            background-color: #2B2E4A;
            border-color: #2B2E4A;
        }

        .navbar-nav {
            padding-top: 13.5px;
            padding-bottom: 13.5px;
            font-size: 18px;
        }

        .container-fluid1 {
            background-color: #2B2E4A;
            color: aliceblue;
        }

        nav .navbar-nav li a {
            color: rgb(239, 118, 6) !important;
        }

        /* Navbar Styles for Mobile View */
        @media (max-width: 768px) {
            .navbar {
                background-color: #2B2E4A;
                border-color: #2B2E4A;
                padding: 5px 0;
            }

            .navbar-nav {
                font-size: 14px;
            }

            .navbar-brand .logo-mobile {
                display: none;
            }

            .navbar-collapse {
                max-height: calc(100vh - 55px);
                overflow-y: auto;
            }

            .navbar-brand {
                display: flex;
                align-items: center;
                text-align: center;
                padding: 10px;
            }

            .navbar-toggle {
                float: left;
                margin-left: 15px;
                margin-right: 0;
            }

            .navbar-nav {
                padding-top: 0;
                padding-bottom: 0;
            }

            .navbar-nav li a {
                padding: 10px 20px;
                color: #fff;
            }

            .hide-in-mobile {
                display: none;
            }
        }

        /* Logo and App Name Styles */
        .navbar-brand i {
            margin-right: 5px;
            font-size: 20px;
            color: white;
        }

        .navbar-brand img.desktop-show {
            height: 40px;
            width: auto;
            margin-right: 5px;
        }

    
   
        .product {
            background-color: #fff;
            border: 1px solid #ddd;
            border-radius: 5px;
            padding: 20px;
            margin: 10px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            text-align: center;
            overflow: hidden;
            font-size: medium;
            box-shadow: 0 4px 20px 0 rgba(0, 0, 0, 0.2);
            margin: 8px;
            height: 350px;
            border-radius: 15px;
            width:300px;
            background-color: transparent;
              backdrop-filter: blur(10px);
            
        }

       
    .checked {
    color: gold;
}
    

      
     

        /* Adjust the product listing layout */
        #product-list {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
            padding: 20px;
            margin-top: 100px;
            /* Adjust the margin to separate from the navbar */
        }
  .button {
  display: inline-block;
  padding: 10px 20px;
  font-size: 16px;
  text-align: center;
  text-decoration: none;
  cursor: pointer;
  border: none;
  border-radius: 5px;
  background-color: lightgreen;
}
  @keyframes fallIn {
            0% {
                transform: translateY(-200px);
            }
            100% {
                transform: translateY(0);
            }
        }
        .product:hover {
            transform: scale(1.1); /* Zoom out the card */
            background-color: transparent; /* Change the background color */
        }
    

   
    </style>
      <link rel="stylesheet" href="/css/memberhome.css">
    
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
          <li><a href="memberhome">Home</a></li>
         <li><a href="requestabook">Request a Book</a></li>
        <li><a href="viewallbooks">Find a Book</a></li>
        <li><a href="viewmyrequests">My Requests</a></li>
        <li><a href=updateprofile>Update Profile</a></li>
        <li><a href="memlogout">Logout</a></li>
      </ul>
    </div>
   
  </nav>
    	

      <section class="home">
     <br><br>  <br><br><br><br>

    <form class="navbar-form navbar-left">
        <div class="form-group">
            <label style="color: #FF5733;"><b>Search&nbsp&nbsp</b></label>
            <input type="search" class="searchInput"  id="searchInput" class="form-control" placeholder="Search Book">

            <button class="form-control"  id="searchInput" type="submit"><i
                    class="glyphicon glyphicon-search"></i></button>

        </div>
    </form>

   <%--  <div id="product-list">
      
        <c:forEach items="${bdata}"  var="book"> 
        
        <div class="product">
         
          <h3 style="color: brown" align="left"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 !   <img src="/images/book.png" width="22px" height="22" /></h3>
            <p>Book ID:${book.bid}</p>
            <p>Book Name :</p><h2> ${book.bname}</h2>
            <p> Author:${book.bauthor}</hp>
              <p>Book Publisher : ${book.bpublisher}</p>
            
        <span class="fa fa-star checked"></span>
       <span class="fa fa-star checked"></span>
       <span class="fa fa-star checked"></span>
        <span class="fa fa-star checked"></span>
        <span class="fa fa-star"></span>
            <a href="/download/${book.bname}"><button class="button">Download Here</button></a> 
        </div>
</c:forEach>    
    </div> --%>
    
    <div id="product-list">
    <c:forEach items="${bdata}" var="book">
        <div class="product">
            <h3 style="color: brown" align="left"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 !   <img src="/images/book.png" width="22px" height="22" /></h3>
            <p>Book ID: ${book.bid}</p>
            <p>Book Name: <h2>${book.bname}</h2></p>
            <p>Author: ${book.bauthor}</p>
            <p>Book Publisher: ${book.bpublisher}</p>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star"></span>
            <a href="/download/${book.bname}"><button class="button">Download Here</button></a>
        </div>
    </c:forEach>
</div>

<!-- Pagination links -->
<div class="pagination">
    <c:choose>
        <c:when test="${currentPage > 1}">
            <a href="?page=${currentPage - 1}">&laquo; Previous</a>
        </c:when>
        <c:otherwise>
            <span class="disabled">&laquo; Previous</span>
        </c:otherwise>
    </c:choose>

    <c:forEach begin="1" end="${totalPages}" var="pageNumber">
        <c:choose>
            <c:when test="${pageNumber == currentPage}">
                <a class="active" href="?page=${pageNumber}">${pageNumber}</a>
            </c:when>
            <c:otherwise>
                <a href="?page=${pageNumber}">${pageNumber}</a>
            </c:otherwise>
        </c:choose>
    </c:forEach>

    <c:choose>
        <c:when test="${currentPage < totalPages}">
            <a href="?page=${currentPage + 1}">Next &raquo;</a>
        </c:when>
        <c:otherwise>
            <span class="disabled">Next &raquo;</span>
        </c:otherwise>
    </c:choose>
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
        // Previous JavaScript code for adding to the cart

        const searchInput = document.getElementById('searchInput');
        const products = document.querySelectorAll('.product');

        searchInput.addEventListener('input', function () {
            const searchText = searchInput.value.toLowerCase();

            products.forEach(product => {
                const productName = product.querySelector('h2').textContent.toLowerCase();
                if (productName.includes(searchText)) {
                    product.style.display = 'block';
                } else {
                    product.style.display = 'none';
                }
            });
        });
    </script>
    
</body>

</html>