
<%@ include file="../shared/header.jsp"%>


<%@ include file="../shared/nav.jsp"%>

<h1 class="showPersonne">Vos renseignements enregistrer</h1>
<div class="container mt-5">
	<div class="card">
		<div class="card-header">Liste des Personnes</div>
		<div class="card-body">
			<table class="table table-striped">
				<tr>
					<th>Nom</th>
					<th>Prenom</th>
				</tr>
				<c:forEach items="${personnes}" var="personne">
					<tr>
						<td>${ personne.prenom }</td>
						<td>${personne.nom}</td>
						<td><a href="deletePersonne/${ personne.num }">Supprimer</a></td>
						<td><a href="editPersonne/${ personne.num }">Modifier</a></td>

					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>
<p>
	Bonjour Monsieur ou Madame ${ sessionScope.personne.nom }, <a
		href="/">Cliquer pour valider votre inscription</a>
</p>
<%@ include file="../shared/footer.jsp"%>