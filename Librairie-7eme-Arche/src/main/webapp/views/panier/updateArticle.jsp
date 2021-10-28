 
<%@ include file="../shared/header.jsp"%>
<title>LIBRAIRIE 7 EME ARCHE</title>
</head>
<body>
	<!--header-->
	<%@ include file="../shared/nav.jsp"%>
	<div class="container">
		<div class="card-body">
			<form action="updateArticle" method="post">
				<div class="form-group">
					<label class="control-label">ID Article :</label> <input
						type="text" name="idArticle" value="${article.id}" readonly
						class="form-control" />
				</div>
				<div class="form-group">
					<label class="control-label">Titre Article :</label> <input
						type="text" name="titre" value="${article.titre}" readonly
						class="form-control" />
				</div>
				<div class="form-group">
					<label class="control-label">Image :</label> <input type="text"
						name="image" value="${article.image}" class="form-control" />
				</div>

				<div class="form-group">
					<label class="control-label">Prix Article :</label> <input
						type="text" name="prixArticle" value="${article.prixUnitaire}"
						class="form-control" />
				</div>
				<div class="form-group">
					<label class="control-label">Stock Article :</label> <input
						type="text" name="stockArticle" value="${article.stock}"
						class="form-control" />
				</div>
				<div>
					<button type="submit" class="btn btn-primary">Modifier</button>
				</div>
			</form>
		</div>
		<br /> <br /> <a href="ListeArticle">Liste Article</a>
	</div>






</body>
</html>