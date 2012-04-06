/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.np2tec.soa.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author np2tec-07
 */
@Entity
public class Parcela implements Serializable {

    @Id
    @SequenceGenerator(name = "PARCELA_ID", sequenceName = "PARCELA_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PARCELA_ID")
    @Column(name = "ID", nullable = false)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    private Double valor;
    private Double jurosAtraso;
    private Double valorPago;
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;

    @ManyToOne
    private CreditosConcedidos creditosConcedidos;

    @XmlTransient
    public CreditosConcedidos getCreditosConcedidos() {
        return creditosConcedidos;
    }

    public void setCreditosConcedidos(CreditosConcedidos creditosConcedidos) {
        this.creditosConcedidos = creditosConcedidos;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getJurosAtraso() {
        return jurosAtraso;
    }

    public void setJurosAtraso(Double jurosAtraso) {
        this.jurosAtraso = jurosAtraso;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }


    


}
