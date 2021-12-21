package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Persona;
import logica.Usuario;
import logica.Venta;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-12-20T23:14:38")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, Persona> persona;
    public static volatile SingularAttribute<Empleado, Double> sueldo;
    public static volatile ListAttribute<Empleado, Venta> listaVentas;
    public static volatile SingularAttribute<Empleado, String> cargo;
    public static volatile SingularAttribute<Empleado, Usuario> user;
    public static volatile SingularAttribute<Empleado, Integer> id_empleado;

}