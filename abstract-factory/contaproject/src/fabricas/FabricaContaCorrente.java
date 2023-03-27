package fabricas;

import elementos.CalcularGanhos;
import elementos.RegistrarConta;
import elementos.ValidarUsuario;
import elementos.contacorrente.ContaCorrenteCalcularGanhos;
import elementos.contacorrente.ContaCorrenteRegistrarConta;
import elementos.contacorrente.ContaCorrenteValidarUsuario;

public class FabricaContaCorrente implements ContaFabricaAbstrata {

    @Override
    public ValidarUsuario criaValidarUsuario() {
        return new ContaCorrenteValidarUsuario();
    }

    @Override
    public CalcularGanhos criarCalcularGanhos() {
        return new ContaCorrenteCalcularGanhos();
    }

    @Override
    public RegistrarConta criarRegistrarConta() {
        return new ContaCorrenteRegistrarConta();
    }    
}
