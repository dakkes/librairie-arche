 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="../shared/header.jsp"%>
<title>${article.titre}</title>
</head>
<body>
	<%@ include file="../shared/nav.jsp"%>
<body>
	<div class="container mt-5">
		<div class="card-body">
			<form:form action="enregistrerArticle" modelAttribute="article"
				method="post">
				<div class="form-group">
					<form:hidden path="id" class="form-control" />
				</div>
				<div class="form-group">
					<form:label path="titre" class="control-label">Titre</form:label>
					<form:input path="titre" class="form-control" />
				</div>
				<div class="form-group">
					<form:label path="image" class="control-label">Image :</form:label>
					<form:input path="image" class="form-control" />
				</div>
				<div class="form-group">
					<form:label path="prixUnitaire" class="control-label">Prix :</form:label>
					<form:input path="prixUnitaire" class="form-control" />
				</div>
				<div class="form-group">
					<form:label path="stock" class="control-label"> Stock :</form:label>
					<form:input path="stock" class="form-control" />

				</div>
				<div class="form-group">
					<form:label path="titre" class="control-label"> Titre :</form:label>
					<form:input path="titre" class="form-control" />

				</div>
				<div class="form-group">
					<form:label path="format" class="control-label"> Format :</form:label>
					<form:input path="format" class="form-control" />

				</div>
				<div class="form-group">
					<form:label path="genre" class="control-label"> Genre :</form:label>
					<form:input path="genre" class="form-control" />

				</div>
				<div class="form-group">
					<form:label path="auteur" class="control-label"> Auteur :</form:label>
					<form:input path="auteur" class="form-control" />

				</div>
				<div class="form-group">
					<form:label path="isbn" class="control-label"> ISBN :</form:label>
					<form:input path="isbn" class="form-control" />

				</div>
				<div>
					<button type="submit" class="btn btn-primary">Modifier</button>
				</div>
			</form:form>
		</div>
		<br /> <br />

	</div>
	<%@ include file="../shared/footer.jsp"%>
</body>
</html>