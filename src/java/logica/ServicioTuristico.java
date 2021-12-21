package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ServicioTuristico implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private int codigo_servicio;
    @Basic
    private String nombre;
    @ManyToMany
    public List<PaqueteTuristico> listaPaquetes;
    private String descripcion_breve;
    private String destino_servicio;
    @Temporal(TemporalType.DATE)
    private Date fecha_servicio;
    private Double costo_servicio;
    @OneToMany
    private List<Venta> listaVenta;

    public ServicioTuristico() {
    }

    public ServicioTuristico(int codigo_servicio, String nombre, List<PaqueteTuristico> listaPaquetes, String descripcion_breve, String destino_servicio, Date fecha_servicio, Double costo_servicio, List<Venta> listaVenta) {
        this.codigo_servicio = codigo_servicio;
        this.nombre = nombre;
        this.listaPaquetes = listaPaquetes;
        this.descripcion_breve = descripcion_breve;
        this.destino_servicio = destino_servicio;
        this.fecha_servicio = fecha_servicio;
        this.costo_servicio = costo_servicio;
        this.listaVenta = listaVenta;
    }

    public int getCodigo_servicio() {
        return codigo_servicio;
    }

    public void setCodigo_servicio(int codigo_servicio) {
        this.codigo_servicio = codigo_servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<PaqueteTuristico> getListaPaquetes() {
        return listaPaquetes;
    }

    public void setListaPaquetes(List<PaqueteTuristico> listaPaquetes) {
        this.listaPaquetes = listaPaquetes;
    }

    public String getDescripcion_breve() {
        return descripcion_breve;
    }

    public void setDescripcion_breve(String descripcion_breve) {
        this.descripcion_breve = descripcion_breve;
    }

    public String getDestino_servicio() {
        return destino_servicio;
    }

    public void setDestino_servicio(String destino_servicio) {
        this.destino_servicio = destino_servicio;
    }

    public Date getFecha_servicio() {
        return fecha_servicio;
    }

    public void setFecha_servicio(Date fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
    }

    public Double getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(Double costo_servicio) {
        this.costo_servicio = costo_servicio;
    }

    public List<Venta> getListaVenta() {
        return listaVenta;
    }

    public void setListaVenta(List<Venta> listaVenta) {
        this.listaVenta = listaVenta;
    }
    
    
    
}
