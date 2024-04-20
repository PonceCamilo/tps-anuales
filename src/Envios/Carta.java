package Envios;

import Empleados.Cartero;
import Envios.Locacion.Camino;
import Envios.Personas.Destinatario;
import Envios.Personas.Remitente;

import java.util.ArrayList;
import java.util.Date;

public class Carta extends Envio {

    private String sellado;

    public Carta(Remitente remitente, Destinatario destinatario, double precio, Date fecha, int codigoDeRastreo, Cartero cartero, ArrayList<Camino> caminos, String sellado) {
        super(remitente, destinatario, precio, fecha, codigoDeRastreo, cartero, caminos);
        this.sellado = sellado;
    }

    public void realizar() { }
}
