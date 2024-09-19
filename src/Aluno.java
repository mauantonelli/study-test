import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String email;
    private List<Matricula> matriculas = new ArrayList<>();

    public Aluno(String nome, String cpf, String email, List<Matricula> matriculas) {
        super(nome, cpf);
        this.email = email;
        this.matriculas = matriculas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }


    public double calcularTotalGasto() {
        double totalGasto = 0;

        for (Matricula matricula : matriculas) {
            totalGasto += matricula.getTurma().getCurso().getValor();
        }

        return totalGasto;
    }

    @Override
    public List<Curso> obterCursos() {
        List<Curso> cursos = new ArrayList<>();
        System.out.println("Nome do aluno" + this.getNome());
        for(Matricula matricula: matriculas){
            System.out.println("Curso Aluno:" + matricula.getTurma().getCurso().getNome());
            cursos.add(matricula.getTurma().getCurso());

        }

        return cursos;
    }
}
