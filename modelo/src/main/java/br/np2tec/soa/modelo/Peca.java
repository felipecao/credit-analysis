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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
@NamedQueries({
    @NamedQuery(name="Peca.consultarPecas", query="SELECT p FROM Peca p")
})
@Entity
public class Peca implements Serializable {

    @Id
    @SequenceGenerator(name = "PECA_ID", sequenceName = "PECA_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PECA_ID")
    @Column(name = "ID", nullable = false)
    private Long id;

    private String nomePeca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }
}
