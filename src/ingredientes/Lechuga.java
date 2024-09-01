package ingredientes;

public class Lechuga implements Ingrediente{
    private String nombre;
    private float calorias;

    public Lechuga(){
        this.nombre="Lechuga";
        this.calorias=15f;
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
