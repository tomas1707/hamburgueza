package ingredientes;

public class Jitomate implements Ingrediente {
    public static enum tipo{
        bola("Jitomate Bola"),
        roma("Jitomate Roma"),
        cherry("Jitomate Cherry");

        private String tipoJitomate;

        private tipo(String tipoJitomate){
            this.tipoJitomate=tipoJitomate;
        }

        public String getNombre(){
            return this.tipoJitomate;
        }

        @Override
        public String toString() {
            return this.tipoJitomate;
        }
    }

    private String nombre;
    private float calorias;

    public Jitomate(){
        this.nombre=tipo.bola.toString();
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
