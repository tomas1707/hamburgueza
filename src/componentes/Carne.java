package componentes;

import java.security.PublicKey;

public class Carne {
    private String tipoCarne;
    private String coccion;

    public  Carne(){
        this.tipoCarne="Res";
        this.coccion="termino medio";
    }

    public Carne(String tipoCarne, String coccion){
        this.tipoCarne=tipoCarne;
        this.coccion=coccion;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public String getCoccion() {
        return coccion;
    }

    public void setCoccion(String coccion) {
        this.coccion = coccion;
    }
}
