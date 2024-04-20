package Envios.Personas;

public class Destinatario extends Persona {
    public Destinatario(String tipo, String nombre, String codigoPostal, String localidad) {
        super(tipo, nombre, codigoPostal, localidad);
    }

    public void notificar() {
        System.out.println("Notifica");
    }
}
