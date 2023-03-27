package fabricas;

import elementos.CalcularGanhos;
import elementos.RegistrarConta;
import elementos.ValidarUsuario;
import elementos.contapolpanca.ContaPolpancaCalcularGanhos;
import elementos.contapolpanca.ContaPolpancaRegistrarConta;
import elementos.contapolpanca.ContaPolpancaValidarUsuario;

public class FabricaContaPolpanca implements ContaFabricaAbstrata {

    @Override
    public ValidarUsuario criaValidarUsuario() {
        return new ContaPolpancaValidarUsuario();
    }

    @Override
    public CalcularGanhos criarCalcularGanhos() {
        return new ContaPolpancaCalcularGanhos();
    }

    @Override
    public RegistrarConta criarRegistrarConta() {
        return new ContaPolpancaRegistrarConta();
    }
    
}
