import java.util.ArrayList;
import java.util.List;

public class Central {
    String ubicacion;
    List<Sucursal> sucursales = new ArrayList<>();

    public Central(String ubicacion, List<Sucursal> sucursales) {
        this.ubicacion = ubicacion;
        this.sucursales = sucursales;
    }

    public void agregarSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

}
