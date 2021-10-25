
<%@ include file="../shared/header.jsp"%>


<%@ include file="../shared/nav.jsp"%>
<h1 class="titreCreation">CREATION ARTICLES</h1>

<div class="container mt-5">
	<div class="card-body">
		<form action="saveArticle" method="post">
			<div class="form-group">
				<label class="control-label">Nom Article :</label> <input
					type="text" name="nomArticle" class="form-control" />
			</div>
			<div class="form-group">
				<label class="control-label">Image : </label> <input type="text"
					name="image" class="form-control" />
			</div>
			<div class="form-group">
				<label class="control-label">prix Article :</label> <input
					type="text" name="prixArticle" class="form-control" />
			</div>
			<div class="form-group">
				<label class="control-label">Stock Article :</label> <input
					type="text" name="stock" class="form-control" />
			</div>
			<div>
				<button type="submit" class="btn btn-primary">Ajouter</button>
			</div>
		</form>
	</div>
	${msg} <br /> <br /><a href="ListeArticles" style="background-color:#A9A9A9;color:#FF4500">Liste Articles</a>
</div>


<%@ include file="../shared/footer.jsp"%>
