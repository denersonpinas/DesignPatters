package fabricas;

import elementos.CalcularGanhos;
import elementos.RegistrarConta;
import elementos.ValidarUsuario;
import elementos.contaempresarial.ContaEmpresarialCalcularGanhos;
import elementos.contaempresarial.ContaEmpresarialRegistrarConta;
import elementos.contaempresarial.ContaEmpresarialValidarUsuario;

public class FabricaContaEmpresarial implements ContaFabricaAbstrata {

    @Override
    public ValidarUsuario criaValidarUsuario() {
        return new ContaEmpresarialValidarUsuario();
    }

    @Override
    public CalcularGanhos criarCalcularGanhos() {
        return new ContaEmpresarialCalcularGanhos();
    }

    @Override
    public RegistrarConta criarRegistrarConta() {
        return new ContaEmpresarialRegistrarConta();
    }
    
}
