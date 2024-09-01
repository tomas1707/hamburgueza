package componentes;

public class Pan {
    private String tipoPan;
    private String tamannio;

    public Pan(){
        this.tipoPan="Normal";
        this.tamannio="Mediano";
    }

    public Pan(String tipoPan, String tamannio){
        this.tipoPan=tipoPan;
        this.tamannio=tamannio;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    public void setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
    }

    public String getTamannio() {
        return tamannio;
    }

    public void setTamannio(String tamannio) {
        this.tamannio = tamannio;
    }
}
