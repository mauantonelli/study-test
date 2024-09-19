import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa {
    private String matricula;
    private String telefone;
    private List<Turma> turmas = new ArrayList<>();

    public Instrutor(String nome, String cpf, String matricula, String telefone, List<Turma> turmas) {
        super(nome, cpf);
        this.matricula = matricula;
        this.telefone = telefone;
        this.turmas = turmas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    @Override
    public List<Curso> obterCursos() {
        List<Curso> cursos = new ArrayList<>();
        System.out.println("Nome do Instrutor:" + this.getNome());
        for(Turma turma: turmas){
            System.out.println("Curso do instrutor:" + turma.getCurso().getNome());
            cursos.add(turma.getCurso());
        }

        return cursos;
    }
}
