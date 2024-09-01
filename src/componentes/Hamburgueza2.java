package componentes;

import ingredientes.*;

public class Hamburgueza2 {
    private Pan pan;
    private Carne carne;

    private Ingrediente[] ingredientes= new Ingrediente[12];
    private int i;

    public Hamburgueza2(){
        pan = new Pan();
        carne= new Carne();
        i=0;
    }

    public void addJitomate(){
        ingredientes[i]=new Jitomate();
        i++;
    }

    public void addJitomate(String nombre, float calorias){
        ingredientes[i]=new Jitomate(nombre,calorias);
        i++;
    }

    public void addCatzup(){
        ingredientes[i]=new Catzup();
        i++;
    }

    public void addMotaza(){
        ingredientes[i]=new Mostaza();
        i++;
    }

    public void addQueso(){
        ingredientes[i]=new Queso();
        i++;
    }

    public void addLechuga(){
        ingredientes[i]=new Lechuga();
        i++;
    }

    public void addQueso(String nombre, float calorias){
        ingredientes[i]=new Queso(nombre,calorias);
        i++;
    }

    public void setCarne(String tipoCrne, String coccion){
        carne.setTipoCarne(tipoCrne);
        carne.setCoccion(coccion);
    }

    public void setPan(String tipoPan, String tamannio){
        pan.setTipoPan(tipoPan);
        pan.setTamannio(tamannio);
    }

    private String getIngredientes(){
        String dato="";
        for (int j = 0; j < i; j++) {
            dato= dato + "[" + j + "] " + ingredientes[j].getNombre() + " con " + ingredientes[j].getCalorias() + " kilocalorías\n";
        }
        return dato;
    }

    @Override
    public String toString(){
        return  "<<Orden Hamburgueza>>\n" +
                "Pan " + pan.getTipoPan() + " tamaño " + pan.getTamannio() + "\n" +
                "carne de " + carne.getTipoCarne() + " " + carne.getCoccion() + "\n\n" +
                "incluye: \n" +
                getIngredientes();
    }
}
