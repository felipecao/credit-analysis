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
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

@NamedQuery(
  name="Funcionario.consultarFuncionario",
  query="SELECT f FROM Funcionario f WHERE f.cpf = :cpf"
)
@Entity
public class Funcionario implements Serializable {

    @Id
    @SequenceGenerator(name = "FUNCIONARIO_ID", sequenceName = "FUNCIONARIO_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "FUNCIONARIO_ID")
    @Column(name = "ID")
    private Long id;

    private String cpf;
    private String nome;
    private String tipo;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}
