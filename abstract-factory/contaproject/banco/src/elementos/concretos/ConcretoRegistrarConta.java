package elementos.concretos;

import java.util.List;
import java.util.ArrayList;
import componentes.Usuario;
import elementos.RegistrarConta;

public class ConcretoRegistrarConta implements RegistrarConta {
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    @Override
    public void registrarConta(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public List<Usuario> getUsuarios() {
        return usuarios;
    }    
}
