package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Cliente;
import logica.Controladora;
import logica.Empleado;
import logica.Persona;

public class SvClienteAlta extends HttpServlet {

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
        Controladora control = new Controladora();
        
        String nombre = request.getParameter("nombre");
        String ape = request.getParameter("apellido");
        String dni = request.getParameter("dni");
        String dir = request.getParameter("direccion");
        //tienes que pasarle el valor del request no el texto fechanac :S
        Date fecha = Controladora.deStringToDate(request.getParameter("fechanac"));
        String nac = request.getParameter("nacionalidad");
        String cel = request.getParameter("celular");
        String email = request.getParameter("email");
        /*
        request.getSession().setAttribute("nombre", nombre);
        request.getSession().setAttribute("apellido", ape);
        request.getSession().setAttribute("dni", dni);
        request.getSession().setAttribute("direccion", dir);
        request.getSession().setAttribute("fecha", fecha);
        request.getSession().setAttribute("nacionalidad", nac);
        request.getSession().setAttribute("celular", cel);
        request.getSession().setAttribute("email", email);
        */
        Persona per = new Persona();
                
        per.setNombre(nombre);
        per.setApellido(ape);
        per.setDni(dni);
        per.setDireccion(dir);
        per.setFechanac(fecha);
        per.setNacionalidad(nac);
        per.setCelular(cel);
        per.setEmail(email);
        
        //Persona per = control.crearPersona(nombre, ape, dni, dir, fecha, nac, cel, email);
        
        Cliente clien = new Cliente();
        clien.setPersona(per);
        
        control.crearCliente(clien);
        response.sendRedirect("menuCliente.jsp");
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
