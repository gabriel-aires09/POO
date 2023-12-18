/*
Faça os exercicios abaixo para ir se preparando para a prova 2 a ser aplicada no dia 29/11.

A prova final mudou de data. Será realizada no dia 06/12.
A prova 2 será construída na linha deste exercício de revisão.

Desenvolva um sistema Escolar que permita a criação de novos estudantes, professores, disciplinas e salas de aula. Estudantes e professores tem atributos em 
comum que podem ser herdados de uma classe pai. Cada disciplina possui uma sala de aula atrelada.

* Escreva métodos para criar estudantes, professores, disciplinas e suas salas de aula
* Escreva métodos para excluir estudantes, professores e disciplinas
* Escreva métodos para editar telefone e endereço de estudantes, professores e editar a sala de aula de disciplinas
* Escreva métodos para exibir informações das disciplinas (incluindo a sala de aula), além do professor da disciplina e os alunos matriculados na disciplina.
*/ 
public class App {
    public static void main(String[] args) throws Exception {
        SistemaEscolar sistema = new SistemaEscolar(null, null, null);
        Estudante estudante1 = new Estudante("Gabriel Aires", "666666666", null, null, null, null);
        Professor professor1 = new Professor("Valéria Martins", "77777777", null, null, null, null);
        Sala sala01 = new Sala(101, "B");
        Disciplina disciplina1 = sistema.criarDisciplina("Engenharia de Software I", "215", sala01);

        disciplina1.atribuirProfessor(professor1);
        disciplina1.matricularAluno(estudante1);

        disciplina1.exibirInformacoes();

        System.out.println("\n--- Testando os metodos de edição de informações -------\n");

        // Editar informações
        estudante1.editarContato("6332255199", "Arse 72, alameda 15, lt. 16");
        professor1.editarContato("63666666666", "ARNE 12, alameda 15, lt. 12");
        Sala novaSala = new Sala(102, "A");

        disciplina1.editarSala(novaSala);

        disciplina1.exibirInformacoes();
    }
}
