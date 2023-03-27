package elementos.contapolpanca;

import java.util.List;
import java.util.ArrayList;

import componentes.Usuario;
import elementos.RegistrarConta;

public class ContaPolpancaRegistrarConta implements RegistrarConta {
    private List<Usuario> usuarios = new ArrayList<Usuario>(); 
    
    @Override
    public void registrarConta(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }    
}
