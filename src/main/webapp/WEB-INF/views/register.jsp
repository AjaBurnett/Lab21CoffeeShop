<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Please fill the form to register!</h1>

<form action="formresults" onsubmit="return validateInfo();">
First Name: <input id = "firstname" type = "text" name="firstname"><br><br>
Last Name: <input id="lastname"  type = "text" name= "lastname"><br><br>
Email: <input type="email" name="email" placeholder="something@whatever.com"><br><br>
Phone Number <input id = "phonenumber" type = "text" name= "phonenumber"><br><br>
Password:  <input id= "pass" type="password" name="pwd" ><br>

<input type = "submit" value= "Register">
</form>

<script src="script.js"></script>

</body>
</html>