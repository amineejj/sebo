<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<h1>Catalogue</h1>
	<form action="." method="get">
		<div>
			<label>Choisisser le genre:</label>
			<select name="genre">
				<option>Jazz</option>
				<option>Pop</option>
				<option>Rap</option>
			</select>
		</div>
		<hr>
		<table>
			<tr>
				<th>reference</th>
				<th>titre</th>
				<th>auteur</th>
				<th>photo</th>
				<th>prix</th>
				<th></th>
			</tr>
			<c:forEach items="${articles}" var="article">  
		      	<tr> 
			        <td><a href="detail.aspx?num=${article.reference}">${article.categorie}${article.reference}</a></td> 
			        <td>${article.titre}</td>  
			        <td>${article.auteur}</td>  
			        <td>${article.photo}</td>  
			        <td>${article.prix}</td>  
			  	</tr> 
		    </c:forEach> 
		</table>
	</form>
</body>
</html>