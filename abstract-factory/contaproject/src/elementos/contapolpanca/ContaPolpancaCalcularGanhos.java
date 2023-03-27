package elementos.contapolpanca;

import elementos.CalcularGanhos;

public class ContaPolpancaCalcularGanhos implements CalcularGanhos {

    double saldo;
    double taxaJuros;
    double ganhos;

    @Override
    public String getOutput() {
        return "Os ganhos da conta poupança são: " + ganhos;
    }

    @Override
    public void calcularGanhos() {
        this.ganhos = getSaldo() * getTaxaJuros();
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public double getTaxaJuros() {
        return taxaJuros;
    }
}