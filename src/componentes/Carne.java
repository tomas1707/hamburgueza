package componentes;

import ingredientes.Ingrediente;

import java.security.PublicKey;

public class Carne implements Ingrediente{
    public static enum tipo{res,pollo, bife, añojo}
    private String tipoCarne;
    private String coccion;


    public  Carne(){
        this.tipoCarne="Carne de " + tipo.res.name();
        this.coccion="termino medio";
    }

    public Carne(String tipoCarne, String coccion){
        this.tipoCarne="Carne de " + tipoCarne;
        this.coccion=coccion;
    }


    public String getCoccion() {
        return coccion;
    }

    public void setCoccion(String coccion) {
        this.coccion = coccion;
    }
    @Override
    public void setNombre(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    @Override
    public String getNombre() {
        return this.tipoCarne;
    }

    @Override
    public void setCalorias(float calorias) {

    }

    @Override
    public float getCalorias() {
        return 0;
    }
}
