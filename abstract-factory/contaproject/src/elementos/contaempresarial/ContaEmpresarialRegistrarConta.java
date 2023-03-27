package elementos.contaempresarial;

import java.util.List;
import java.util.ArrayList;

import componentes.Usuario;
import elementos.RegistrarConta;

public class ContaEmpresarialRegistrarConta implements RegistrarConta {
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