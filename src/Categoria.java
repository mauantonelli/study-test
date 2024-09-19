import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nome;
    private List<Curso> cursos = new ArrayList<>();

    public Categoria(String nome, List<Curso> cursos) {
        this.nome = nome;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void adicionarCurso(Curso curso){
        this.cursos.add(curso);
    }

    public void exibirCursosPorCategoria(){
        System.out.println("Categoria do curso: " + this.getNome());
        for(Curso curso: cursos){
            System.out.println("Nome do curso: " + curso.getNome());
        }

    }
}
