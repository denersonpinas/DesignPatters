package elementos;
import java.util.List;
import componentes.Usuario;

public interface ValidarUsuario {
    void setUsuarios(List<Usuario> usuarios);
    void validarUsuario(String cpf, String senha);
    boolean getStatus();
}