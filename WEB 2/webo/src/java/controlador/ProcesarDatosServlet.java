package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


import modelo.Animal;
import modelo.Canino;
import modelo.Felino;

@WebServlet("/ProcesarDatosServlet")
public class ProcesarDatosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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

        request.setAttribute("listaAnimales", listaAnimales);
        request.getRequestDispatcher("mostrar.jsp").forward(request, response);
    }
}
