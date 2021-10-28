 
<%@ include file="../shared/header.jsp"%>
<title>LIBRAIRIE 7 EME ARCHE</title>
</head>
<body>
	<!--header-->
	<%@ include file="../shared/nav.jsp"%>
	<div class='conteneur'>
		<c:forEach items="${ articles }" var="article">
			<div class="imageBody">
				<a href="showArticle/${article.id }"> <img
					src="${ article.image }" alt="${ article.id }">
				</a>
				<h2>${article.titre}</h2>
				<h4>${article.prixUnitaire}<span style="padding-left: 10px;">euros</span>
				</h4>
				<form action="${pageContext.request.contextPath}/addArticle"
					method="post">
					<input type=hidden name=id value="${article.id}">
					<button class="btn btn-success">Ajouter</button>
				</form>

			</div>
		</c:forEach>
	</div>
	<%@ include file="../shared/footer.jsp"%>

</body>
</html>