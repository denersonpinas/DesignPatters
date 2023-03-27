package elementos.concretos;

import elementos.CalcularGanhos;
import elementos.Conta;
import elementos.RegistrarConta;
import elementos.ValidarUsuario;

public class ContaCorrente implements Conta {
    
    CalcularGanhos calcularGanhos;
    ValidarUsuario validarUsuario;
    RegistrarConta registrarConta;
    
    public ContaCorrente(CalcularGanhos calcularGanhos, ValidarUsuario validarUsuario, RegistrarConta registrarConta) {
        this.calcularGanhos = calcularGanhos;
        this.validarUsuario = validarUsuario;
        this.registrarConta = registrarConta;
    }

    @Override
    public String geraConta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'geraConta'");
    }

    @Override
    public String getValidarConta() {         
            if (this.validarUsuario.getStatus()) {
                return "Usuário validado com sucesso!";
            }
            return "CPF ou senha incorretos.";
    }

    @Override
    public String getCalcularGanhos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCalcularGanhos'");
    }

    @Override
    public String getRegistrarConta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRegistrarConta'");
    }
    
}
