
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Monstruos</title>
<%@ include file="/conf/conf.jspf" %>
<script type="text/javascript" charset="utf-8" src="<%=request.getContextPath()%>/js/monster_js.js"></script>
<link rel="StyleSheet" href="<%=request.getContextPath()%>/css/galerias.css" type="text/css">
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
					<div class="row" id="gallery"> 
						<div class="monsterGalleryItem">
							<div class="nombre">
								<p>Acechador invisible</p>
							</div>
							<div class="marco">
								<img src="https://www.dndbeyond.com/avatars/thumbnails/0/367/1000/1000/636252779159282339.jpeg" alt="Acechador invisible" loading="lazy"/>
							</div>
							<div class="descripcion">
								<p>El acechador invisible es una entidad elemental de otro plano vinculado al aire que, aunque es percibida como un potente golpe de aire, carece de forma física. Suelen invocarlo a la fuerza hechiceros, magos y otros practicantes de magia planar para emplearlo como criado. Estas sensibles entidades trabajan para sus amos mortales a disgusto, limitándose a realizar sus tareas al pie de la letra o retorciéndolas si no han sido enunciadas con cuidado. No son pocos los magos que han acabado muertos al ordenar en un momento de apuro a su rencoroso acechador invisible que lo pusiese a salvo. </p>
							</div>
						</div>
						<div class="monsterGalleryItem">
							<div class="nombre">
								<p>Esto es un nombre</p>
							</div>
							<div class="marco">
							</div>
							<div class="descripcion">
								<p>test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text test text  </p>
							</div>
						</div>
						<div class="monsterGalleryItem">
							<div class="nombre">
								<p>Esto es un nombre</p>
							</div>
							<div class="marco">
							</div>
							<div class="descripcion">
								<p></p>
							</div>
						</div>
						<div class="monsterGalleryItem">
							<div class="nombre">
								<p>Esto es un nombre</p>
							</div>
							<div class="marco">
							</div>
							<div class="descripcion">
								<p></p>
							</div>
						</div>
						<div class="monsterGalleryItem">
							<div class="nombre">
								<p>Esto es un nombre</p>
							</div>
							<div class="marco">
							</div>
							<div class="descripcion">
								<p></p>
							</div>
						</div>

					</div>
				</div>
			</div>
			<div class="col-2"></div>
		</div>
	</section>
</body>
</html>