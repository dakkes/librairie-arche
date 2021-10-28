 
<%@ include file="../shared/header.jsp"%>


<%@ include file="../shared/nav.jsp"%>
<h1 class="formulaireInscription">Formulaire d'inscription</h1>

<div class="container mt-5">
	<div class="card-body">
		<form action="register" method="post">
			<div class="form-group">
				<label class="control-label">Nom :</label> <input type="text"
					name="name" class="form-control" />
			</div>
			<div class="form-group">
				<label class="control-label">prenom :</label> <input type="text"
					name="firstName" class="form-control" />
			</div>
			<div class="form-group">
				<label class="control-label">E-mail : </label> <input type="text"
					name="email" class="form-control" />
			</div>
			<div class="form-group"id="password">
				<label class="control-label">Password :</label> <input type="password"
					name="password" class="form-control" />
			</div>
			<div class="form-group">
				<label class="control-label">Adresse :</label> <input type="text"
					name="adresse" class="form-control" />
			</div>
			<div class="form-group">
				<label class="control-label">Code Postale :</label> <input type="text"
					name="codePostale" class="form-control" />
			</div>
			 	<div class="form-group">
				<label class="control-label">Ville :</label> <input type="text"
					name="ville" class="form-control" />
			</div>
			<!--  
			<div class="form-group">
				<label class="control-label">Date de naissance (yyyy-mm-dd)
					:</label> <input type="text" name="birthday" class="form-control" />
			</div>
			-->
			 



			<div>
				<button type="submit" class="btn btn-primary" href="register_succes">Ajouter</button>
			</div>
		</form>
	</div>

</div>


<%@ include file="../shared/footer.jsp"%>

 