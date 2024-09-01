package ingredientes;

public class Mostaza implements Ingrediente{
    private String nombre;
    private float calorias;

    public Mostaza(){
        this.nombre="Mostaza";
        this.calorias=150f;
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
