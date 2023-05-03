/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import modelo.Animal;
import modelo.Canino;
import modelo.Felino;

/**
 *
 * @author Kevin
 */
public class ProcesarDatosServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProcesarDatosServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProcesarDatosServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
