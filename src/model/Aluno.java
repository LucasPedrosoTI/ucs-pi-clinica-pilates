package model;

public class Aluno extends Usuario {

    private long codigoMatricula;
    private String nome, endereco, dataNascimento, dataMatricula;
    private Telefone telefone;
    private String peso, altura;
    private double imc;
    private static int qtdAlunos = 0;

    {
        qtdAlunos++;
    }

    public Aluno() {
    }

    public Aluno(String username, Acesso tipoAcesso) {
        super(username, tipoAcesso);
        this.codigoMatricula = qtdAlunos;
        setSenha(this.codigoMatricula + getUsername());
    }

    public Aluno(String dataMatricula, String nome, String endereco, String dataNascimento, Telefone telefone,
            String peso, String altura, String username, Acesso tipoAcesso) {
        super(username, tipoAcesso);
        this.codigoMatricula = qtdAlunos;
        setSenha(this.codigoMatricula + getUsername());
        this.dataMatricula = dataMatricula;
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.peso = peso;
        this.altura = altura;
        this.imc = IMC.calcularIMC(peso, altura);
    }

    public long getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(long codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
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

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public static int getQtdAlunos() {
        return qtdAlunos;
    }

    public static void setQtdAlunos(int qtdAlunos) {
        Aluno.qtdAlunos = qtdAlunos;
    }

    @Override
    public String toString() {
        return "{" + " codigoMatricula='" + codigoMatricula + "'" + ", dataMatricula='" + dataMatricula + "'"
                + ", nome='" + nome + "'" + ", endereco='" + endereco + "'" + ", dataNascimento='" + dataNascimento
                + "'" + "'" + ", telefone='" + telefone + "'" + ", peso='" + peso + "'" + ", altura='" + altura + "'"
                + ", imc='" + imc + "'" + "}";
    }

}
