package modelo;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class MascotasServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public MascotasServlet() {
        super();
    }

    private final ArrayList<Mascota> mascotas = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tipo = request.getParameter("tipo");
        String nombre = request.getParameter("nombre");
        String raza = request.getParameter("raza");
        String color = request.getParameter("color");
        int edad = Integer.parseInt(request.getParameter("edad"));

        if (tipo.equals("canino")) {
            Canino canino = new Canino(nombre, raza, color, edad);
            mascotas.add(canino);
        } else if (tipo.equals("felino")) {
            boolean libreDeToxoplasmosis = Boolean.parseBoolean(request.getParameter("libreDeToxoplasmosis"));
            Felino felino = new Felino(nombre, raza, color, edad, libreDeToxoplasmosis);
            mascotas.add(felino);
        }

        request.setAttribute("mascotas", mascotas);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

}
