
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Cliente;
import logica.Controladora;
import logica.Persona;


public class SvClienteModificar extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(request.getParameter("accion").equalsIgnoreCase("redirect")){
            int id_cliente = Integer.parseInt(request.getParameter("id"));
            Controladora control = new Controladora();
            Cliente clien = control.buscarCliente(id_cliente);
            request.getSession().setAttribute("clienteAModificar", clien); 
            response.sendRedirect("modificarCliente.jsp");
        }
        if(request.getParameter("accion").equalsIgnoreCase("modificar")){
            Controladora control = new Controladora();
            Cliente clien = (Cliente) request.getSession().getAttribute("clienteAModificar");
            
            clien.getPersona().setNombre((String)request.getParameter("nombre"));
            clien.getPersona().setApellido((String)request.getParameter("apellido"));
            clien.getPersona().setDni((String)request.getParameter("dni"));
            clien.getPersona().setDireccion((String)request.getParameter("direccion"));
            clien.getPersona().setFechanac(Controladora.deStringToDate(request.getParameter("fechanac")));
            clien.getPersona().setNacionalidad((String)request.getParameter("nacionalidad"));
            clien.getPersona().setCelular((String)request.getParameter("celular"));
            clien.getPersona().setEmail((String)request.getParameter("email"));
            
            control.actualizarCliente(clien);
            response.sendRedirect("SvClienteLista");
        }
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
        
    }

    
    

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
