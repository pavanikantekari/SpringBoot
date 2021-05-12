<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style='color: red'>${wish}to this page</h1>
	<form action="myHome" method=POST>
		<hr />
		<p>Enter User Name:</p>
		<p>
			<input type=text name=uname>
		</p>
		<p>Enter Password:</p>
		<p>
			<input type=password name=upass>
		</p>
		<p>
			<input type=submit value="validate">
		</p>
	</form>
</body>
</html>