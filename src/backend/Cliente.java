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
public class Cliente extends Pessoa implements Serializable{
    
    private double compras;
    
    public Cliente(double compras, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.compras = compras;
    }

    public double getCompras() {
        return compras;
    }

    public void setCompras(double compras) {
        this.compras = compras;
    }
    
           

}
