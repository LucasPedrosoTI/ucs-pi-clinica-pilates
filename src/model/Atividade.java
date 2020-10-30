package model;

import java.util.List;
import java.util.Objects;

public class Atividade {
    private String nome, descricao;
    private List<Turma> turmas;

    public Atividade() {
    }

    public Atividade(String nome, String descricao, List<Turma> turmas) {
        this.nome = nome;
        this.descricao = descricao;
        this.turmas = turmas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Turma> getTurmas() {
        return this.turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public Atividade nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Atividade descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Atividade turmas(List<Turma> turmas) {
        this.turmas = turmas;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Atividade)) {
            return false;
        }
        Atividade atividade = (Atividade) o;
        return Objects.equals(nome, atividade.nome) && Objects.equals(descricao, atividade.descricao)
                && Objects.equals(turmas, atividade.turmas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, turmas);
    }

    @Override
    public String toString() {
        return "{" + " nome='" + getNome() + "'" + ", descricao='" + getDescricao() + "'" + ", turmas='" + getTurmas()
                + "'" + "}";
    }

}