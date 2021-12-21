package logica;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controladoraPersist = new ControladoraPersistencia();
    
    
    public void crearUsuario(String usuario, String contrasenia){
        Usuario usu = new Usuario();
        
        if (usu.getNom_usuario().equals(usuario) && usu.getContrasenia().equals(contrasenia)) {
            controladoraPersist.altaUsuario(usu);
            
        
        }
        
    }
    
    public static synchronized String dateToString(Date fecha){
       DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return formato.format(fecha);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static synchronized java.util.Date deStringToDate(String fecha){
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return formato.parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Cliente> traerClientes() {
        return controladoraPersist.listaClientes();
    }

    public void eliminarCliente(int id) {
        controladoraPersist.bajaCliente(id);
    }

    public void modificarCliente(Cliente clien) {
        controladoraPersist.modificarCliente(clien);
    }

    public Cliente buscarCliente(int id_cliente) {
        
        return controladoraPersist.buscarCliente(id_cliente);
        
    }

    public Persona crearPersona(String nombre, String ape, String dni, String dir, Date fecha, String nac, String cel, String email) {
        Persona per = new Persona();
                
        per.setNombre(nombre);
        per.setApellido(ape);
        per.setDni(dni);
        per.setDireccion(dir);
        per.setFechanac(fecha);
        per.setNacionalidad(nac);
        per.setCelular(cel);
        per.setEmail(email);
        
        return controladoraPersist.altaPersona(per);
    }
    
    public void crearCliente(Cliente cliente) {
        controladoraPersist.altaCliente(cliente);
    }
    
    public void actualizarCliente(Cliente clien) {
        controladoraPersist.modificarCliente(clien);
    }
   
    
    
  
    

    

    

    
    
}
