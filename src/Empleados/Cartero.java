package Empleados;

import Envios.Envio;

public class Cartero extends Empleado {
    private String tipoVehiculo;


    public Cartero(String nombre, String apellido, String telefono, String tipoVehiculo) {
        super(nombre, apellido, telefono);
        this.tipoVehiculo = tipoVehiculo;
    }

    public void realizarEnvio(Envio envio) {
        System.out.println("Realiza un envio");
    }
}
