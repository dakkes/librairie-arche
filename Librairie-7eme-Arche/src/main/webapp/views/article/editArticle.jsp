 
<%@ include file="../shared/header.jsp"%>
<title>LIBRAIRIE 7 EME ARCHE</title>
</head>
<body>
	<!--header-->
	<%@ include file="../shared/nav.jsp"%>



	<form action="updateArticle" method="post">
		<pre>
	id : <input type="text" name="idProduit" value="${article.idArticle}">
	nom Article :<input type="text" name="nomProduit"value="${article.titreArticle}">
	 

<input type="submit" value="Modifier">
</pre>
	</form>
	<br />
	<br />
	<a href="showPanier">Panier</a>
	<%@ include file="../shared/footer.jsp"%>

</body>
</html>