import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Curso> listaCursosProgramacao = new ArrayList<>();
        Categoria programacao = new Categoria("Programação", listaCursosProgramacao);

        Curso javaCurso = new Curso("Java", 400, 30, programacao);
        Curso pythonCurso = new Curso("Python", 200, 30, programacao);
        programacao.adicionarCurso(javaCurso);
        programacao.adicionarCurso(pythonCurso);

        List<Curso> listaCursosBanco = new ArrayList<>();
        Categoria bancoDeDados = new Categoria("Banco de Dados", listaCursosBanco);

        Curso postgresqlCurso = new Curso("PostgreSQL", 500, 60, bancoDeDados);
        bancoDeDados.adicionarCurso(postgresqlCurso);

        Instrutor instrutor = new Instrutor("Instrutor A", "123456789", "MAT123", "9999-9999", new ArrayList<>());

        Turma turmaJava = new Turma("T1", LocalDate.of(2024, 3, 15), LocalDate.of(2024, 4, 15), instrutor, javaCurso);
        Turma turmaPython = new Turma("T2", LocalDate.of(2024, 3, 15), LocalDate.of(2024, 4, 15), instrutor, pythonCurso);

        instrutor.getTurmas().add(turmaJava);
        instrutor.getTurmas().add(turmaPython);

        List<Matricula> listaMatriculas = new ArrayList<>();
        Aluno aluno = new Aluno("João", "987654321", "joao@joao.com", listaMatriculas);

        Matricula matriculaJava = new Matricula(8.5, 150, aluno, turmaJava);
        Matricula matriculaPython = new Matricula(9.0, 150, aluno, turmaPython);

        aluno.getMatriculas().add(matriculaJava);
        aluno.getMatriculas().add(matriculaPython);

        System.out.println("Cursos do aluno " + aluno.getNome() + ":");
        for (Curso c : aluno.obterCursos()) {
            System.out.println(c.getNome());
        }

        System.out.println("\nTotal gasto por " + aluno.getNome() + ": " + aluno.calcularTotalGasto());

        System.out.println("\nCursos da categoria " + programacao.getNome() + ":");
        programacao.exibirCursosPorCategoria();
    }
}
