
public class Estudante extends Pessoa{ 
    private String matricula;
    
    public Estudante(String nome, String telefone, String email, String rg, String cpf, String endereco) {
        super(nome, telefone, email, rg, cpf, endereco);
    }

    public Estudante(String nome, String telefone, String email, String rg, String cpf, String endereco,
            String matricula) {
        super(nome, telefone, email, rg, cpf, endereco);
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }
}


