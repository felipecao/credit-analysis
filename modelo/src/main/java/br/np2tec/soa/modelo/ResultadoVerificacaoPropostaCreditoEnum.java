/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.np2tec.soa.modelo;

/**
 *
 * @author np2tec-07
 */
public enum ResultadoVerificacaoPropostaCreditoEnum {

    APROVADO, REPROVADO;

   
    public String toString(){
        if(this.equals(APROVADO))
            return "A";
        return "R";
    }
}
