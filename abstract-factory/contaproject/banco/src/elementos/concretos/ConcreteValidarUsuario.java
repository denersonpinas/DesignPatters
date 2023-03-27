package elementos.concretos;

import java.util.List;

import componentes.Usuario;
import elementos.ValidarUsuario;

public class ConcreteValidarUsuario implements ValidarUsuario {
    private List<Usuario> usuarios;
    private boolean status;

    @Override
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;;
    }

    @Override
    public void validarUsuario(String cpf, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(cpf) && usuario.getSenha().equals(senha)) {
                this.status = true;
            }
        }
        this.status = false;
    }

    @Override
    public boolean getStatus() {
        return status;
    }
    
}
