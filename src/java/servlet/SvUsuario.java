package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;

//WebServlet-No es necesario si esta en el web.xml 
//@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String contra = request.getParameter("pass");
        
        //Controladora control = new Controladora();
        /*
        boolean autorizado = control.verificarUsuario(usuario, contra);
        
        if (autorizado == true) {
            //obtengo la sesio y le asigno el usuario y la contra para validar
        */
            HttpSession misesion = request.getSession(true);
            misesion.setAttribute("usuario", usuario);
            misesion.setAttribute("contra", contra);
            
            if (usuario == null) {
                response.sendRedirect("index.jsp");
            } else if (usuario.equals("admin") && contra.equals("1234")) {
                response.sendRedirect("menu.jsp");
            } else {
                response.sendRedirect("index.jsp");
            }
                        
       // } else {
        //    response.sendRedirect("index.jsp");
        //}
        
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
