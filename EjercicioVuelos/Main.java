import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Avion.Avion;
import Compra.Compra;
import Asiento.Asiento;
import Interesado.DatosInteresado;
import Interesado.Interesado;
import Interesado.Pasajero;
import Reserva.Reserva;
import Tarjeta.Tarjeta;
import Viaje.Viaje;
import Vuelo.Vuelo;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de asientos para el avión
        List<Asiento> listaAsientos = new ArrayList<>();
        listaAsientos.add(new Asiento(false, "A1", "Ventana"));
        listaAsientos.add(new Asiento(false, "A2", "Pasillo"));
        listaAsientos.add(new Asiento(false, "B1", "Ventana"));
        listaAsientos.add(new Asiento(false, "B2", "Pasillo"));

        // Crear un avión para el vuelo
        Avion avion = new Avion(listaAsientos, "Aerolínea XYZ", "Federico Alvarez", 12345);

        // Crear una lista de pasajeros para el vuelo
        List<Pasajero> pasajeros = new ArrayList<>();
        DatosInteresado datosInteresado1 = new DatosInteresado("Juan", "Pérez", "juan@example.com", 12345678, 1234567890.0);
        DatosInteresado datosInteresado2 = new DatosInteresado("Pedro", "Palermo", "pedro@example.com", 87654321, 0987654321.0);

        // Crear pasajeros y agregarlos a la lista de pasajeros
        Pasajero pasajero1 = new Pasajero(new ArrayList<>(), datosInteresado1, new Tarjeta("Juan Pérez", 1234567890.0, new Date()), 123);
        Pasajero pasajero2 = new Pasajero(new ArrayList<>(), datosInteresado2, new Tarjeta("Pedro Palermo", 199999890.0, new Date()), 124);

        pasajeros.add(pasajero1);
        pasajeros.add(pasajero2);

        // Crear un vuelo con el avión, origen y destino
        Vuelo vuelo = new Vuelo(avion, "Ciudad A", "Ciudad B", pasajeros);

        // Crear un viaje con el vuelo, precio, origen y destino final
        List<Vuelo> listaVuelos = new ArrayList<>();
        listaVuelos.add(vuelo);
        Viaje viaje = new Viaje(listaVuelos, 500.0, "Ciudad A", "Ciudad B");

        // Crear interesados con datos personales y una tarjeta de crédito
        Tarjeta tarjeta1 = new Tarjeta("Juan Pérez", 1234567890.0, new Date());
        Tarjeta tarjeta2 = new Tarjeta("Pedro Pérez", 199999890.0, new Date());
        List<Reserva> listaReservas1 = new ArrayList<>();
        List<Reserva> listaReservas2 = new ArrayList<>();
        Interesado interesado1 = new Interesado(listaReservas1, datosInteresado1, tarjeta1);
        Interesado interesado2 = new Interesado(listaReservas2, datosInteresado1, tarjeta2);


        // Reservar un asiento para el pasajero1 en el vuelo
        Asiento asientoReservado1 = listaAsientos.get(0);
        Reserva reserva = new Reserva(viaje, viaje.getPrecio(), asientoReservado1);
        interesado1.reservar(reserva);

        // Crear una compra asociada al interesado1
        Compra compra1 = new Compra(interesado1.getLista_reserva(), tarjeta1, asientoReservado1, interesado1);

        // Probar los métodos de la compra
        compra1.almacenar_reserva(interesado1);
        compra1.pagarCompra();
        compra1.ocuparAsiento(reserva.getAsiento());

        //método de vuelo
        vuelo.viajar();

    }
}
