 
<%@ include file="../shared/header.jsp"%>
<title>Panier</title>
</head>
<body>
	<%@ include file="../shared/nav.jsp"%>

	<div class="container mt-5">
		<div class="card">
			<div class="card-header">
				<h1>Commandes</h1>
			</div>
			<div class="card-body">
				<table class="table table-striped">
					<tr>
						<th>ID</th>
						<th>Date commande</th>
						<th>Total</th>
					</tr>
					<c:forEach items="${ commandes }" var="commande">
					 
						<tr>
							<td>${ commande.id }</td>
							<td>${ commande.dateCommande }</td>
							<td>${ commande.prixTotalTtc }</td>

					 
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>


	</div>
	<%@ include file="../shared/footer.jsp"%>
</body>
</html>