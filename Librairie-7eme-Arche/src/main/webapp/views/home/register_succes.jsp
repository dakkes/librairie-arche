  <%@ include file="../shared/header.jsp"%>


<%@ include file="../shared/nav.jsp"%>
 <div class="container mt-5">
<div class="card">
<div class="card-header">
<h3 class="register-titre">Enregistrement effectuer avec succées!</h3>
</div>
<div class="card-body">
<table class="table table-striped">
<tr>
<th>Nom :</th><th>Prénom :</th><th>E-Mail :</th><th>Adresse</th><th>Code Postale :</th><th>Ville :</th><th>Password :</th>
<!--<th>Date de naissance :</th>--> 
</tr>

<tr>
<td>${user.name}</td>
<td>${user.firstName}</td>
<td>${user.email}</td> 
<td>${user.adresse}</td>
<td>${user.codePostale}</td>
<td>${user.ville}</td>
<td>${user.password}</td>

<!--<td>${user.birthday}</td>-->

</table>
<button type="button" class="btn btn-secondary"><a href="connexion">CONNEXION</a></button>
</div>

</div>

</div>
   
 
 <%@ include file="../shared/footer.jsp"%>

 