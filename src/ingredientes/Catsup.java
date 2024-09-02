package ingredientes;

public class Catsup implements Ingrediente {
    private String nombre;
    private float calorias;

    public Catsup(){
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
