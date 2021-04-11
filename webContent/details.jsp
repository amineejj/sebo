<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="margin:60px auto; width: 600px">
		<div>
			<img alt="photo" src="${ article.photo }">
			<input style="margin-left: 200px" type="text" disabled value="${ article.annee }">
		</div>
		<div style="margin-top: 40px;">
			<label>reference:</label>
			<input type="text" disabled value="${ article.categorie }${ article.reference }">
			<label style=" margin-left: 30px">titre:</label>
			<input type="text" disabled value="${ article.titre }">
		</div>
		<div style="margin-top: 20px;">
			<label>auteur:</label>
			<input type="text" disabled value="${ article.auteur }">
			<label style=" margin-left: 30px">editeur:</label>
			<input type="text" disabled value="${ article.editeur }">
		</div>
		<div style="margin-top: 20px;">
			<label>Quantité en stock:</label>
			<input type="text" disabled value="${ article.qteStock }">
			<label style=" margin-left: 30px">prix modique:</label>
			<input type="text" disabled value="${ article.prix }">
		</div>
		<div style="margin: 20px auto; width: 200px">
			<a href="catalogue.aspx">retour</a>
			<a href="" style="margin-left: 20px;">Ajouter au panier</a>
		</div>
	</div>
</body>
</html>