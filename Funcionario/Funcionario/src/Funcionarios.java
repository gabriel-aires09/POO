public class Funcionarios {
    private String nome;
    private Integer cpf;
    private Integer salario;

    public Funcionarios(String nome, Integer cpf, Integer salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public Integer getCpf() {
        return cpf;
    }
    public Integer getSalario() {
        return salario;
    }

    public double getBonificacao(){
        return this.salario * 0.10;
    }   
}
