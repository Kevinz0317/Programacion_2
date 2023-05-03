/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Accesox;

/**
 *
 * @author oscar
 */
@WebServlet(name = "Eliminar", urlPatterns = {"/Eliminar"})
public class Eliminar extends HttpServlet {

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
            ResultSet res;
            int cedula=0;
            Accesox acc=new Accesox();
            acc.conectar();
            cedula=Integer.parseInt(request.getParameter("cedula"));
            acc.eliminar(cedula);
           
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");            
                out.println("<title>Eliminado</title>");
                out.println("<link rel=\"stylesheet\" href=\"newcss.css\">");
                out.println("</head>");
                out.println("<body>");               
                out.println("<h1>Cliente eliminado</h1>"); 
                acc.desconectar();
                out.println("<form action=\"index.html\" method=\"POST\"> ");
                out.println("<button type=\"submit\" value=\"volver\">Volver</button>");
                out.println("</form>");
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
        processRequest(request, response);
        try (PrintWriter out = response.getWriter()) {
            ResultSet res;
            int cedula=0;
            Accesox acc=new Accesox();
            acc.conectar();
            cedula=Integer.parseInt(request.getParameter("cedula"));
            acc.eliminar(cedula);
           
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");            
                out.println("<title>Eliminado</title>");
                out.println("<link rel=\"stylesheet\" href=\"newcss.css\">");
                out.println("</head>");
                out.println("<body>");               
                out.println("<h1>Cliente eliminado</h1>"); 
                acc.desconectar();
                out.println("<form action=\"index.html\" method=\"POST\"> ");
                out.println("<button type=\"submit\" value=\"volver\">Volver</button>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");

        }
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
