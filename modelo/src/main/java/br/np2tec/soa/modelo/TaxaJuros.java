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
import javax.persistence.SequenceGenerator;



@Entity
public class TaxaJuros implements Serializable {

    @Id
    @SequenceGenerator(name = "TAXA_JUROS_ID", sequenceName = "TAXA_JUROS_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "TAXA_JUROS_ID")
    @Column(name = "ID", nullable = false)
    private Long id;

    private String codigoTaxa;

    private Double valorTotalMinimo;
    private Double valorTotalMaximo;
    private Integer numeroParcelasMinimo;
    private Integer numeroParcelasMaximo;
    private Double taxaJuros;

    public String getCodigoTaxa() {
        return codigoTaxa;
    }

    public void setCodigoTaxa(String codigoTaxa) {
        this.codigoTaxa = codigoTaxa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroParcelasMaximo() {
        return numeroParcelasMaximo;
    }

    public void setNumeroParcelasMaximo(Integer numeroParcelasMaximo) {
        this.numeroParcelasMaximo = numeroParcelasMaximo;
    }

    public Integer getNumeroParcelasMinimo() {
        return numeroParcelasMinimo;
    }

    public void setNumeroParcelasMinimo(Integer numeroParcelasMinimo) {
        this.numeroParcelasMinimo = numeroParcelasMinimo;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public Double getValorTotalMaximo() {
        return valorTotalMaximo;
    }

    public void setValorTotalMaximo(Double valorTotalMaximo) {
        this.valorTotalMaximo = valorTotalMaximo;
    }

    public Double getValorTotalMinimo() {
        return valorTotalMinimo;
    }

    public void setValorTotalMinimo(Double valorTotalMinimo) {
        this.valorTotalMinimo = valorTotalMinimo;
    }

}
