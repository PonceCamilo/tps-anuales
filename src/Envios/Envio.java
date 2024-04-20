package Envios;

import Empleados.Cartero;
import Envios.Locacion.Camino;
import Envios.Personas.Destinatario;
import Envios.Personas.Remitente;

import java.util.ArrayList;
import java.util.Date;

public class Envio {
    private Remitente remitente;
    private Destinatario destinatario;
    private double precio;
    private Date fecha;
    private int codigoDeRastreo;
    private Cartero cartero;
    private ArrayList<Camino> caminos;

    public Envio(Remitente remitente, Destinatario destinatario, double precio, Date fecha, int codigoDeRastreo, Cartero cartero, ArrayList<Camino> caminos) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.precio = precio;
        this.fecha = fecha;
        this.codigoDeRastreo = codigoDeRastreo;
        this.cartero = cartero;
        this.caminos = caminos;
    }

    public void rastrear() { }

    public void notificarUsuario() { }
}
