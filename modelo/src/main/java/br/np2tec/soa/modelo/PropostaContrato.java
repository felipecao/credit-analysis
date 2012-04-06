/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.np2tec.soa.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author np2tec-07
 */
@Entity
public class PropostaContrato implements Serializable {

    @Id
    @SequenceGenerator(name = "PROPOSTA_CONTRATO_ID", sequenceName = "PROPOSTA_CONTRATO_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PROPOSTA_CONTRATO_ID")
    @Column(name = "ID", nullable = false)
    private Long id;
    
    private String situacao;
    private Integer numeroContrato;

    @OneToOne
    private CreditosConcedidos CreditosConcedidos;
    
    @OneToMany(mappedBy="propostaContrato", cascade= {CascadeType.PERSIST, CascadeType.MERGE})
    private List<TaxaContrato> taxasContrato;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
    }


    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public List<TaxaContrato> getTaxasContrato() {
        return taxasContrato;
    }

    public void setTaxasContrato(List<TaxaContrato> taxasContrato) {
        this.taxasContrato = taxasContrato;
    }

    public void addTaxasContrato(List<TaxaContrato> taxasContrato){
        for (TaxaContrato taxaContrato : taxasContrato) {
            this.taxasContrato.add(taxaContrato);
            taxaContrato.setPropostaContrato(this);
        }
    }

    public CreditosConcedidos getCreditosConcedidos() {
        return CreditosConcedidos;
    }

    public void setCreditosConcedidos(CreditosConcedidos CreditosConcedidos) {
        this.CreditosConcedidos = CreditosConcedidos;
    }


}
