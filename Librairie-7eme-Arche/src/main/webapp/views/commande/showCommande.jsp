 
<%@ include file="../shared/header.jsp"%>
<title>Panier</title>
</head>
<body>
	<%@ include file="../shared/nav.jsp"%>

	<div class="container mt-5">
		<div class="card">
			<div class="card-header">
				<h1>Commande</h1>
			</div>
			<div class="card-body">
				<table class="table table-striped">
					<tr>
						<th>ID</th>
						<th>Date commande</th>
						<th>Total</th>
					</tr>
					<tr>
						<td>${ commande.id }</td>
						<td>${ commande.dateCommande }</td>
						<td>${ commande.prixTotalTtc }</td>
					</tr>
				</table>
			</div>
						<div class="card-body">
				<table class="table table-striped">
					<tr>
						<th>Articles</th>
						<th>Quantité</th>
						<th>Prix unitaire</th>
					</tr>
					<c:forEach items="${ commande.lignes }" var="ligne">
						<tr>
							<td>${ ligne.article.titre }</td>
							<td>${ ligne.quantiteCommandee }</td>
							<td>${ ligne.article.prixUnitaire }</td>


						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<a href="${pageContext.request.contextPath}/showCommandes">Consulter toutes vos commandes</a>

	</div>
	<%@ include file="../shared/footer.jsp"%>
</body>
</html>