package logica;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_cliente;
    
    @JoinColumn(name = "ID_PERSONA")
    @OneToOne(fetch = FetchType.EAGER, targetEntity = Persona.class, cascade = CascadeType.ALL)
    Persona persona;

    public Cliente() {
    }

    public Cliente(int id_cliente, Persona persona) {
        this.id_cliente = id_cliente;
        this.persona = persona;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
    

    
            

    
    
    
    
}
