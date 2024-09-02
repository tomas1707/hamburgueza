package componentes;

import ingredientes.Catsup;
import ingredientes.Jitomate;

public class Hamburgueza {
    private TapaPan pan;
    private Carne carne;

    private Jitomate[] jitomates= new Jitomate[100];
    private int i_jito;

    private Catsup[] catzup= new Catsup[100];
    private int i_catz;

    public Hamburgueza(){
        pan = new TapaPan();
        carne= new Carne();
        i_jito=0;
        i_catz=0;
    }

    public void addJitomate(){
        jitomates[i_jito]=new Jitomate();
        i_jito++;
    }

    public void addJitomate(String nombre, float calorias){
        jitomates[i_jito]=new Jitomate(nombre,calorias);
        i_jito++;
    }

    public void addCatzup(){
        catzup[i_catz]=new Catsup();
        i_catz++;
    }

    private String getJitomates(){
        String dato="";
        for (int j = 0; j < i_jito; j++) {
            dato= dato + jitomates[j].getNombre() + " con " + jitomates[j].getCalorias() + " kilocalorías\n";
        }
        return dato;
    }

    private String getCatzup(){
        String dato="";
        for (int j = 0; j < i_catz; j++) {
            dato= dato + catzup[j].getNombre() + " con " + catzup[j].getCalorias() + " kilocalorías\n";
        }
        return dato;
    }

    @Override
    public String toString(){
        return  "<<Orden Hamburgueza>>\n" +
                "Pan " + pan.getNombre() + " tamaño " + pan.getTamannio() + "\n" +
                "carne de " + carne.getNombre() + " " + carne.getCoccion() + "\n\n" +
                "incluye: \n" +
                getJitomates() +
                getCatzup();

    }
}
