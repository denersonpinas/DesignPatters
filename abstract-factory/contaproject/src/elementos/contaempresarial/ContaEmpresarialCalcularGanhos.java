package elementos.contaempresarial;

import elementos.CalcularGanhos;

public class ContaEmpresarialCalcularGanhos implements CalcularGanhos {
    private double saldo;
    private double taxaJuros;
    private double ganhos;


    @Override
    public String getOutput() {
        return "Os ganhos da conta empresarial são: " + ganhos;
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
