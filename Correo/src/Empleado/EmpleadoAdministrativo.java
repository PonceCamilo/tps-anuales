package Empleado;
public class EmpleadoAdministrativo extends Empleado {
    int departamento;

    public EmpleadoAdministrativo(String nombre, String apellido, String telefono, int departamento) {
        super(nombre, apellido, telefono);
        this.departamento = departamento;
    }
}
