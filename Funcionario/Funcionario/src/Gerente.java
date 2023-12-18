public class Gerente extends Funcionarios {
    private String numeroCorporativo;

    public Gerente(String nome, Integer cpf, Integer salario, String numeroCorporativo) {
    super(nome, cpf, salario);
    this.numeroCorporativo = numeroCorporativo;
    }


    public String getNumeroCorporativo(){
        return this.numeroCorporativo;
    }

    public double getBonificacao(){
        return getSalario() * 0.15;
    }  
    
}
