package elementos.concretos;

import elementos.CalcularGanhos;

public class ConcretoCalcularGanhos implements CalcularGanhos {
    double saldo;
    double taxaJuros;
    double ganhos;

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

    @Override
    public void calcularGanhos() {
        this.ganhos = getSaldo() * getTaxaJuros();
    }

    @Override
    public double getGanhos() {
        return ganhos;
    }
    
}
