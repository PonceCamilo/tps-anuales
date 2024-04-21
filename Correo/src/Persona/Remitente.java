package Persona;

public class Remitente extends Persona {
    public Remitente(String nombre, String codigoPostal, String localidad) {
        super(nombre, codigoPostal, localidad);
    }

    public void notificar() {
        System.out.println("El remitente fue notificado de que su envio llego.");
    }
}
