package elementos;

public interface CalcularGanhos {
    abstract String getOutput();
    void calcularGanhos();
    void setSaldo(double saldo);
    void setTaxaJuros(double taxaJuros);
    double getSaldo();
    double getTaxaJuros();
    double getGanhos();
}
