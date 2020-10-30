package model;

import java.util.Date;
import java.util.List;

public class Aluno extends Usuario {

    private long codigoMatricula;
    private Date dataMatricula;
    private String nome, endereco, dataNascimento;
    private List<Matricula> matriculas;
    private Telefone telefone;
    private String peso, altura;
    private double imc;
    private static int qtdAlunos = 0;

    {
        qtdAlunos++;
    }

    public Aluno() {
    }

    public Aluno(String username, String senha, Acesso tipoAcesso) {
        super(username, senha, tipoAcesso);
        this.codigoMatricula = qtdAlunos;
    }

    public Aluno(Date dataMatricula, String nome, String endereco, String dataNascimento, List<Matricula> matriculas, Telefone telefone, String peso, String altura, double imc, String username, String senha, Acesso tipoAcesso) {
        super(username, senha, tipoAcesso);
        this.codigoMatricula = qtdAlunos;
        this.dataMatricula = dataMatricula;
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.matriculas = matriculas;
        this.telefone = telefone;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }



    @Override
    public String toString() {
        return "Aluno{" + "codigoMatricula=" + codigoMatricula + ", nome=" + nome + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento + ", matriculas=" + matriculas + ", telefone=" + telefone + ", peso=" + peso + ", altura=" + altura + ", imc=" + imc + '}';
    }

}
