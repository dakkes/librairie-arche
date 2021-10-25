
<%@ include file="../shared/header.jsp"%>
<title>${article.titre}</title>
</head>
<body>
	<%@ include file="../shared/nav.jsp"%>
<body>
	<div class="container mt-5">
		<div class="card-body">
			<form action="updateArticle" method="post">
				<div class="form-group">
					<label class="control-label">ID :</label> <input type="text"
						name="idArticle" value="${article.id}" readonly
						class="form-control" />
				</div>
					<div class="form-group">
					<label class="control-label">Titre</label> <input type="text"
						name="titre" value="${article.titre}" class="form-control" />
				</div>
				<div class="form-group">
					<label class="control-label">Image :</label> <input type="text"
						name="imageArticle" value="${article.image}" class="form-control" />
				</div>
				<div class="form-group">
					<label class="control-label">Prix :</label> <input type="text"
						name="prixUnitaire" value="${article.prixUnitaire}"
						class="form-control" />
				</div>
				<div class="form-group">
					<label class="control-label"> Stock :</label> <input type="text"
						name="stock" value="${article.stock}" class="form-control" />

				</div>
				<div>
					<button type="submit" class="btn btn-primary">Modifier</button>
				</div>
			</form>
		</div>
		<br /> <br />

	</div>
	<%@ include file="../shared/footer.jsp"%>
</body>
</html>