public class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private String rg;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, String telefone, String email, String rg, String cpf, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void editarContato(String novoTelefone, String novoEndereco){
        this.telefone = novoTelefone;
        this.endereco = novoEndereco;
    }

    

    
    
    
    
}
