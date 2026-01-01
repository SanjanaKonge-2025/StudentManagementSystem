<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link 
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body class="bg-light">
<div class="card bg-dark"> 
      <marquee class="text-danger mb-3  fs-1"> 
      ${login_fail}
      </marquee> 
</div> 
 
   <div class="container"> 
    <div class="d-flex justify-content-center align-items-center vh-100"> 
      <div class="card shadow rounded-4 bg-dark" style="width: 22rem;"> 
        <div class="card-body"> 
          <h3 class="card-title text-center mb-3 text-white">Login</h3> 
          <form action="login" method="post"> 
            <!-- Username --> 
            <div class="mb-3"> 
              <label for="username" class="form-label text-white">Username</label> 
              <input type="text" class="form-control" id="username" name= "username" placeholder="Enter username" required> 
			 </div> 
            <!-- Password --> 
            <div class="mb-3"> 
              <label for="password" class="form-label text-white">Password</label> 
              <input type="password" class="form-control" id="password" name="password" placeholder="Enter password" required> 
            </div> 
            <!-- Button --> 
            <div class="d-grid"> 
              <button type="submit" class="btn btn-primary">Login</button> 
            </div> 
          </form> 
        </div> 
      </div> 
    </div> 
  </div> 			
</body>
</html>