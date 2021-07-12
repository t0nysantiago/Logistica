/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author jonny
 */
public class Vendas extends Produto {
    
    public Vendas(String categoria, double preco, String nome, int codigo, int quantEstoque) {
        super(categoria, preco, nome, codigo, quantEstoque);
    }
    
}
