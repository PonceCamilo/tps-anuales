package Envios;

import Empleados.Cartero;
import Envios.Locacion.Camino;
import Envios.Personas.Destinatario;
import Envios.Personas.Remitente;

import java.util.ArrayList;
import java.util.Date;

public class Giro extends Envio {

    private double importe;

    public Giro(Remitente remitente, Destinatario destinatario, double precio, Date fecha, int codigoDeRastreo, Cartero cartero, ArrayList<Camino> caminos, double importe) {
        super(remitente, destinatario, precio, fecha, codigoDeRastreo, cartero, caminos);
        this.importe = importe;
    }

    public void realizar() {}

}
