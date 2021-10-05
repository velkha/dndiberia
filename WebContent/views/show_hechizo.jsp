<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<%@ include file="/conf/conf.jspf" %>
<link rel="StyleSheet" href="<%=request.getContextPath()%>/css/characterSheets.css" type="text/css">
</head>
<body>
	<nav>
		<%@ include file="/views/navs/nav_auth.jspf" %>
	</nav>
	<section>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8" id="mainContent">
				<div class="row simpleDetails">
					<div id="nombre"><h1>Nombre del hechizo</h1></div>
					<div id="descripcion">
						<h1>Descripcion</h1>
						<p>Esto es la descripcion del hechizo, un magnifico lugar donde hay mucho textoEsto es la descripcion del hechizo, un magnifico lugar donde hay mucho textoEsto es la descripcion del hechizo, un magnifico lugar donde hay mucho textoEsto es la descripcion del hechizo, un magnifico lugar donde hay mucho textoEsto es la descripcion del hechizo, un magnifico lugar donde hay mucho textoEsto es la descripcion del hechizo, un magnifico lugar donde hay mucho textoEsto es la descripcion del hechizo, un magnifico lugar donde hay mucho textoEsto es la descripcion del hechizo, un magnifico lugar donde hay mucho textoEsto es la descripcion del hechizo, un magnifico lugar donde hay mucho textoEsto es la descripcion del hechizo, un magnifico lugar donde hay mucho textoEsto es la descripcion del hechizo, un magnifico lugar donde hay mucho texto</p>
					</div>
					<div id="marco"><img src="<%=request.getContextPath()%>/assets/mainAssets/placeholder.png" alt="icono del hechizo" loading="lazy" /></div>
					<div id="nvl_hechizo">
						<h1>Nivel</h1>
						<p>53</p>
					</div>
					<div id="escuela">
						<h1>Escuela</h1>
						<p>Evocacion</p>
					</div>
					<div id="tiempo_lanzamiento">
						<h1>Tiempo de Lanzamiento</h1>
						<p>3 acciones</p>
					</div>
					<div id="alcance">
						<h1>Alcance</h1>
						<p>130ft</p>
					</div>
					<div id="objetivo">
						<h1>Objetivo</h1>
						<p>Radio de 15ft</p>
					</div>
					<div id="componentes">
						<h1>Componentes</h1>
						<p>V M S</p>
					</div>
					<div id="tipo">
						<h1>Tipo</h1>
						<p>Ataque</p>
					</div>
					<div id="danio">
						<div id="ataque">
							<h1>Ataque base</h1>
							<p>3d8+3 Necrotico</p>
						</div>
						<div id="ataque_superior">
							<h1>Ataque a nivel superior</h1>
							<p>31d412+4 fuego</p>
						</div>
					</div>
					<div id="descripcion_superior">
						<h1>Descripcion a niveles superiores</h1>
						<p>Esto es la descripcion del hechizo, un magnifico lugar donde hay mucho texto Esto es la descripcion del hechizo, un magnifico lugar donde hay mucho texto Esto es la descripcion del hechizo, un magnifico lugar donde hay mucho texto Esto es la descripcion del hechizo, un magnifico lugar donde hay mucho texto</p>
					</div>
					
				</div>
			</div>
			<div class="col-2"></div>
		</div>
	</section>
</body>
</html>