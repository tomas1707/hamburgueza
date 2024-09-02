package estructuradedatos;
import ingredientes.*;

import java.nio.channels.ClosedSelectorException;

public class Pila {
    private Ingrediente pila[];
    private int tope;

    public Pila(){
        pila= new Ingrediente[5];
        this.tope=-1;
    }

    public Pila(int capacidad)
    {
        pila= new Ingrediente[capacidad];
        this.tope=-1;
    }

    public void apilar (Ingrediente elemento){
        if (tope < pila.length){
            pila[++tope]=elemento;
        }
    }

    public Ingrediente desapilar(){
        if(!estaVacia()){
            return pila[tope--];
        }
        else
        {
            System.out.println("La pila está vacia");
            return  null;
        }
    }

    public Ingrediente cima(){
        if (estaVacia()){
            System.out.println("La pila está vacia");
            return null;
        }
        else
            return pila[tope];
    }

    public void mostrar(){
        System.out.println("\nMostrar Pila");
        if (!estaVacia()) {
            for (int i = tope; i >= 0; i--) {
                System.out.println(pila[i].getNombre());
            }
        }
        else
            System.out.println("La pila está vacía");
    }

    public boolean estaVacia(){
        if (tope == -1)
            return true;
        else
            return false;
    }

    public int tamannio(){
        return tope+1;
    }

}
