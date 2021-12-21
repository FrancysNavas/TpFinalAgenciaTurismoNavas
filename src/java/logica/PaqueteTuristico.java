package logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class PaqueteTuristico implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo_paquete;
    @ManyToMany
    public List<ServicioTuristico> listaServicios;
    private Double costo_paquete;
    @OneToMany
    private List<Venta> listaVenta;

    public PaqueteTuristico() {
    }

    public PaqueteTuristico(int codigo_paquete, List<ServicioTuristico> listaServicios, Double costo_paquete, List<Venta> listaVenta) {
        this.codigo_paquete = codigo_paquete;
        this.listaServicios = listaServicios;
        this.costo_paquete = costo_paquete;
        this.listaVenta = listaVenta;
    }

    public int getCodigo_paquete() {
        return codigo_paquete;
    }

    public void setCodigo_paquete(int codigo_paquete) {
        this.codigo_paquete = codigo_paquete;
    }

    public List<ServicioTuristico> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(List<ServicioTuristico> listaServicios) {
        this.listaServicios = listaServicios;
    }

    public Double getCosto_paquete() {
        return costo_paquete;
    }

    public void setCosto_paquete(Double costo_paquete) {
        this.costo_paquete = costo_paquete;
    }

    public List<Venta> getListaVenta() {
        return listaVenta;
    }

    public void setListaVenta(List<Venta> listaVenta) {
        this.listaVenta = listaVenta;
    }
    
    
}
