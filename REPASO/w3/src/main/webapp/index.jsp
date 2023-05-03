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
	<title>Lista de Mascotas</title>
	<link rel="stylesheet" type="text/css" href="style.css">
  <script>
    function mostrarInterfaz(tipo) {
      if (tipo === 'canino') {
        document.getElementById('canino').style.display = 'block';
        document.getElementById('felino').style.display = 'none';
      } else if (tipo === 'felino') {
        document.getElementById('canino').style.display = 'none';
        document.getElementById('felino').style.display = 'block';
      }
    }
  </script>
</head>
<body>
  <h1>Rescate de mascotas</h1>
  <form action="MascotasServlet" method="post">
    <h2>Agregar mascota:</h2>
    <label>Tipo:</label>
    <select name="tipo" onchange="mostrarInterfaz(this.value)">
      <option value="canino">Canino</option>
      <option value="felino">Felino</option>
    </select>
    <br>
    <div id="canino" style="display:none">
      <label>Nombre:</label>
      <input type="text" name="nombre">
      <br>
      <label>Raza:</label>
      <input type="text" name="raza">
      <br>
      <label>Color:</label>
      <input type="text" name="color">
      <br>
      <label>Edad:</label>
      <input type="number" name="edad">
      <br>
    </div>
    <div id="felino" style="display:none">
      <label>Nombre:</label>
      <input type="text" name="nombre">
      <br>
      <label>Raza:</label>
      <input type="text" name="raza">
      <br>
      <label>Color:</label>
      <input type="text" name="color">
      <br>
      <label>Edad:</label>
      <input type="number" name="edad">
      <br>
      <label>Comportamiento:</label>
      <input type="text" name="comportamiento">
      <br>
    </div>
    <input type="submit" value="Agregar mascota">
  </form>
  <hr>
	<h1>Lista de Mascotas</h1>
	<table>
		<tr>
			<th>Tipo</th>
			<th>Nombre</th>
			<th>Raza</th>
			<th>Color</th>
			<th>Edad</th>
			<th>Comportamiento (sólo felinos)</th>
		</tr>
		<%
			ArrayList<Mascota> mascotas = (ArrayList<Mascota>) request.getAttribute("mascotas");
			for (Mascota mascota : mascotas) {
				if (mascota instanceof Canino) {
					Canino canino = (Canino) mascota;
    %>
                <tr>
                    <td>Canino</td>
                    <td><%= canino.getNombre() %></td>
                    <td><%= canino.getRaza() %></td>
                    <td><%= canino.getColor() %></td>
                    <td><%= canino.getEdad() %></td>
                    <td></td>
                </tr>
    <%
            } else if (mascota instanceof Felino) {
                Felino felino = (Felino) mascota;
    %>
                <tr>
                    <td>Felino</td>
                    <td><%= felino.getNombre() %></td>
                    <td><%= felino.getRaza() %></td>
                    <td><%= felino.getColor() %></td>
                    <td><%= felino.getEdad() %></td>
                    <td><%= felino.getLibreDeToxoplasmosis() %></td>
                </tr>
    <%
            }
        }
    %>
</table>
