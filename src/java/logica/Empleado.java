package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Empleado implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_empleado;
    @Basic
    private String cargo;
    private double sueldo;
    
    @OneToOne
    Usuario user; //se refleja la relacion mediante un objeto
    @OneToMany//relacion 1 a n con venta
    private List<Venta> listaVentas; //se refleja mediante collections
    //@JoinColumn(name = "ID_PERSONA")
    @OneToOne
    Persona persona;
            

    public Empleado() {
    }

    public Empleado(int id_empleado, String cargo, double sueldo, Usuario user, List<Venta> listaVentas, Persona persona) {
        this.id_empleado = id_empleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.user = user;
        this.listaVentas = listaVentas;
        this.persona = persona;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
    
    
}
