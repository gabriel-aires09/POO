import java.util.ArrayList;
import java.util.List;

public class SistemaEscolar {
    private List<Estudante> estudantes;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;
    
    public SistemaEscolar(List<Estudante> estudantes, List<Professor> professores, List<Disciplina> disciplinas) {
        this.estudantes = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Estudante criarEstudante(String nome, String telefone, String email, String rg, String cpf, String endereco, String matricula){
        Estudante estudante = new Estudante(nome, telefone, email, rg, cpf, endereco, matricula);
        this.getEstudantes().add(estudante);
        return estudante;
    }

    public Professor criarProfessor(String nome, String telefone, String email, String rg, String cpf, String endereco, String matricula_professor){
        Professor professor = new Professor(nome, telefone, email, rg, cpf, endereco, matricula_professor);
        this.getProfessores().add(professor);
        return professor;
    }

    public Disciplina criarDisciplina(String nome, String ementa, Sala sala){
        Disciplina disciplina = new Disciplina(nome, ementa, sala);
        this.getDisciplinas().add(disciplina);
        return disciplina;
    }

    public void excluirEstudante(Estudante estudante){
        this.getEstudantes().remove(estudante);
    }

    public void excluirProfessor(Professor professor){
        this.getProfessores().remove(professor);
    }

    public void excluirDisciplina(Disciplina disciplina){
        this.getDisciplinas().add(disciplina);
    }


}
