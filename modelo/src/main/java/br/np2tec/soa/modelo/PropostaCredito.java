/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.np2tec.soa.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author np2tec-07
 */


@Entity
public class PropostaCredito implements Serializable {

    @Id
    @SequenceGenerator(name = "PROPOSTA_CREDITO_ID", sequenceName = "PROPOSTA_CREDITO_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PROPOSTA_CREDITO_ID")
    @Column(name = "ID", nullable = false)
    private Long id;

    private Double valorFinanciado;
    private Integer numeroParcelas;
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    private String resultadoVerificacao;

    @Column(unique=true)
    private Long numeroProposta;


    @ManyToOne
    private Funcionario funcionario;


    @ManyToOne
    private Cliente cliente;

    @ManyToMany(cascade=CascadeType.PERSIST)
    private List<Peca> pecas;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public Long getNumeroProposta() {
        return numeroProposta;
    }

    public void setNumeroProposta(Long numeroProposta) {
        this.numeroProposta = numeroProposta;
    }

    public List<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(List<Peca> pecas) {
        this.pecas = pecas;
    }

    public String getResultadoVerificacao() {
        return resultadoVerificacao;
    }

    public void setResultadoVerificacao(String resultadoVerificacao) {
        this.resultadoVerificacao = resultadoVerificacao;
    }

    public Double getValorFinanciado() {
        return valorFinanciado;
    }

    public void setValorFinanciado(Double valorFinanciado) {
        this.valorFinanciado = valorFinanciado;
    }

}
