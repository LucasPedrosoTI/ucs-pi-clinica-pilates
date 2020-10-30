/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author lps10
 */
public class Matricula {
    private int codigoMatricula;
    private String dataMatricula;
    private Aluno aluno;
    private Turma turma;
    private int ausencias;

    public Matricula() {
    }

    public Matricula(int codigoMatricula, String dataMatricula, Aluno aluno, Turma turma, int ausencias) {
        this.codigoMatricula = codigoMatricula;
        this.dataMatricula = dataMatricula;
        this.aluno = aluno;
        this.turma = turma;
        this.ausencias = ausencias;
    }

    public int getCodigoMatricula() {
        return this.codigoMatricula;
    }

    public void setCodigoMatricula(int codigoMatricula) {
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

    public Turma getTurma() {
        return this.turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public int getAusencias() {
        return this.ausencias;
    }

    public void setAusencias(int ausencias) {
        this.ausencias = ausencias;
    }

    public Matricula codigoMatricula(int codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
        return this;
    }

    public Matricula dataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
        return this;
    }

    public Matricula aluno(Aluno aluno) {
        this.aluno = aluno;
        return this;
    }

    public Matricula turma(Turma turma) {
        this.turma = turma;
        return this;
    }

    public Matricula ausencias(int ausencias) {
        this.ausencias = ausencias;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Matricula)) {
            return false;
        }
        Matricula matricula = (Matricula) o;
        return codigoMatricula == matricula.codigoMatricula && Objects.equals(dataMatricula, matricula.dataMatricula)
                && Objects.equals(aluno, matricula.aluno) && Objects.equals(turma, matricula.turma)
                && ausencias == matricula.ausencias;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoMatricula, dataMatricula, aluno, turma, ausencias);
    }

    @Override
    public String toString() {
        return "{" + " codigoMatricula='" + getCodigoMatricula() + "'" + ", dataMatricula='" + getDataMatricula() + "'"
                + ", aluno='" + getAluno() + "'" + ", turma='" + getTurma() + "'" + ", ausencias='" + getAusencias()
                + "'" + "}";
    }

}
