package Compra;
import java.util.ArrayList;
import java.util.List;

import Reserva.Reserva;
import Interesado.Interesado;
import Tarjeta.Tarjeta;
import Asiento.Asiento;

public class Compra {
    List<Reserva> lista_compra = new ArrayList<>();
    Tarjeta tarjeta; //campo para almacenar la tarjeta utilizada
    Asiento asiento;
    Interesado interesado;

    //constructor
    public Compra (List<Reserva> lista_compra, Tarjeta tarjeta, Asiento asiento, Interesado interesado){
        this.lista_compra = lista_compra;
        this.tarjeta = tarjeta;
        this.asiento = asiento;
        this.interesado = interesado;
    }

    public void almacenar_reserva(Interesado interesado){
        
       // Obtener la lista de reservas del Interesado
       List<Reserva> lista_reserva = interesado.getLista_reserva();

       // Si hay al menos una reserva en la lista_reserva del Interesado
       if (!lista_reserva.isEmpty()) {
            // Seleccionar la primera reserva (puedes implementar lógica más avanzada aquí)
            Reserva reserva = lista_reserva.get(0);
            // Agregar la reserva seleccionada a la lista_compra de esta Compra
            lista_compra.add(reserva);
            // Opcional: Eliminar la reserva de lista_reserva del Interesado
            lista_reserva.remove(reserva);

            System.out.println("Reserva almacenada en la lista de compra. -- Compra -> almacenar_reserva()");
        } else {
            System.out.println("No hay reservas disponibles para almacenar.");
        }
    }

     
    
    public void pagarCompra(){
        // Verificar si el interesado y su tarjeta están disponibles
        if (interesado != null && interesado.getTarjeta() != null) {
            Tarjeta tarjeta = interesado.getTarjeta();
            tarjeta.pagar();
            System.out.println("Se pudo realizar el pago -- Compra -> pagarCompra()");
        } else {
            System.out.println("No se puede realizar el pago, tarjeta no válida");
        }
    }

    public void ocuparAsiento(Asiento asiento){
        if (tarjeta != null) {
           asiento.ocupar();
           System.out.println("Asiento ocupado correctamente -- Compra -> ocuparAsiento()");
        } else {
            System.out.println("No se pudo ocupar el asiento");
        }
    }

}
