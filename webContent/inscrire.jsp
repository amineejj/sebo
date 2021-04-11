<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Inscrire</title>
	</head>
	<body>
		<h1> <center><font color="#AA00AA">INSCRIVEZ-VOUS</font></center></h1>
		<form action="accueil.aspx" method="post">
			<div>
					<label>Nom</label>
					<input type="text" name="nom">
			</div>
			<div>
					<label>Prenom</label>
					<input type="text" name="prenom">
			</div>
			<div>
					<label>Adresse</label>
					<input type="text" name="adresse">
			</div>
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