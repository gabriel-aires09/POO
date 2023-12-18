import java.util.List;

public class Gerente extends Funcionarios{

    private String setor;
    private Integer numeroSubordinados;

    public Gerente(String nome, Integer idade, String cpf, String cargo, double salario, boolean clt, boolean periodo,
            List<Funcionarios> funcionarios, String setor, Integer numeroSubordinados) {
        super(nome, idade, cpf, cargo, salario, clt, periodo, funcionarios);
        this.setor = setor;
        this.numeroSubordinados = numeroSubordinados;
    }

    public String getSetor(){
        return setor;
    }

    public Integer numeroSubordinados(){
        return numeroSubordinados;
    }





    
}
