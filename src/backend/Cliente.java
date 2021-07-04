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
    
    double saldoCompras;

    public double getSaldoCompras() {
        return saldoCompras;
    }

    public void setSaldoCompras(double saldoCompras) {
        this.saldoCompras = saldoCompras;
    }

    public Cliente(double saldoCompras, String Nome, String CPF, int Idade) {
        super(Nome, CPF, Idade);
        this.saldoCompras = saldoCompras;
    }
    
    
    
}
