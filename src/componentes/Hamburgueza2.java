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

    public void setPan(Pan pan){
        this.pan=pan;
    }

    public void setPan(Pan.tipo tipoPan, Pan.tamannio_ tamannio){
        pan.setTipoPan(tipoPan);
        pan.setTamannio(tamannio);
    }

    public void setCarne(Carne.tipo tipoCrne, String coccion){
        carne.setTipoCarne(tipoCrne);
        carne.setCoccion(coccion);
    }

    public void setCarne(Carne carne){
        this.carne=carne;
    }

    public void addCatsup(){
        ingredientes[i]=new Catsup();
        i++;
    }

    public void addMotaza(){
        ingredientes[i]=new Mostaza();
        i++;
    }

    public void addJitomate(){
        ingredientes[i]=new Jitomate();
        i++;
    }

    public void addJitomate(Jitomate.tipo nombre, float calorias){
        ingredientes[i]=new Jitomate(nombre.getNombre(),calorias);
        i++;
    }

    public void addQueso(){
        ingredientes[i]=new Queso();
        i++;
    }

    public void addQueso(Queso.tipo tipoQueso, float calorias){
        ingredientes[i]=new Queso(tipoQueso.name(),calorias);
        i++;
    }

    public void addLechuga(){
        ingredientes[i]=new Lechuga();
        i++;
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
