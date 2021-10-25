  <%@ include file="../shared/header.jsp"%>
<title>Panier</title>
</head>
<body>
	<%@ include file="../shared/nav.jsp"%>
	  
	<div class="container mt-5">
<div class="card">
<div class="card-header">
	<h1>Panier</h1>
</div>
<div class="card-body">
<table class="table table-striped">
<tr>
<th>ID</th><th>Nom Article</th><th>Quantit�</th><th>Prix</th><th>Total</th><th>Suppression</th><th>Modification</th>
</tr>
	<c:forEach items="${ panier.getLignes() }" var="ligne">
<tr>
 <td>${ ligne.article.id }</td>
<td>${ligne.article.titre }</td>
<td>${ligne.qte}</td>
<td>${ligne.article.prixUnitaire}</td>
<c:set var="total" value="${ligne.qte*ligne.article.prixUnitaire}" />
<td>${total}</td>

<td><a onclick="return confirm('Etes-vous s�r ?')" href="deleteArticle?id=${ligne.article.id }">Supprimer</a></td>
<td><a onclick="return confirm('Etes-vous s�r de vouloir modifier ?')"href="updateArticle?id=${ligne.article.id }">Modifier</a></td>
</tr>
</c:forEach>
</table>
</div>
</div>


 
<div class="mt-2">
<h2>Total T.T.C :</h2>
<input value=" ${panier.prixTotalttc}">
</div> 
<button onclick="return confirm('Vous �tes diriger vers le paiement s�curis� ')"type="button" class="btn btn-success">Payer</button>
 
 </div>	
	 <%@ include file="../shared/footer.jsp"%>
</body>
</html>