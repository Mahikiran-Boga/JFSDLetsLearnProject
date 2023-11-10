<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <style>
  /* Add this CSS to style the avatar selection */
  #togglePassword {
    position: right;
    top: 50%;
    right: 40px;
    transform: translateY(-50%);
    cursor: pointer;
}
.input-with-icon {
    display: flex;
    align-items: center;
}

.input-with-icon input[type="password"] {
    flex: 1;
    padding-right: 30px; /* Adjust the value as needed to leave space for the icon */
}

.input-with-icon #togglePassword {
    cursor: pointer;
    /* Adjust the value to move the icon to the right */
}
  
  
.avatar-container {
  margin-bottom: 20px;
  
}
input[readonly] 
{
            background-color: #f0f0f0; /* Gray background color */
            color: #555; /* Gray text color */
            cursor: not-allowed; /* Change cursor to indicate it's not editable */
}

.avatar-container label {
  display: block;
  margin-bottom: 5px;
  color: black;
}

.avatar-container input[type="file"] {
  width: 100%;
  margin-bottom: 10px;
}

#preview-avatar {
  display: block;
}

/* Rest of your CSS styles... */
  
    .form-group {
      margin-bottom: 20px;
    }

    label {
      display: block;
      margin-bottom: 5px;
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

    input[type="text"],
    input[type="date"],
    input[type="number"],
    input[type="email"],
    select,
    textarea,
    input[type="password"] {
      width: 100%;

      padding: 10px;
      font-size: 16px;
      border: 1px solid #ccc;
      border-radius: 4px;
      margin-bottom: 10px;
    }

    .login-form button[type="submit"] {
      border: none;
      outline: 0;
      display: inline-block;
      padding: 12px;
      color: white;
      background-color: rgb(87, 87, 113);
      text-align: center;
      cursor: pointer;
      width: 100%;
      border-radius: 40px;
      transition: background-color 0.3s ease, transform 0.3s ease;
    }

    .login-form button[type="submit"]:hover {
      background-color: rgb(29, 101, 125);
      transform: scale(1.05);
    }

    .additional-links {
      text-align: center;
      margin-top: 20px;
      color: #000;
    }

    .centered {
      position: absolute;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
    }


.avatar-container {
    width: 150px; /* Set the desired width */
    height: 150px; /* Set the desired height */
    border-radius: 50%; /* Creates a circular shape */
    overflow: hidden; /* Hides overflowing parts of the image */
    margin: 0 auto; /* Center the avatar horizontally */
    margin-bottom: 20px; /* Add margin at the bottom */
}

.avatar {
    width: 100%;
    height: 100%;
    object-fit: cover; /* Ensures the image covers the container */
    border-radius: 50%; /* Keeps the image circular within the container */
}

/* ... rest of your CSS styles ... */






    .login-container {
      width: 600px;
      padding: 20px;
      height: 720px;
      margin-top: 300px;
      background-color: transparent;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
      text-align: center;
    }

    .login-container h1 {
      font-size: 24px;
      margin-bottom: 20px;
      color: rgb(87, 87, 113);
    }
  </style>
  <meta charset="UTF-8">
  <title> Let's learn Update Profile </title>
  <link rel="stylesheet" href="/css/memberhome.css">
  <link rel="shortcut icon" type="image/png" href="/images/book.png" />
</head>

<body>
  <nav>
    <div class="nav-content">
      <div class="logo">
        <a href="memberhome" class="" target="_top" style="color: brown;"> 𝒍𝒆𝒕'𝒔 𝒍𝒆𝒂𝒓𝒏 ! <img src="/images/book.png" width="30px" height="30" /> </a>
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

  <section class="home"></section>
  <div class="centered">
    <div class="login-container">
      
      <h1 style="color:darkpink ">Let's learn! Update Profile</h1><br>
      
<h3 id="errorMessage"><font color="green">${message}</font></h3><br>

<form class="login-form" method="post" action="update" >
         <div class="avatar-container">
        <img class="avatar" src='displayprofile?id=${memdata.id}' width="20%" height="20%">
    </div>
     
      
        <div class="input-row">
        
          <div class="form-group">
            <label for="name">Full Name:</label>
            <input type="text" id="name" name="name" placeholder="Enter Full Name"  value="${memdata.name}" required>
          </div>
          <div class="form-group">
            <label for="id">Academic ID:</label>
            <input type="number" id="id" name="sid"  placeholder="Enter College ID" value="${memdata.id}" readonly  required>
          </div>
        </div>
        <div class="input-row">
          <div class="form-group">
            <label for="gender">Gender:</label>
             <input type="text" value=" ${memdata.gender}" readonly  required>
          
          </div>
          <div class="form-group">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username"pattern="^[a-zA-Z0-9_]{3,20}$" title="Username contains A-Z, a-z ,0-9 ,_"  placeholder="Must Contain Lowercase Only" value="${memdata.username}" required>
          </div>
        </div>
        <div class="input-row">
          <div class="form-group">
            <label for="phone">Phone:</label>
            <input type="number" id="phone" name="contact" pattern="[6789][0-9]{9}" placeholder="Contact Number" value="${memdata.contactno}" required>
          </div>
          <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="Enter Your Email ID" value="${memdata.email}" readonly required>
          </div>
        </div>
        <div class="input-row">
          <div class="form-group">
            <label for="pwd">Password:</label>
            
            <input type="password" id="pwd" name="pwd" placeholder="Contain atleast one @#$%^&*[0-9]" value="${memdata.password}"   required>
            <i class="fas fa-eye-slash" style="margin-left: 262px;" id="togglePassword"></i>
          </div>
      
        <button type="submit">Update Profile</button>
      </form>
    
    </div>
  </div>

  <script>
    let nav = document.querySelector("nav");
    window.onscroll = function() {
      if (document.documentElement.scrollTop > 20) {
        nav.classList.add("sticky");
      } else {
        nav.classList.remove("sticky");
      }
    }
  </script>
<script type="text/javascript">
    // Wait for 3 seconds (3000 milliseconds) and then hide the error message
    setTimeout(function() {
        document.getElementById("errorMessage").style.display = "none";
    }, 1000);
</script>
<script>
    const passwordInput = document.getElementById('password');
    const togglePasswordButton = document.getElementById('togglePassword');

    togglePasswordButton.addEventListener('click', function () {
        const type = passwordInput.getAttribute('type') === 'password' ? 'text' : 'password';
        passwordInput.setAttribute('type', type);
        togglePasswordButton.classList.toggle('fa-eye-slash');
        togglePasswordButton.classList.toggle('fa-eye');
    });
</script>
</body>

</html>