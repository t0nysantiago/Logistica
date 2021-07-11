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
    
    public Cliente(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }
    
           

}
