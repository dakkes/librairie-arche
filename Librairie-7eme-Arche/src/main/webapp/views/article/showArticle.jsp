 
 <%@ include file="../shared/header.jsp"%>
<title>${article.titre}</title>
</head>
<body>
	<%@ include file="../shared/nav.jsp"%>
	<div class="singleArticle">
	<h1>${article.titre}</h1>
	
	
	<img src="${ article.image }" alt="${ article.id }">
	 <form action="${pageContext.request.contextPath}/addArticle" method="post">
			<input type=hidden name=id value="${article.id}">
			<button  class="btn btn-success">Ajouter</button> 
			</form>
	
	<ul class="decription" style="text-indent: 20px">
		<li>Prix : ${article.prixUnitaire}<span style="padding-left:10px;">euros</span></li> 
		<li>Stock : ${article.stock}</li> 
		<li>Genre : ${article.genre}</li>
		<li>Auteur : ${article.auteur}</li>
		<li>Format : ${article.format}</li>
		
		
		
	</ul>
</div>
	<%@ include file="../shared/footer.jsp"%>
</body>
</html>

 