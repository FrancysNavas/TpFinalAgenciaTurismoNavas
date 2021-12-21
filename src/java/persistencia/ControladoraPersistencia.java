package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import logica.Empleado;
import logica.Persona;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    PersonaJpaController perJPA = new PersonaJpaController();
    ClienteJpaController clienJPA = new ClienteJpaController();
    EmpleadoJpaController empleJPA = new EmpleadoJpaController();
    UsuarioJpaController usuJPA = new UsuarioJpaController();
    VentaJpaController ventaJPA = new VentaJpaController();
    ServicioTuristicoJpaController servicioJPA = new ServicioTuristicoJpaController();
    PaqueteTuristicoJpaController paqueteJPA = new PaqueteTuristicoJpaController();

    public void altaUsuario(Usuario usu) {
        try {
            usuJPA.create(usu);
        } catch (Exception e) {
        }
    }

    public List<Cliente> listaClientes() {
        
        return clienJPA.findClienteEntities();
    }

    public void bajaCliente(int id) {
        try {
            clienJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarCliente(Cliente clien) {
        try {
            clienJPA.edit(clien);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente buscarCliente(int id_cliente) {
       
        return clienJPA.findCliente(id_cliente);
    }

    public Persona altaPersona(Persona persona) {
        return perJPA.create(persona);
    }

    public void altaCliente(Cliente cliente) {
        clienJPA.create(cliente);
    }
    public void bajaPersona(int id) {
        try {
            perJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

       
    
    
    
}
