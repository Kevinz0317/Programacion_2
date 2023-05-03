<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="modelo.Mascota" %>
<%@ page import="modelo.Canino" %>
<%@ page import="modelo.Felino" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Registro de Mascotas</title>
</head>
<body>
	<h1>Registro de Mascotas</h1>
	<form method="post" action="procesar.jsp">
		<p><strong>Nombre:</strong> <input type="text" name="nombre"></p>
		<p><strong>Raza:</strong> <input type="text" name="raza"></p>
		<p><strong>Color:</strong> <input type="text" name="color"></p>
		<p><strong>Edad:</strong> <input type="number" name="edad"></p>
		<p><strong>Tipo de animal:</strong> 
			<select name="tipo">
				<option value="canino">Canino</option>
				<option value="felino">Felino</option>
			</select>
		</p>
		<div id="toxoplasmosis" style="display:none">
			<p><strong>¿Está libre de toxoplasmosis?</strong>
				<input type="radio" name="libreDeToxoplasmosis" value="si">Sí
				<input type="radio" name="libreDeToxoplasmosis" value="no">No
			</p>
		</div>
		<div id="entrenamiento" style="display:block">
			<p><strong>Nivel de entrenamiento:</strong> 
				<select name="nivelEntrenamiento">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
				</select>
			</p>
		</div>
		<button type="submit">Enviar</button>
	</form>
	
	<%-- Verificar si existe la lista de animales registrados en la sesión --%>
	<% if (session.getAttribute("listaAnimales") != null) { %>
		<h2>Animales registrados:</h2>
		<table border="1">
			<thead>
				<tr>
					<th>Tipo de animal</th>
					<th>Nombre</th>
					<th>Raza</th>
					<th>Color</th>
					<th>Edad</th>
					<th>Libre de toxoplasmosis</th>
					<th>Nivel de entrenamiento</th>
				</tr>
						</thead>
			<tbody>
			<% for (Mascota animal : (ArrayList<Mascota>)session.getAttribute("listaAnimales")) { %>
				<tr>
					<td><%= animal.getClass().getSimpleName() %></td>
					<td><%= animal.getNombre() %></td>
					<td><%= animal.getRaza() %></td>
					<td><%= animal.getColor() %></td>
					<td><%= animal.getEdad() %></td>
					<td><%= animal.getLibreDeToxoplasmosis() %></td>
					<td><%= animal.getNivelEntrenamiento() %></td>
				</tr>
			<% } %>
			</tbody>
		</table>
	<% } %>
	
	<script>
		// Mostrar u ocultar opciones dependiendo del tipo de animal seleccionado
		var tipoAnimal = document.getElementsByName("tipo")[0];
		var toxoplasmosis = document.getElementById("toxoplasmosis");
		var entrenamiento = document.getElementById("entrenamiento");
		
		tipoAnimal.addEventListener("change", function() {
			if (tipoAnimal.value == "felino") {
				toxoplasmosis.style.display = "block";
				entrenamiento.style.display = "none";
			} else {
				toxoplasmosis.style.display = "none";
				entrenamiento.style.display = "block";
			}
		});
	</script>
</body>
</html>
