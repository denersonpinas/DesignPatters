package elementos;

import java.util.List;

import componentes.Usuario;

public interface ValidarUsuario {
    void setUsuarios(List<Usuario> usuarios);
    boolean validarUsuario(String cpf, String senha);
}