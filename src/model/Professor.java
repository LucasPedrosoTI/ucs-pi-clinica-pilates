package model;

import java.util.List;

public class Professor extends Usuario {
    private String nome, rg,data_nascimento, titulacao;
    private List<Telefone> telefones;
    private List<Turma> turmas;

    public Professor(String username, String senha, Acesso tipoAcesso) {
        super(username, senha, tipoAcesso);
    }
    
    
}
