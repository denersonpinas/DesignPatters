import componentes.Usuario;
import elementos.CalcularGanhos;
import elementos.RegistrarConta;
import elementos.ValidarUsuario;
import fabricas.ContaFabricaAbstrata;

public class Cliente {
    ValidarUsuario validarUsuario;
    CalcularGanhos calcularGanhos;
    RegistrarConta registrarConta;

    public Cliente(ContaFabricaAbstrata contaFabricaAbstrata) {        
        this.registrarConta = contaFabricaAbstrata.criarRegistrarConta();
        this.registrarConta.registrarConta(new Usuario("Denner", "123456", "Eunápolis", "7390000", "a@gmail.com", "123"));

        this.validarUsuario = contaFabricaAbstrata.criaValidarUsuario();
        this.validarUsuario.setUsuarios(this.registrarConta.getUsuarios());
        this.validarUsuario.validarUsuario("123456", "123");
        
        this.calcularGanhos = contaFabricaAbstrata.criarCalcularGanhos();
        this.calcularGanhos.setSaldo(1500);
        this.calcularGanhos.setTaxaJuros(5);
        this.calcularGanhos.calcularGanhos();
    }

    public String geraConta() {
        return this.calcularGanhos.getOutput();
    }
}
