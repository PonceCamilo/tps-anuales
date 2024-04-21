package Persona;
public class Destinatario extends Persona {
    public Destinatario(String nombre, String codigoPostal, String localidad) {
        super(nombre, codigoPostal, localidad);
    }

    public void recibirEnvio() {
        System.out.println("El destinatario recibio el entregable.");
    }
}
