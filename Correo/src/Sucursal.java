import java.util.ArrayList;
import java.util.List;

import Empleado.Empleado;

public class Sucursal {
    String numero;
    String domicilio;
    String localidad;
    List<Empleado> empleados = new ArrayList<>();
    List<Envio> envios = new ArrayList<>();

    public Sucursal(String numero, String domicilio, String localidad, List<Empleado> empleados, List<Envio> envios) {
        this.numero = numero;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.empleados = empleados;
        this.envios = envios;
    }
}

