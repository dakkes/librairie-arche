
<%@ include file="../shared/header.jsp"%>
<title>Connexion</title>
</head>
<body>
	<%@ include file="../shared/nav.jsp"%>
	<h1 class="connexion">Connexion</h1>
	<div class="container mt-5">
		<div class="card-body">
			<form action="connexion" method="post">
				<div class="form-group">
					<label class="control-label">Email :</label> <input type="text"
						name="email" class="form-control" />
				</div>
				<div class="form-group">
					<label class="control-label">Mot de passe :</label> <input type="password"
						name="password" class="form-control" />
				</div>

				<div>
					<button type="submit" class="btn btn-primary">Connexion</button>
				</div>
			</form>
		</div>

		<br /> <br />

	</div>
	<%@ include file="../shared/footer.jsp"%>
</body>
</html>