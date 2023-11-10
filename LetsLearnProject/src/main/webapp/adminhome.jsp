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
   .chart-container {
    display: inline-block;
    width: 250px; /* Set a fixed width */
    height: 250px; /* Set a fixed height */
    text-align: center; /* Align content horizontally at the center */
    margin: 10px;
}
      .statistics-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            margin-top: 50px;
            animation: fallIn 1.5s ease-in-out;
        }
         .statistics-container1 {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            margin-top: 50px;
            animation: fallIn 1.5s ease-in-out;
        }
        @keyframes fallIn {
            0% {
                transform: translateY(-200px);
            }
            100% {
                transform: translateY(0);
            }
        }
        .statistics-box:hover {
            transform: scale(1.1); /* Zoom out the card */
            background-color: #e7c798; /* Change the background color */
        }
        .statistics-box p {
            font-size: 48px;
            margin: 0;
            color: #008000; /* Green color for the number values */
        }
  
 

        .statistics-box {
            flex: 1;
            max-width: 300px;
            background-color: #cad9db;
            padding: 20px;
            margin: 10px;
            box-shadow: 0 5px 10px rgba(163, 157, 157, 0.2);
            text-align: center;
            color: #0a0808;
            border-radius: 10px;
        }
          .statistics-box1 {
            flex: 1;
            max-width: 300px;
            background-color:white;
            padding: 20px;
            margin: 10px;
            box-shadow: 0 5px 10px rgba(163, 157, 157, 0.2);
            text-align: center;
            color: #0a0808;
            border-radius: 10px;
        }

        .statistics-box h2 {
            font-size: 36px;
            margin-bottom: 20px;
        }

        .statistics-box p {
            font-size: 48px;
            margin: 0;
        }
  </style>
  <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
  <meta charset="UTF-8">
  <title>Let's learn Admin Home</title>
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
     <p style="text-align: right;font-size: 15pt">Welcome ${uname}</p>
  
    <br><br><br><br><br>
        <div class="message">
    <div class="input-row">
        <div class="statistics-container1">
            <div class="statistics-box1">
                <div class="chart-container">
                    <canvas id="pieChart"></canvas>
                </div>
            </div>

            <div class="statistics-box1">
                <div class="chart-container">
                    <canvas id="barChart"></canvas>
                </div>
            </div>
        </div>
    </div>
    <!-- Rest of your HTML code -->
</div>
        
        <div class="form-group">
  <div class="statistics-container">
    <div class="statistics-box">
        <h3>Total Members</h3>
        <p id="totalUsersCount">${ccount}</p>
    </div>
   
    <div class="statistics-box">
        <h3>Total Books</h3>
        <p id="totalBooksCount">${bcount}</p>
    </div>
    <div class="statistics-box">
        <h3>Employees </h3>
        <p id="employeesCount">${ecount}</p>
    </div>
  </div></div>
   
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
        // Pie Chart Data
        var acceptedCount = ${bcount};
        var rejectedCount = ${ccount};

        var pieCtx = document.getElementById('pieChart').getContext('2d');
        var pieChart = new Chart(pieCtx, {
            type: 'pie',
            data: {
                labels: ['Book Books', 'Total Members'],
                datasets: [{
                    data: [acceptedCount, rejectedCount],
                    backgroundColor: [
                        'rgba(75, 192, 192, 0.2)',
                        'rgba(255, 99, 132, 0.2)'
                    ],
                    borderColor: [
                        'rgba(75, 192, 192, 1)',
                        'rgba(255, 99, 132, 1)'
                    ],
                    borderWidth: 1
                }]
            },
            options: {
                responsive: true,
                maintainAspectRatio: false,
                aspectRatio: 1, // Set the aspect ratio (width/height) to maintain
            }
        });

        // Bar Chart Data
        var bCount = ${bcount};
        var eCount = ${ecount};
        var mCount = ${ccount};

        var barCtx = document.getElementById('barChart').getContext('2d');
        var barChart = new Chart(barCtx, {
            type: 'bar',
            data: {
                labels: ['Books', 'Employees', 'Members'],
                datasets: [{
                    label: 'Count',
                    data: [bCount, eCount, mCount],
                    backgroundColor: [
                        'rgba(255, 99, 132, 0.2)',
                        'rgba(54, 162, 235, 0.2)',
                        'rgba(255, 206, 86, 0.2)'
                    ],
                    borderColor: [
                        'rgba(255, 99, 132, 1)',
                        'rgba(54, 162, 235, 1)',
                        'rgba(255, 206, 86, 1)'
                    ],
                    borderWidth: 1
                }]
            },
            options: {
                responsive: true,
                maintainAspectRatio: false,
                aspectRatio: 1, // Set the aspect ratio (width/height) to maintain
                scales: {
                    y: {
                        beginAtZero: true
                    }
                }
            }
        });
    </script>
</body>
</html>
