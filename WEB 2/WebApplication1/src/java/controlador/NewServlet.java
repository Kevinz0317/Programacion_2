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
import modelo.Acceso;
import modelo.Conector;
import java.sql.ResultSet;


/**
 *
 * @author oscar
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("  <link rel=\"stylesheet\" href=\"newcss.css\">\n");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
        

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            ResultSet res;
            String accion=request.getParameter("accion");
            String nombre="";
            String apellido="";
            int cedula=0;
            int telefono=0;
            Acceso acc=new Acceso();
            acc.conectar();
            
            if(accion.equals("agregar")){
                request.getRequestDispatcher("index.html").forward(request, response);
                nombre=request.getParameter("nombre");
                apellido=request.getParameter("apellido");
                telefono=Integer.parseInt(request.getParameter("telefono"));
                cedula=Integer.parseInt(request.getParameter("cedula"));
                acc.añadir(nombre, apellido, telefono,cedula);
            }
            if(accion.equals("eliminar")){
                int id=Integer.parseInt(request.getParameter("ind"));
                acc.eliminar(id);
                request.getRequestDispatcher("index.html").forward(request, response);

            }  
            if(accion.equals("mostrar")){
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");            
                out.println("<title>Servlet NewServlet</title>");            
                out.println("</head>");
                out.println("<body>");               
                out.println("<h1>Clientes</h1>"); 
                res =  acc.consultarDatos();
                while(res.next()){
                    nombre=res.getString("nombre");
                    apellido=res.getString("apellido");
                    telefono=res.getInt("telefono");
                    cedula=res.getInt("cedula");
                    out.println("<p>"+nombre+" "+apellido+" "+telefono+" "+cedula+"</p><br>");
                }
                acc.desconectar();
                out.println("<form action=\"index.html\" method=\"POST\"> ");
                out.println("<button type=\"submit\" value=\"volver\">Volver</button>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    

