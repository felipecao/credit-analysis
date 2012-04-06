/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.np2tec.soa.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlTransient;

@NamedQuery(
  name="TaxaContrato.listarTaxaContrato",
  query="SELECT tc FROM TaxaContrato tc WHERE tc.tipoTaxa = :tipoTaxa"
)
@Entity
public class TaxaContrato implements Serializable {

    @Id
    @SequenceGenerator(name = "TAXA_CONTRATO_ID", sequenceName = "TAXA_CONTRATO_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "TAXA_CONTRATO_ID")
    @Column(name = "ID", nullable = false)
    private Long id;

    private Double valorTaxa;
    private String tipoTaxa;

    @ManyToOne
    private PropostaContrato propostaContrato;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlTransient
    public PropostaContrato getPropostaContrato() {
        return propostaContrato;
    }

    public void setPropostaContrato(PropostaContrato propostaContrato) {
        this.propostaContrato = propostaContrato;
    }

    public String getTipoTaxa() {
        return tipoTaxa;
    }

    public void setTipoTaxa(String tipoTaxa) {
        this.tipoTaxa = tipoTaxa;
    }

    public Double getValorTaxa() {
        return valorTaxa;
    }

    public void setValorTaxa(Double valorTaxa) {
        this.valorTaxa = valorTaxa;
    }

}
