import estructuradedatos.Pila;
import componentes.*;
import ingredientes.*;

public class MainPrueba {
    public static void main(String[] args) {
        Pila ingredientes = new Pila(15);

        ingredientes.apilar(new BasePan());
        ingredientes.apilar(new Carne());
        ingredientes.apilar(new Queso());
        ingredientes.apilar(new Queso());
        ingredientes.apilar(new Lechuga());
        ingredientes.apilar(new Jitomate());
        ingredientes.apilar(new Jitomate());
        ingredientes.apilar(new Mostaza());
        ingredientes.apilar(new Catsup());
        ingredientes.apilar(new TapaPan());

        ingredientes.mostrar();

        System.out.println("\nDesapilando");
        System.out.println(ingredientes.desapilar().getNombre());
        System.out.println(ingredientes.desapilar().getNombre());

        ingredientes.mostrar();
//
//        System.out.println("Cantidad de elementos en la Pila " + ingredientes.tamannio());
//
//        System.out.println("Cima " + ingredientes.cima().getNombre());

    }
}
