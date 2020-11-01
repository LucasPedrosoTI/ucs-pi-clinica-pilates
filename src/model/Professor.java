package model;

import java.util.List;

public class Professor extends Usuario {
    private String nome, rg, data_nascimento, titulacao;
    private List<Telefone> telefones;
    private List<Turma> turmas;

    public Professor() {
    }

    public Professor(String username, Acesso tipoAcesso) {
        super(username, tipoAcesso);
    }

    public Professor(String nome, String rg, String data_nascimento, String titulacao, List<Telefone> telefones,
            List<Turma> turmas, String username, Acesso tipoAcesso) {
        super(username, tipoAcesso);
        this.nome = nome;
        this.rg = rg;
        setSenha(rg);
        setUsername(rg);
        this.data_nascimento = data_nascimento;
        this.titulacao = titulacao;
        this.telefones = telefones;
        this.turmas = turmas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getData_nascimento() {
        return this.data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getTitulacao() {
        return this.titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public List<Telefone> getTelefones() {
        return this.telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Turma> getTurmas() {
        return this.turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    @Override
    public String toString() {
        return "{" + " nome='" + getNome() + "'" + ", rg='" + getRg() + "'" + ", data_nascimento='"
                + getData_nascimento() + "'" + ", titulacao='" + getTitulacao() + "'" + ", telefones='" + getTelefones()
                + "'" + ", turmas='" + getTurmas() + "'" + "}";
    }

}
