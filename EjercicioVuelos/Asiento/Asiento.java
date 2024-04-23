package Asiento;
public class Asiento {
    Boolean ocupado;
    String ubicacion;
    String tipo;

     //constructor
     public Asiento (Boolean ocupado, String ubicacion, String tipo){
        this.ocupado = ocupado;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
    }

    public void ocupar(){
        //logica del metodo
        System.out.println("Se ocupo el asiento -- Asiento -> ocupar()");
    }
}
