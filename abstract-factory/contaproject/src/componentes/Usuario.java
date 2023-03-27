package componentes;

public class Usuario {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private String senha;

    public Usuario(String nome, String cpf, String endereco, String telefone, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}