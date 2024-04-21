package Empleado;
public class Cartero extends Empleado {
    String tipoVehiculo;

    public Cartero(String nombre, String apellido, String telefono, String tipoVehiculo) {
        super(nombre, apellido, telefono);
        this.tipoVehiculo = tipoVehiculo;
    }
}
