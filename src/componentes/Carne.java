package componentes;

import java.security.PublicKey;

public class Carne {
    public static enum tipo{res,pollo, bife, añojo}
    private tipo tipoCarne;
    private String coccion;

    public  Carne(){
        this.tipoCarne=tipo.res;
        this.coccion="termino medio";
    }

    public Carne(tipo tipoCarne, String coccion){
        this.tipoCarne=tipoCarne;
        this.coccion=coccion;
    }

    public tipo getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(tipo tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public String getCoccion() {
        return coccion;
    }

    public void setCoccion(String coccion) {
        this.coccion = coccion;
    }
}
