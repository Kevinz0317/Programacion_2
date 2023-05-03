/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Accesox;
import modelo.Conectorx;
import java.sql.ResultSet;

/**
 *
 * @author oscar
 */
@WebServlet(name = "CAcceso", urlPatterns = {"/CAcceso"})
public class CAcceso extends HttpServlet {

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
            ResultSet res;
            String nombre="";
            String apellido="";
            int cedula=0;
            int id=Integer.parseInt(request.getParameter("cedulaid"));
            int telefono=0;
            Accesox acce=new Accesox();
            acce.conectar();
            
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");            
                out.println("<title>Log In</title>");            
                out.println("</head>");
                out.println("<body>");               
                out.println("<h1>Bienvenido</h1>"); 
                res =  acce.consultarDatos(id);
                while(res.next()){
                    nombre=res.getString("nombre");
                    apellido=res.getString("apellido");
                    telefono=res.getInt("telefono");
                    cedula=res.getInt("cedula");
                    out.println("<p>"+nombre+" "+apellido+" "+telefono+" "+cedula+"</p><br>");
                }
                acce.desconectar();
                out.println("<form action=\"index.html\" method=\"POST\"> ");
                out.println("<button type=\"submit\" value=\"volver\">Volver</button>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");
            
        } catch (SQLException ex) {
            Logger.getLogger(Elservlet.class.getName()).log(Level.SEVERE, null, ex);
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
            String nombre="";
            String apellido="";
            int cedula=0;
            int id=Integer.parseInt(request.getParameter("cedulaid"));
            int telefono=0;
            Accesox acce=new Accesox();
            acce.conectar();
            
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");            
                out.println("<title>Log In</title>");  
                out.println("<link rel=\"stylesheet\" href=\"newcss.css\">");
                out.println("</head>");
                out.println("<body>");               
                out.println("<h1>Bienvenido</h1>"); 
                res =  acce.consultarDatos(id);
                while(res.next()){
                    nombre=res.getString("nombre");
                    apellido=res.getString("apellido");
                    telefono=res.getInt("telefono");
                    cedula=res.getInt("cedula");
                    out.println("<p>"+nombre+" "+apellido+" "+telefono+" "+cedula+"</p><br>");
                }
                acce.desconectar();
                out.println("<form action=\"index.html\" method=\"POST\"> ");
                out.println("<button type=\"submit\" value=\"volver\">Volver</button>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");
            
        } catch (SQLException ex) {
            Logger.getLogger(Elservlet.class.getName()).log(Level.SEVERE, null, ex);
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
