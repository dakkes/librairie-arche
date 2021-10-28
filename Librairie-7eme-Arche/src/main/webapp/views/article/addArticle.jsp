  <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Article</title>
<style>
	.error {
		color: red;
		font-weight: bold;
	}
</style>
</head>
<body>
	<h2>Ajouter un nouvelle Article</h2>
	 <form:form method="POST" modelAttribute="article" action="/addArticle">
		<div>
			<form:label path="article">Livre</form:label>
			<form:input path="article" />
			 </div>
			 <div>
			<form:label path="titre">Titre</form:label>
			<form:input path="titre" />
			 </div>
		<div>
			<form:label path="genre">Genre</form:label>
			<form:input path="genre" />
		</div>
		<div>
			<form:label path="format">Format</form:label>
			<form:input path="format" />
			 </div>
			 <div>
			<form:label path="auteur">Auteur</form:label>
			<form:input path="auteur" />
			 </div>
		<form:hidden path="num"/>
		<input type="submit" value="Modifier">
	</form:form>
</body>
</html>