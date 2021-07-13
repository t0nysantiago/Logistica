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

import backend.Produto;
import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class BancoDeDados {
   
   public List<Produto> produtos = new ArrayList<>();
   public List<Cliente> clientes = new ArrayList<>();
   public List<Funcionario> funcionario = new ArrayList<>();
   public List<Vendas> vendas = new ArrayList<>();
   public List<Carrinho> carrinho = new ArrayList<>();
   
   
   
    public void addCarinho(Carrinho carrinho){
        this.carrinho.add(carrinho);
    }
    
    public void resetCarrinho(){
        for(int i = 0; i <  carrinho.size(); i++){
            carrinho.remove(i);
        }
    }
    
    public void addVendas(Vendas vendas){
        this.vendas.add(vendas);
    }
   
    public void addProduto(Produto produto){
        produtos.add(produto);
    }
    
    public void deleteProduto( int codigo){
        for(int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).getCodigo() == codigo){
                produtos.remove(i);
            }
        }
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
        
    }
   
    public void addFuncionario(Funcionario funcionario){
        this.funcionario.add(funcionario);
    }
    
    
    public void listaProdDispEstoque(){
        
        for(int i = 0; i < produtos.size(); i++){
            
            if(produtos.get(i).getQuantEstoque() > 0){
            
            JOptionPane.showMessageDialog(null, "Nome: " + produtos.get(i).getNome() + "\nCodigo: " +
                               produtos.get(i).getCodigo() + "\nPreco: " + produtos.get(i).getPreco() + "\nQuantidade em estoque: " +
                               produtos.get(i).getQuantEstoque());
            
    }
        }
}
    
    public void aumentaEstoque(){
        
        int qualCodProd;
        
        JOptionPane.showMessageDialog(null, "Qual o codigo do produto que deseja alterar o estoque ?");
        qualCodProd = (Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: ")));
        
        for(int i = 0; i < produtos.size(); i++){
            
            if(qualCodProd == produtos.get(i).getCodigo()){
                JOptionPane.showMessageDialog(null, "Qual a quantidade de estoque desejada para o produto '" + produtos.get(i).getNome() + "' ?");
                produtos.get(i).setQuantEstoque(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: ")));
            }
            
            
    }
    
}
    
}
