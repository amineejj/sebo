<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Identifier</title>
	</head>
	<body>
		<h1><center><font color="#AA00AA">Identifiez-vous</font></center></h1>
		<form action="/accueil.aspx" method="post">
			<div>
				<label>E-mail</label>
				<input type="email" name="email">
			</div>
			<div>
				<label>Mot de passe</label>
				<input type="password" name="password">
			</div>
			<input type="submit" value="OK">
		
		</form>
	</body>
</html>