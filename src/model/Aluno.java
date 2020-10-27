package model;

import java.util.List;

public class Aluno extends Usuario {

    private String nome, endereco, dataNascimento;
    private List<Matricula> matriculas;
    private Telefone telefone;
    private double peso, altura, imc;

    public Aluno() {
    }

    public Aluno(String username, String senha, Acesso tipoAcesso) {
        super(username, senha, tipoAcesso);
    }

}
