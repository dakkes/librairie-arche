 
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<!-- Brand -->


	<!-- Links -->
	<ul class="navbar-nav">
		<li class="nav-item"><a class="nav-link" style="color: orange"
			href="/arche" style="color:orange">HOME</a></li>
			<li class="nav-item"><a class="nav-link" style="color: orange"
			href="${pageContext.request.contextPath}/showArticles" style="color:orange">Articles</a></li>

		<!-- Dropdown -->
		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			href="#" id="navbardrop" data-toggle="dropdown"> Owner </a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="${pageContext.request.contextPath}/ListeArticles">Liste</a> 
				<a class="dropdown-item" href="${pageContext.request.contextPath}/showCreate">Responsable</a>
			</div></li>
	</ul>

	<ul class="navbar-nav ml-auto">
		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			href="#" id="navbardrop" data-toggle="dropdown"> <span></span>
		</a>

			<div class="dropdown-menu">
				<a href="connexion" class="dropdown-item">login</a> <a
					class="dropdown-item">logout</a> <a class="dropdown-item" href="arche">Profile</a>
			</div></li>
	</ul>

	<a class="fas fa-shopping-cart" style="color: #ff7a00"
		href="showPanier"></a>
</nav>


<h1 class="titre">
	LIBRAIRIE -7- EME-ARCHE<span class="orange">.</span>
</h1>
<h2 class="sousTitre">LIBRAIRIE EN LIGNE DE VENTE DE LIVRE DE
	CINEMA</h2>
 