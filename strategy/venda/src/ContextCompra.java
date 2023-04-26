import strategyinterface.StrategyPagamento;

public class ContextCompra {
    private Double value;

    public ContextCompra(Double value) {
        this.value = value;
    }

    void processarCompra(StrategyPagamento strategyPagamento) {
        strategyPagamento.pagar(value);
    }
}
