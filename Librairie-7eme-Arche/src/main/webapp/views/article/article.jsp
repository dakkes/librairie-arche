  <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des Article</title>
</head>
<body>
	<p>
		Bonjour ${ sessionScope.article.nom }, <a href="/addArticle">Cliquer pour ajouter un Article</a>
	</p>
	<h1>Liste des Article</h1>
	<c:forEach items="${ Article }" var="personne">
		<div>
			<c:out value="${article.titre } ${article.genre }${article.format } ${article.auteur }" />
			<a href="deleteArticle/${article.titre } ${article.genre }${article.format } ${article.auteur }">Supprimer</a> <a
				href="editArticle/${article.titre } ${article.genre }${article.format } ${article.auteur }">Modifier</a>
		</div>
	</c:forEach>
</body>
</html>