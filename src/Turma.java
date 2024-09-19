import java.time.LocalDate;

public class Turma {
    private String codigo;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private Instrutor instrutor;
    private Curso curso;

    public Turma(String codigo, LocalDate dataInicio, LocalDate dataTermino, Instrutor instrutor, Curso curso) {
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.instrutor = instrutor;
        this.curso = curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
