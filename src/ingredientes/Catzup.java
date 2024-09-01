package ingredientes;

import javax.smartcardio.CardTerminal;

public class Catzup implements Ingrediente {
    private String nombre;
    private float calorias;

    public Catzup(){
        this.nombre="Catzup";
        this.calorias=30f;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
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
