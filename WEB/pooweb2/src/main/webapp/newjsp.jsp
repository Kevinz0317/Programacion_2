<%@ page import="java.util.ArrayList" %>
<%@ page import="modelo.Animal" %>
<%@ page import="modelo.Canino" %>
<%@ page import="modelo.Felino" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Animales</title>
    </head>
    <body>
        <h2>Animales</h2>
        <table>
            <thead>
                <tr>
                    <th>Tipo</th>
                    <th>Nombre</th>
                    <th>Raza</th>
                    <th>Color</th>
                    <th>Edad</th>
                </tr>
            </thead>
            <tbody>
                <%
                    ArrayList<Animal> listaAnimales = new ArrayList<>();

                    String nombreCanino = request.getParameter("a");
                    String razaCanino = request.getParameter("b");
                    String colorCanino = request.getParameter("c");
                    int edadCanino = Integer.parseInt(request.getParameter("d"));

                    Canino canino = new Canino(nombreCanino, razaCanino, colorCanino, edadCanino);
                    listaAnimales.add(canino);

                    String nombreFelino = request.getParameter("f");
                    String razaFelino = request.getParameter("e");
                    String colorFelino = request.getParameter("l");
                    int edadFelino = Integer.parseInt(request.getParameter("n"));

                    Felino felino = new Felino(nombreFelino, razaFelino, colorFelino, edadFelino);
                    listaAnimales.add(felino);

                    for (Animal animal : listaAnimales) {
                %>
                <tr>
                    <td><%= animal.getClass().getSimpleName() %></td>
                    <td><%= animal.getNombre() %></td>
                    <td><%= animal.getRaza() %></td>
                    <td><%= animal.getColor() %></td>
                    <td><%= animal.getEdad() %></td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </body>
</html>
