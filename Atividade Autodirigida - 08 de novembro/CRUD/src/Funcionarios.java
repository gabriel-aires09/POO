import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionarios {
    Scanner entrada = new Scanner(System.in);
    private String nome;
    private Integer idade;
    private String cpf;
    private String cargo;
    private double salario;
    private boolean clt;
    private boolean periodo;
    private List<Funcionarios> funcionarios;
    
    
    public Funcionarios(String nome, Integer idade, String cpf, String cargo, double salario, boolean clt, boolean periodo,
            List<Funcionarios> funcionarios) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }


    public Integer getIdade() {
        return idade;
    }


    public String getCpf() {
        return cpf;
    }


    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public boolean getClt(){
        return clt;
    }

    public boolean getPeriodo(){
        return periodo;
    }

    public List<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void adicionar(Funcionarios funcionario){
        this.getFuncionarios().add(funcionario);

        if (funcionario == null){
            throw new IllegalArgumentException("Funcionario nao pode ser nulo.");
        }
    }

    public void adicionarFuncionarios(){
        System.out.println("Digite o nome do funcionario: ");
        nome = entrada.nextLine();

        System.out.println("Digite a idade: ");
        idade = entrada.nextInt();

        System.out.println("Digite o cpf: ");
        cpf = entrada.nextLine();

        if(!cpf.matches("\\d{11}")){
            cpf = entrada.nextLine();
        }

        System.out.println("Digite o cargo: ");
        cargo = entrada.nextLine().toLowerCase();

        System.out.println("Digite o salario: ");
        salario = entrada.nextDouble();

        System.out.println("CLT? [false - Nao | true - Sim]");
        clt = entrada.nextBoolean();

        System.out.println("Tempo integral ou meio periodo?");
        System.out.println("false  - Meio periodo | true - Integral");
        periodo = entrada.nextBoolean();

        Funcionarios funcionario = new Funcionarios(nome, idade, cpf, cargo, salario, clt, periodo, funcionarios);
        adicionar(funcionario);

    }

    public void removerFuncionarios(){
        System.out.println("Digite o nome do funcionario: ");
        nome = entrada.nextLine();
        for (Funcionarios funcionario : funcionarios){
            if (funcionario.nome.equals(nome)){
                this.getFuncionarios().remove(funcionario);
            }
        }

    }

    public void mostrarFuncionarios(){
        for (Funcionarios funcionario : funcionarios){
            System.out.println("--------------");
            System.out.println("Nome: " + funcionario.nome + "\nIdade: " + funcionario.idade + "\nCPF: " + funcionario.cpf + "\nCargo: " + funcionario.salario + "\nSalario: " + funcionario.salario);
        }
    }

    
    

    
    


    
}
