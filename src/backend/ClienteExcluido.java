/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;

/**
 *
 * @author Tony
 */
public class ClienteExcluido extends Pessoa implements Serializable{
    
    double comprasExcluido;

    public ClienteExcluido(double comprasExcluido, String nome, String codigoIdentificacao, int idade) {
        super(nome, codigoIdentificacao, idade);
        this.comprasExcluido = comprasExcluido;
    }

    public double getComprasExcluido() {
        return comprasExcluido;
    }

    public void setComprasExcluido(double comprasExcluido) {
        this.comprasExcluido = comprasExcluido;
    }
    
           
    
}
