import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Camino.Camino;
import Camino.Lugar;
import Empleado.Cartero;
import Entregable.Entregable;
import Persona.Destinatario;
import Persona.Remitente;

public class Envio {
    Remitente remitente;
    Destinatario destinatario;
    double precio;
    LocalDate fecha;
    int codigoDeRastreo;
    Cartero cartero;
    List<Camino> caminos = new ArrayList<>();
    Entregable entregable;

    public Envio(Remitente remitente, Destinatario destinatario, double precio, LocalDate fecha, int codigoDeRastreo,
            Cartero cartero, List<Camino> caminos, Entregable entregable) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.precio = precio;
        this.fecha = fecha;
        this.codigoDeRastreo = codigoDeRastreo;
        this.cartero = cartero;
        this.caminos = caminos;
        this.entregable = entregable;
    }

    public void noitificarRemitente() {
        remitente.notificar();
    }

    public void realizar() {
        entregable.enviar();
    }

    public Camino rastrear() {
        Camino caminoActual = new Camino(null, new Lugar("carlos calvo 1200", "Boedo"));
        System.out.println("El camino actual del envio es: " + caminoActual.lugar.direccion);
        return caminoActual;
    }
}
