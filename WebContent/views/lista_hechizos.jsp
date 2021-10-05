<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<%@ include file="/conf/conf.jspf" %>
<link rel="StyleSheet" href="<%=request.getContextPath()%>/css/simplelist.css" type="text/css">
</head>
<body>
	<nav>
		<%@ include file="/views/navs/nav_auth.jspf" %>
	</nav>
	<section>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8" id="mainContent">
				<div class="row">
					<div class="row" id="filters">
						<div>
							<label>Tipo</label>
							<select name="Tipo" id="filterTipo">

							</select>
						</div>
						<div>
							<label>Elemento</label>
							<select name="Elemento" id="filterElemento">

							</select>
						</div>
						<div>
							<label>Procedencia</label>
							<select name="Procedencia" id="filterProcedencia">

							</select>
						</div>
						<div>
							<label>Dificultad</label>
							<select name="Dificultad" id="filterDificultad">

							</select>
						</div>
						<div>
							<label>Nombre: </label>
							<input type="text" id="filterNombre"/> 
						</div>
					</div>
					<div class="row listado">
						<a href="#" class="item">
							<div> 
								<p>Nombre del hechizo</p>
							</div>
							<div> 
								<p>escuela del hechizo</p>
							</div>
							<div> 
								<p>tipo del hechizo</p>
							</div>
							<div class="descripcion"> 
								<p>test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text </p>
							</div>
							<div> 
								<img src="<%=request.getContextPath()%>/assets/mainAssets/placeholder.png" alt="icono del hechizo" loading="lazy" />
							</div>
						</a>
						<a class="item">
							<div> 
								<p>Nombre del hechizo</p>
							</div>
							<div> 
								<p>escuela del hechizo</p>
							</div>
							<div> 
								<p>tipo del hechizo</p>
							</div>
							<div class="descripcion"> 
								<p>test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text </p>
							</div>
							<div> 
								<img src="<%=request.getContextPath()%>/assets/mainAssets/placeholder.png" alt="icono del hechizo" loading="lazy" />
							</div>
						</a>
						<a class="item">
							<div> 
								<p>Nombre del hechizo</p>
							</div>
							<div> 
								<p>escuela del hechizo</p>
							</div>
							<div> 
								<p>tipo del hechizo</p>
							</div>
							<div class="descripcion"> 
								<p>test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text </p>
							</div>
							<div> 
								<img src="<%=request.getContextPath()%>/assets/mainAssets/placeholder.png" alt="icono del hechizo" loading="lazy" />
							</div>
						</a>
						<a class="item">
							<div> 
								<p>Nombre del hechizo</p>
							</div>
							<div> 
								<p>escuela del hechizo</p>
							</div>
							<div> 
								<p>tipo del hechizo</p>
							</div>
							<div class="descripcion"> 
								<p>test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text </p>
							</div>
							<div> 
								<img src="<%=request.getContextPath()%>/assets/mainAssets/placeholder.png" alt="icono del hechizo" loading="lazy" />
							</div>
						</a>
					</div>
				</div>
			</div>
			<div class="col-2"></div>
		</div>
	</section>
</body>
</html>