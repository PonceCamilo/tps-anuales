package Envios.Personas;

public class Remitente extends Persona {
    public Remitente(String tipo, String nombre, String codigoPostal, String localidad) {
        super(tipo, nombre, codigoPostal, localidad);
    }

    public void notificar() {
        System.out.println("Notifica");
    }
}
