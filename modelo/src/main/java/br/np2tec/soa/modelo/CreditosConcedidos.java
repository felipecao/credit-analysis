/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.np2tec.soa.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class CreditosConcedidos implements Serializable {



    @Id
    @SequenceGenerator(name = "CREDITOS_CONCEDIDOS_ID", sequenceName = "CREDITOS_CONCEDIDOS_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CREDITOS_CONCEDIDOS_ID")
    @Column(name = "ID", nullable = false)
    private Long id;

    private Double valorTotalConcedido;
    private Integer numeroParcelas;
    private String situacao;
    
    @OneToMany(mappedBy="creditosConcedidos", cascade= {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Parcela> parcelas = new ArrayList<Parcela>();

    @OneToOne
    @JoinColumn(unique=true)
    private PropostaCredito propostaCredito;

    @ManyToOne
    private TaxaJuros taxaJuros;

    public void addParcelas(List<Parcela> parcelas){
        for (Parcela parcela : parcelas) {
            this.parcelas.add(parcela);
            parcela.setCreditosConcedidos(this);
        }
        
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

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

    public PropostaCredito getPropostaCredito() {
        return propostaCredito;
    }

    public void setPropostaCredito(PropostaCredito propostaCredito) {
        this.propostaCredito = propostaCredito;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public TaxaJuros getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(TaxaJuros taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public Double getValorTotalConcedido() {
        return valorTotalConcedido;
    }

    public void setValorTotalConcedido(Double valorTotalConcedido) {
        this.valorTotalConcedido = valorTotalConcedido;
    }

   /**
    * Veriica as parcelas que não foram
    * @return a quantidade de parcelas não pagas
    */
   /* public int verificarParcelasEmAberto(){
        int qtdParcelasAbertas = 0;
        for (Parcela parcela : parcelas) {
            if(parcela.getDataPagamento() == null){
                qtdParcelasAbertas++;
            }
        }
        return qtdParcelasAbertas;
    }*/


}
