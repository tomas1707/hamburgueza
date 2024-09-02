package componentes;

import ingredientes.Ingrediente;

public class BasePan implements Ingrediente {
    public static enum tipo{clásico,cristal,integral,amapola, brioche};
    public static enum tamannio_{chico, mediano, grande}

    private String tipoPan;
    private tamannio_ tamannio;
    private float calorias;

    public BasePan(){
        this.tipoPan="Base del Pan " + tipo.clásico.name();
        this.tamannio= tamannio_.mediano;
        this.calorias=140f;
    }

    public BasePan(String tipoPan, tamannio_ tamannio){
        this.tipoPan="Pan " + tipoPan;
        this.tamannio=tamannio;
    }

    public tamannio_ getTamannio() {
        return tamannio;
    }

    public void setTamannio(tamannio_ tamannio) {
        this.tamannio = tamannio;
    }

    @Override
    public void setNombre(String tipoPan) {
        this.tipoPan = tipoPan;
    }

    @Override
    public String getNombre() {
        return this.tipoPan;
    }

    @Override
    public void setCalorias(float calorias) {
        this.calorias=calorias;
    }

    @Override
    public float getCalorias() {
        return this.calorias;
    }
}
