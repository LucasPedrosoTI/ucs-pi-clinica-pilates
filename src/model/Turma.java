package model;

import java.util.List;
import java.util.Objects;

public class Turma {

    private int turmaId;
    private List<Matricula> matriculas;
    private String horarioAula;
    private String duracaoAula;
    private String dataInicial;
    private String dataFinal;
    private Professor professor;

    private static int turmaCount;

    {
        turmaCount++;
    }

    public int getTotalAlunos() {
        return this.matriculas.size();
    }

    public static int getTotalTurmas() {
        return turmaCount;
    }

    public Turma() {
    }

    public Turma(int turmaId, List<Matricula> matriculas, String horarioAula, String duracaoAula, String dataInicial,
            String dataFinal, Professor professor) {
        this.turmaId = turmaId;
        this.matriculas = matriculas;
        this.horarioAula = horarioAula;
        this.duracaoAula = duracaoAula;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.professor = professor;
    }

    public int getTurmaId() {
        return this.turmaId;
    }

    public void setTurmaId(int turmaId) {
        this.turmaId = turmaId;
    }

    public List<Matricula> getMatriculas() {
        return this.matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public String getHorarioAula() {
        return this.horarioAula;
    }

    public void setHorarioAula(String horarioAula) {
        this.horarioAula = horarioAula;
    }

    public String getDuracaoAula() {
        return this.duracaoAula;
    }

    public void setDuracaoAula(String duracaoAula) {
        this.duracaoAula = duracaoAula;
    }

    public String getDataInicial() {
        return this.dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataFinal() {
        return this.dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turma turmaId(int turmaId) {
        this.turmaId = turmaId;
        return this;
    }

    public Turma matriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
        return this;
    }

    public Turma horarioAula(String horarioAula) {
        this.horarioAula = horarioAula;
        return this;
    }

    public Turma duracaoAula(String duracaoAula) {
        this.duracaoAula = duracaoAula;
        return this;
    }

    public Turma dataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
        return this;
    }

    public Turma dataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
        return this;
    }

    public Turma professor(Professor professor) {
        this.professor = professor;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Turma)) {
            return false;
        }
        Turma turma = (Turma) o;
        return turmaId == turma.turmaId && Objects.equals(matriculas, turma.matriculas)
                && Objects.equals(horarioAula, turma.horarioAula) && Objects.equals(duracaoAula, turma.duracaoAula)
                && Objects.equals(dataInicial, turma.dataInicial) && Objects.equals(dataFinal, turma.dataFinal)
                && Objects.equals(professor, turma.professor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(turmaId, matriculas, horarioAula, duracaoAula, dataInicial, dataFinal, professor);
    }

    @Override
    public String toString() {
        return "{" + " turmaId='" + getTurmaId() + "'" + ", matriculas='" + getMatriculas() + "'" + ", horarioAula='"
                + getHorarioAula() + "'" + ", duracaoAula='" + getDuracaoAula() + "'" + ", dataInicial='"
                + getDataInicial() + "'" + ", dataFinal='" + getDataFinal() + "'" + ", professor='" + getProfessor()
                + "'" + "}";
    }

}
