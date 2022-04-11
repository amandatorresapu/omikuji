<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <!-- c:out ; c:forEach ; c:if -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   <!-- Formatting (like dates) -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
   <!-- form:form -->
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
   <!-- for rendering errors on PUT routes -->
 <%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title Here</title>
  <!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
      rel="stylesheet" 
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
      crossorigin="anonymous">

</head>
<body>
    <div class="container"> <!-- Beginning of Container -->
        <h1>This is index.jsp</h1>
        
        <h3>Login</h3>
    <form action='/login' method='POST'>
	<label>Pick any Number:</label>
    	<input type="text" name='number'>
    <label>Enter the name of any city:</label>
    	<input type="text" name='city'>
    <label>Enter the name of any real person:</label>
    	<input type="text" name='person'>
    <label>Enter professional endeavor or hobby:</label>
    	<input type="text" name='hobby'>
    <label>Enter any type of living thing:</label>
    	<input type="text" name='thing'>
	<label>Say something nice to someone:</label>
    	<input type='text' name='words'>
    	<input type='submit' value='login'>
    </form>
        
    </div> <!-- End of Container -->
</body>
</html>