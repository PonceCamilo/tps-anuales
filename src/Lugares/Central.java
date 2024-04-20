package Lugares;

import java.util.ArrayList;

public class Central {
    private String ubicacion;
    private ArrayList<Sucursal> sucursales;

    public Central(String ubicacion) {
        this.ubicacion = ubicacion;
        sucursales = new ArrayList<Sucursal>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

}
