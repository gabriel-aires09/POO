public class Locatario {
    public String nome;
    public String endereco;
    public String telefone;
    public String cpf;

    public Locatario(String nome, String endereco, String telefone, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Endereco: "+this.endereco);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("CPF: "+this.cpf);

    }
}
    