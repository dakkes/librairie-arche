 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit person</title>
<style>
	.error {
		color: red;
		font-weight: bold;
	}
</style>
</head>
<body>
	<h2>Modifier une personne</h2>
	<form:form method="POST" modelAttribute="personne" action="/editPersonne">
		<div>
			<form:label path="nom">Nom</form:label>
			<form:input path="nom" />
			<form:errors path="nom" cssClass="error"/>
		</div>
		<div>
			<form:label path="prenom">Prénom</form:label>
			<form:input path="prenom" />
			<form:errors path="prenom" cssClass="error"/>
		</div>
		<form:hidden path="num"/>
		<input type="submit" value="Modifier">
	</form:form>
</body>
</html>





 