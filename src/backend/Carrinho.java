/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;

/**
 *
 * @author jonny
 */
public class Carrinho extends Produto{
    
   private String nomeCliente;
    private String codIdentificacao;
    
    public Carrinho(String categoria, double preco, String nome, int codigo, int quantEstoque,String nomeCliente, String codIdentificacao) {
        super(categoria, preco, nome, codigo, quantEstoque);
        this.nomeCliente = nomeCliente;
        this.codIdentificacao = codIdentificacao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCodIdentificacao() {
        return codIdentificacao;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCodIdentificacao(String codIdentificacao) {
        this.codIdentificacao = codIdentificacao;
    }
    
    
}
