 <%@ include file="../shared/header.jsp"%>


<%@ include file="../shared/nav.jsp"%>
 <div class="container mt-5">
<div class="card">
<div class="card-header">
Liste des Articles
</div>
<div class="card-body">
<table class="table table-striped">
<tr>
<th>ID</th><th>Titre</th><th>Image</th><th>Prix</th><th>Stock</th> 
</tr>
<c:forEach items="${articles}" var="a">
<tr>
<td>${ a.id }</td>
<td>${ a.titre }</td>
<td>${a.image}</td>
<td> ${a.prixUnitaire}</td>
<td>${a.stock }</td>
 <td><a onclick="return confirm('Etes-vous sûr ?')" href="supprimerArticle?id=${a.id }">Supprimer</a></td>
 <td><a href="modifierArticle?id=${a.id }">Edit</a></td>
</tr>
</c:forEach>
</table>
</div>
</div>
</div>
 <%@ include file="../shared/footer.jsp"%>