package model;

/**
 *
 * @author lps10
 */
public class Matricula {
    private long codigoMatricula;
    private String dataMatricula;
    private Aluno aluno;
    private int ausencias;
    private static int qtdMatricula = 0;

    {
        qtdMatricula++;
    }

    public Matricula() {
    }

    public Matricula(String dataMatricula, Aluno aluno, int ausencias) {
        this.codigoMatricula = qtdMatricula;
        this.dataMatricula = dataMatricula;
        this.aluno = aluno;
        this.ausencias = ausencias;
    }

    public long getCodigoMatricula() {
        return this.codigoMatricula;
    }

    public void setCodigoMatricula(long codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public String getDataMatricula() {
        return this.dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public int getAusencias() {
        return this.ausencias;
    }

    public void setAusencias(int ausencias) {
        this.ausencias = ausencias;
    }

    @Override
    public String toString() {
        return "{" + " codigoMatricula='" + getCodigoMatricula() + "'" + ", dataMatricula='" + getDataMatricula() + "'"
                + ", aluno='" + getAluno() + "'" + ", turma='" + "'" + ", ausencias='" + getAusencias() + "'" + "}";
    }

}
