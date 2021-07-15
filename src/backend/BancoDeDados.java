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
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BancoDeDados {
   
   public List<Produto> produtos = new ArrayList<>();
   public List<Cliente> clientes = new ArrayList<>();
   public List<Funcionario> funcionario = new ArrayList<>();
   public List<Vendas> vendas = new ArrayList<>();
   public List<Carrinho> carrinho = new ArrayList<>();
   public List<ProdutoExcluido> produtosExcluidos = new ArrayList<>();
   public List<ClienteExcluido> clientesExcluidos = new ArrayList<>();
   
   
   public void gravarClientes(){
           try{
            FileOutputStream arquivoClientes = new FileOutputStream("arquivoCliente.txt");
            PrintWriter ac = new PrintWriter(arquivoClientes);
            ac.println();
             for(int i = 0; i < clientes.size(); i++){
                   ac.println(clientes.get(i).getNome() + ";" + clientes.get(i).getCodigoIdentificacao()
                           + ";" + clientes.get(i).getCompras() + ";" + clientes.get(i).getIdade() + ";");
             }
            ac.close();
            arquivoClientes.close();
        }
        catch(Exception e){
            System.out.println("eroo");
        }
   }
   
   public void gravarProdutos(){
       try{
            FileOutputStream arquivoProdutos = new FileOutputStream("arquivoProdutos.txt");
            PrintWriter ac = new PrintWriter(arquivoProdutos);
            ac.println();
             for(int i = 0; i < produtos.size(); i++){
                   ac.println(produtos.get(i).getCategoria() + ";" + produtos.get(i).getPreco()
                           + ";" + produtos.get(i).getNome() + ";" + produtos.get(i).getCodigo() + ";"
                   + produtos.get(i).getQuantEstoque() + ";");
             }
            ac.close();
            arquivoProdutos.close();
        }
        catch(Exception e){
            System.out.println("eroo");
        }
   }
   
   public void lerProdutos(){
        
     FileReader fr = null;
     BufferedReader br = null;
      try{
           
           fr = new FileReader("arquivoProdutos.txt");
           br = new BufferedReader(fr);
           
           String line = br.readLine();
           line = br.readLine();
           while(line != null){
               String[] vect = line.split(";");
               String cat = vect[0];
               Double prec = Double.parseDouble(vect[1]);
               String nome = vect[2];
               int cod = Integer.parseInt(vect[3]);
               int quant = Integer.parseInt(vect[4]);
               Produto prod = new Produto(cat, prec, nome, cod, quant);
               addProduto(prod);
               line = br.readLine();
           }
           
       }
       catch(IOException e){
           System.out.println("Error prod");
       }
     
   }
   
   public void lerCliente(){
       
     FileReader fr = null;
     BufferedReader br = null;
       try{
           
           fr = new FileReader("arquivoCliente.txt");
           br = new BufferedReader(fr);
           
           String line = br.readLine();
           line = br.readLine();
           while(line != null){
               String[] vect = line.split(";");
               String name = vect[0];
               String codId = vect[1];
               Double compras = Double.parseDouble(vect[2]);
               int idad = Integer.parseInt(vect[3]);
               
               Cliente clie = new Cliente(compras, name, codId, idad);
               addCliente(clie);
               
               line = br.readLine();
           }
           
       }
       catch(IOException e){
           System.out.println("Error");
       }
   }
   
   
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
    
    public void addProdutoExcluido(ProdutoExcluido produtoExcluido){
        produtosExcluidos.add(produtoExcluido);
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
       
    }
    
    public void addClienteExcluido(ClienteExcluido clienteExcluido){
        clientesExcluidos.add(clienteExcluido);
        
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
