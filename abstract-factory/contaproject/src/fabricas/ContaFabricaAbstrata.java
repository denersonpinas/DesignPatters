package fabricas;

import elementos.CalcularGanhos;
import elementos.RegistrarConta;
import elementos.ValidarUsuario;

public interface ContaFabricaAbstrata {
    ValidarUsuario criaValidarUsuario();
    CalcularGanhos criarCalcularGanhos();
    RegistrarConta criarRegistrarConta();
}