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
    
    public void listaProdCadastrados(){
        
        for(int i = 0; i < produtos.size(); i++){
            
            JOptionPane.showMessageDialog(null, "Nome: " + produtos.get(i).getNome() + "\nCodigo: " +
                               produtos.get(i).getCodigo() + "\nPreco: " + produtos.get(i).getPreco() + "\nQuantidade em estoque: " +
                               produtos.get(i).getQuantEstoque());
            
    }
    
}
    
//    public void fazVenda(){
//        
//        Scanner entrada = new Scanner(System.in);
//        
//        int codVendDigitado;
//        int codProdDigitado;
//        int quantProdDigitado;
//        int auxQuant = 0;
//        
//        codVendDigitado = entrada.nextInt();
//        codProdDigitado = entrada.nextInt();
//        
//        for(int i = 0; i < vendedores.size(); i++){
//            if(vendedores.get(i).getCodigoIdent() == codVendDigitado){
//                
//            for(int j = 0; j < produtos.size(); j++){    
//                if(produtos.get(j).getCodigo() == codProdDigitado){
//                    
//                    quantProdDigitado = entrada.nextInt();
//                    
//                    auxQuant = produtos.get(j).getQuantEstoque();
//                    
//                    if(quantProdDigitado > auxQuant){
//                        JOptionPane.showMessageDialog(null, "Produto nao tem estoque suficiente! \n");
//                    }else{
//                        produtos.get(j).setQuantEstoque(auxQuant - quantProdDigitado);
//                        vendedores.get(i).setValorVendas(quantProdDigitado * produtos.get(j).getPreco());
//                    }
//                    
//                    
//                }else{
//                    JOptionPane.showMessageDialog(null, "Produto nao encontrado! \n");
//                }
//                
//            }}else{
//                JOptionPane.showMessageDialog(null, "Vendedor nao encontrado! \n");
//            }
//            }
//        
//}
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
