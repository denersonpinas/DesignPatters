package elementos;

import java.util.List;

import componentes.Usuario;

public interface RegistrarConta {
    void registrarConta(Usuario usuario);
    List<Usuario> getUsuarios();
}