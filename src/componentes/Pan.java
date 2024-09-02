package componentes;

public class Pan {
    public static enum tipo{clasico,cristal,integral,amapola, brioche};
    public static enum tamannio_{chico, mediano, grande}

    private tipo tipoPan;
    private tamannio_ tamannio;

    public Pan(){
        this.tipoPan=tipo.clasico;
        this.tamannio=tamannio_.mediano;
    }

    public Pan(tipo tipoPan, tamannio_ tamannio){
        this.tipoPan=tipoPan;
        this.tamannio=tamannio;
    }

    public tipo getTipoPan() {
        return tipoPan;
    }

    public void setTipoPan(tipo tipoPan) {
        this.tipoPan = tipoPan;
    }

    public tamannio_ getTamannio() {
        return tamannio;
    }

    public void setTamannio(tamannio_ tamannio) {
        this.tamannio = tamannio;
    }
}
