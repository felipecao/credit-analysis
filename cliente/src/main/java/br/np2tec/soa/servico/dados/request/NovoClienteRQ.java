package br.np2tec.soa.servico.dados.request;

/**
 * Created with IntelliJ IDEA.
 * User: Felipe
 * Date: 06/04/12
 * Time: 01:08
 * To change this template use File | Settings | File Templates.
 */
public class NovoClienteRQ {
    private String cpf;
    private String identidade;
    private String nome;
    private String endereco;
    private double renda;
    private String telefone;

    public NovoClienteRQ() {
        super();
    }

    public NovoClienteRQ(String cpf, String identidade, String nome, String endereco, double renda, String telefone) {
        super();
        this.cpf = cpf;
        this.identidade = identidade;
        this.nome = nome;
        this.endereco = endereco;
        this.renda = renda;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
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

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
