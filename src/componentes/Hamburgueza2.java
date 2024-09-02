package componentes;

import ingredientes.*;

public class Hamburgueza2 {
    private TapaPan tapaPan;
    private BasePan basePan;
    private Carne carne;
    private String cliente;

    private Ingrediente[] ingredientes= new Ingrediente[12];
    private int i;

    public Hamburgueza2(){
        basePan = new BasePan();
        carne= new Carne();
        i=0;
    }

    public void ingresientesDeLaCasa(){
        addCatsup();
        addMotaza();
        addJitomate();
        addJitomate();
        addQueso();
        addLechuga();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setBasePan(BasePan basePan){
        this.basePan=basePan;
    }

    public void setBasePan(BasePan.tipo tipoPan, BasePan.tamannio_ tamannio){
        basePan.setNombre(tipoPan.name());
        basePan.setTamannio(tamannio);
    }

    public void setCarne(Carne.tipo tipoCrne, String coccion){
        carne.setNombre(tipoCrne.name());
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
        return  "** Listo trabajando orden para "+ this.cliente +">>\n" +
                "Pan " + basePan.getNombre() + " tamaño " + basePan.getTamannio() + "\n" +
                "carne de " + carne.getNombre() + " " + carne.getCoccion() + "\n\n" +
                "incluye: \n" +
                getIngredientes();
    }
}
