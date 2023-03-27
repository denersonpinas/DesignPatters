package elementos;

/**
 * CalcularGanhos
 */
public interface CalcularGanhos {
    void calcularGanhos();
    void setSaldo(double saldo);
    void setTaxaJuros(double taxaJuros);
    double getSaldo();
    double getTaxaJuros();
    double getGanhos();
}