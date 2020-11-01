package model;

import javax.naming.directory.InvalidAttributeValueException;

public class Aluno extends Usuario {

    private Long codigoMatricula;
    private String nome, endereco, dataNascimento, dataMatricula;
    private Telefone telefone;
    private String peso, altura;
    private double imc;

    public Aluno() {
    }

    public Aluno(String username, Acesso tipoAcesso) {
        super(username, tipoAcesso);
        setSenha(getUsername());
    }

    public Aluno(String dataMatricula, String nome, String endereco, String dataNascimento, Telefone telefone,
            String peso, String altura, String username, Acesso tipoAcesso) throws InvalidAttributeValueException {
        super(username, tipoAcesso);
        this.codigoMatricula = (long) BD.getAllAlunos().size() + 1;
        setUsername(this.codigoMatricula + nome.replaceAll(" ", "").toLowerCase());
        setSenha(this.codigoMatricula + nome.replaceAll(" ", "").toLowerCase());
        this.dataMatricula = dataMatricula;
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.peso = peso;
        this.altura = altura;
        this.imc = IMC.calcularIMC(peso, altura);
    }

    public Long getCodigoMatricula() {
        return codigoMatricula;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    @Override
    public String toString() {
        return "{" + " codigoMatricula='" + codigoMatricula + "'" + ", dataMatricula='" + dataMatricula + "'"
                + ", nome='" + nome + "'" + ", endereco='" + endereco + "'" + ", dataNascimento='" + dataNascimento
                + "'" + "'" + ", telefone='" + telefone + "'" + ", peso='" + peso + "'" + ", altura='" + altura + "'"
                + ", imc='" + imc + "'" + "}";
    }

}
