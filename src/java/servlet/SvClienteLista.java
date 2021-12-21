
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Cliente;
import logica.Controladora;
import logica.Persona;


public class SvClienteLista extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        Controladora control = new Controladora();
        List<Cliente> listaClientes = control.traerClientes();
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaClientes", listaClientes);
        response.sendRedirect("listaClientes.jsp");
    }
    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
        
        
    }

        @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
