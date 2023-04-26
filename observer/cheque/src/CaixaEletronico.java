public class CaixaEletronico {
    private Integer valor;
    private Conta conta;

    
    public CaixaEletronico(Integer valor, Conta conta) {
        this.valor = valor;
        this.conta = conta;
    }

    
    public Integer getValor() {
        return valor;
    }
    public void setValor(Integer valor) {
        this.valor = valor;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }

}
