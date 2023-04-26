public class Cotacao {
    private String moeda;
    private float value;


    public Cotacao(String moeda, float value) {
        this.moeda = moeda;
        this.value = value;
    }
    public String getMoeda() {
        return moeda;
    }
    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }

    
}
