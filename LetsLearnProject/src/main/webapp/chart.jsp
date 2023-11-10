<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Charts</title>
    <style>
       .chart-container {
    display: inline-block;
    width: 250px; /* Set a fixed width */
    height: 250px; /* Set a fixed height */
    text-align: center; /* Align content horizontally at the center */
    margin: 10px;
}
    </style>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>
<h1>Hello</h1>
<div class="chart-container">
        <canvas id="pieChart"></canvas>
    </div>

    <div class="chart-container">
        <canvas id="barChart"></canvas>
    </div>
    

 <script>
    // Pie Chart Data
    var acceptedCount = 45;
    var rejectedCount = 55;

    var pieCtx = document.getElementById('pieChart').getContext('2d');
    var pieChart = new Chart(pieCtx, {
        type: 'pie',
        data: {
            labels: ['Accepted', 'Rejected'],
            datasets: [{
                data: [acceptedCount, rejectedCount],
                backgroundColor: [
                    'rgba(75, 192, 192, 1)', // Solid color for Accepted
                    'rgba(255, 99, 132, 1)'  // Solid color for Rejected
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
            aspectRatio: 1 // Set the aspect ratio (width/height) to maintain
        }
    });

    // Bar Chart Data
    var bCount = 10;
    var eCount = 20;
    var mCount = 30;

    var barCtx = document.getElementById('barChart').getContext('2d');
    var barChart = new Chart(barCtx, {
        type: 'bar',
        data: {
            labels: ['B Count', 'E Count', 'M Count'],
            datasets: [{
                label: 'Count',
                data: [bCount, eCount, mCount],
                backgroundColor: [
                    'rgba(255, 99, 132, 1)',  // Solid color for B Count
                    'rgba(54, 162, 235, 1)',  // Solid color for E Count
                    'rgba(255, 206, 86, 1)'   // Solid color for M Count
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
