
public class Professor extends Pessoa {
    private String matricula_professor;

    public Professor(String nome, String telefone, String email, String rg, String cpf, String endereco) {
        super(nome, telefone, email, rg, cpf, endereco);

    }


    public Professor(String nome, String telefone, String email, String rg, String cpf, String endereco,
            String matricula_professor) {
        super(nome, telefone, email, rg, cpf, endereco);
        this.matricula_professor = matricula_professor;
    }



    public String getMatriculaProfessor(){
        return matricula_professor;
    }

    

    // private String matricula_professor;
    // private List<Professor> professores;

    // public Professor(String nome, String telefone, String email, String rg, String cpf, String endereco) {
    //     super(nome, telefone, email, rg, cpf, endereco);
    //     this.professores = new ArrayList<>();
    // }

    // public Professor(String nome, String telefone, String email, String rg, String cpf, String endereco,
    //         String matricula_professor, List<Professor> professores) {
    //     super(nome, telefone, email, rg, cpf, endereco);
    //     this.matricula_professor = matricula_professor;
    //     this.professores = professores;
    // }

    // public String getMatricula_professor() {
    //     return matricula_professor;
    // }

    // public List<Professor> getProfessores() {
    //     return professores;
    // }

    // public void addProfessores(Professor professor){
    //     this.getProfessores().add(professor);

    //     if (professor == null){
    //         throw new IllegalArgumentException("Digite um nome pls");
    //     }
    // }

    // public void mostrarProfessores(){
    //     for (Professor professor : professores){
    //         System.out.println("Nome: " + professor.getNome() + "\nTelefone: " + professor.getTelefone());
    //     }
    // }   
}
