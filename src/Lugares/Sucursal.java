package Lugares;
import Empleados.Empleado;
import Envios.Envio;

import java.util.ArrayList;

public class Sucursal {
    private String numero;
    private String domicilio;
    private String localidad;
    private ArrayList<Empleado> empleados;
    private ArrayList<Envio> envios;

    public Sucursal(String numero, String domicilio, String localidad) {
        this.numero = numero;
        this.domicilio = domicilio;
        this.localidad = localidad;
        empleados = new ArrayList<Empleado>();
        envios = new ArrayList<Envio>();
    }
}
