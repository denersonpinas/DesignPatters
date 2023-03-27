package elementos.contacorrente;

import java.util.List;

import componentes.Usuario;
import elementos.ValidarUsuario;

public class ContaCorrenteValidarUsuario implements ValidarUsuario {
    private List<Usuario> usuarios;

    @Override
    public boolean validarUsuario(String cpf, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(cpf) && usuario.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
