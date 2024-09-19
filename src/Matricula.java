public class Matricula {
    private double nota;
    private int frequencia;
    private Aluno aluno;
    private Turma turma;

    public Matricula(double nota, int frequencia, Aluno aluno, Turma turma) {
        this.nota = nota;
        this.frequencia = frequencia;
        this.aluno = aluno;
        this.turma = turma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
