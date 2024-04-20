package Envios;

import Empleados.Cartero;
import Envios.Locacion.Camino;
import Envios.Personas.Destinatario;
import Envios.Personas.Remitente;

import java.util.ArrayList;
import java.util.Date;

public class Encomienda extends Envio {

    public Encomienda(Remitente remitente, Destinatario destinatario, double precio, Date fecha, int codigoDeRastreo, Cartero cartero, ArrayList<Camino> caminos) {
        super(remitente, destinatario, precio, fecha, codigoDeRastreo, cartero, caminos);
    }

    public void realizar() { }
}
