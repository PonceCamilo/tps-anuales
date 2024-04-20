package Envios;

import Empleados.Cartero;
import Envios.Locacion.Camino;
import Envios.Personas.Destinatario;
import Envios.Personas.Remitente;

import java.util.ArrayList;
import java.util.Date;

enum Tipo {
    CARTADOC,
    EVENTO,
    INVITACION
}

public class Telegrama extends Envio {

    private String texto;
    private Tipo clase;

    public Telegrama(Remitente remitente, Destinatario destinatario, double precio, Date fecha, int codigoDeRastreo, Cartero cartero, ArrayList<Camino> caminos, String texto, Tipo clase) {
        super(remitente, destinatario, precio, fecha, codigoDeRastreo, cartero, caminos);
        this.texto = texto;
        this.clase = clase;
    }

    public void realizar() { }
}
