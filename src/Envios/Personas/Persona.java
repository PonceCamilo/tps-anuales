package Envios.Personas;

public class Persona {
    private String tipo;
    private String nombre;
    private String codigoPostal;
    private String localidad;

    public Persona(String tipo, String nombre, String codigoPostal, String localidad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
    }
}
