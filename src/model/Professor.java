package model;

import java.util.List;

public class Professor extends Usuario {
    private long codigoProfessor;
    private String nome, rg, dataNascimento, titulacao, dataCadastro;
    private Telefone telefone;
    private List<Turma> turmas;

    public Professor() {
    }

    public Professor(String username, Acesso tipoAcesso) {
        super(username, tipoAcesso);
        setSenha(getUsername());
    }

    public Professor(String nome, String rg, String dataNascimento, String titulacao, String dataCadastro,
            Telefone telefone, List<Turma> turmas, String username, Acesso tipoAcesso) {
        super(username, tipoAcesso);
        this.codigoProfessor = (long) BD.getAllProfessores().size() + 1;
        this.nome = nome;
        this.rg = rg;
        setSenha(rg);
        setUsername(rg);
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
        this.titulacao = titulacao;
        this.telefone = telefone;
        this.turmas = turmas;
    }

    public Long getCodigoProfessor() {
        return codigoProfessor;
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

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTitulacao() {
        return this.titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }


    public List<Turma> getTurmas() {
        return this.turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Professor{codigoProfessor=").append(codigoProfessor);
        sb.append(", nome=").append(nome);
        sb.append(", rg=").append(rg);
        sb.append(", dataNascimento=").append(dataNascimento);
        sb.append(", titulacao=").append(titulacao);
        sb.append(", dataCadastro=").append(dataCadastro);
        sb.append(", telefones=").append(telefone);
        sb.append(", turmas=").append(turmas);
        sb.append('}');
        return sb.toString();
    }
    
    

}
