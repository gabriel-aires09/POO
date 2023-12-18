import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    Professor professor;
    private String nome;
    private String ementa;
    private Sala sala;
    List<Estudante> alunos;
    
    public Disciplina(String nome, String ementa, Sala sala) {
        this.nome = nome;
        this.ementa = ementa;
        this.sala = sala;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public Sala getSala() {
        return sala;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public void atribuirProfessor(Professor professor) {
        this.professor = professor;
    }

    public void matricularAluno(Estudante aluno){
        this.alunos.add(aluno);
    }

    public void editarSala(Sala novaSala){
        this.sala = novaSala;
    }

    public void exibirInformacoes(){
        System.out.println("Disciplina: " + nome);
        System.out.println("Sala: " + sala.getNumero() + " - Bloco: " + sala.getBloco());

        if (professor != null){
            System.out.println("Professor: " + professor.getNome());
        } else {
            System.out.println("Professor: Nenhum professor atribuido.");
        }
        System.out.println("Alunos matriculados: ");
        for (Estudante aluno : alunos){
            System.out.println(" - " + aluno.getNome());
        }
    }
}
