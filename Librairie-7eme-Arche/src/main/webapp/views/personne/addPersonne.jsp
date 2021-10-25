
<%@ include file="../shared/header.jsp"%>
<title>Panier</title>
</head>
<body>
	<%@ include file="../shared/nav.jsp"%>
	<h2>Inscription</h2>
	<div class="container mt-5">
		<div class="card-body">
			<form action="addPersonne" method="post">
				<div class="form-group">
					<label class="control-label">Nom Personne :</label> <input
						type="text" name="nom" class="form-control" />
				</div>
				<div class="form-group">
					<label class="control-label">Prénom :</label> <input type="text"
						name="prenom" class="form-control" />
				</div>

				<div>
					<button type="submit" class="btn btn-primary">Ajouter</button>
				</div>
			</form>
		</div>

		<br /> <br />

	</div>

	<%@ include file="../shared/footer.jsp"%>
</body>
</html>
