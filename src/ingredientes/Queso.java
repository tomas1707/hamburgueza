package ingredientes;

public class Queso implements Ingrediente{
    public static enum tipo{manchego, chedar, gouda, mozzarella}

    private String tipoQueso;
    private float calorias;

    public Queso(){
        this.tipoQueso="Queso " + tipo.chedar.name();
        this.calorias=250f;
    }

    public Queso(String tipoQueso, float calorias){
        this.tipoQueso="Queso " + tipoQueso;
        this.calorias=calorias;
    }

    @Override
    public void setNombre(String tipoQueso) {
        this.tipoQueso="Queso " + tipoQueso;
    }

    @Override
    public String getNombre() {
        return this.tipoQueso;
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
