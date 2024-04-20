package Envios;

import Empleados.Cartero;
import Envios.Locacion.Camino;
import Envios.Personas.Destinatario;
import Envios.Personas.Remitente;

import java.util.ArrayList;
import java.util.Date;

public class EncomiendaPackets extends Encomienda {

    private ArrayList<Packet> packets;

    public EncomiendaPackets(Remitente remitente, Destinatario destinatario, double precio, Date fecha, int codigoDeRastreo, Cartero cartero, ArrayList<Camino> caminos, ArrayList<Packet> packets) {
        super(remitente, destinatario, precio, fecha, codigoDeRastreo, cartero, caminos);
        this.packets = packets;
    }

    public void realizar() { }
}
