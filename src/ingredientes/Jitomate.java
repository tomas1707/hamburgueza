package ingredientes;

public class Jitomate implements Ingrediente {
    private String nombre;
    private float calorias;

    public Jitomate(){
        this.nombre="Jitomate normal";
        this.calorias=15f;
    }

    public Jitomate(String nombre, float calorias){
        this.nombre=nombre;
        this.calorias=calorias;
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
