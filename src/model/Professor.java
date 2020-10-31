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
        this.data_nascimento = data_nascimento;
        this.titulacao = titulacao;
        this.telefones = telefones;
        this.turmas = turmas;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", rg=" + rg + ", data_nascimento=" + data_nascimento + ", titulacao="
                + titulacao + ", telefones=" + telefones + ", turmas=" + turmas + '}';
    }

}
