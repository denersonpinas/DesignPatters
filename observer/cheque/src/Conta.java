public class Conta {
    private int saldo;
    private String conta;

    
    public Conta(int saldo, String conta) {
        this.saldo = saldo;
        this.conta = conta;
    }

    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public String getConta() {
        return conta;
    }
}
