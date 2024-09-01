package ingredientes;

public class Queso implements Ingrediente{
    private String nombre;
    private float calorias;

    public Queso(){
        this.nombre="Queso blanco";
        this.calorias=250f;
    }

    public Queso(String nombre, float calorias){
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
