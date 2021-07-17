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

public class BancoDeDados implements GravaArquivos, LerArquivos, Faturamento {
   
   public List<Produto> produtos = new ArrayList<>();
   public List<Cliente> clientes = new ArrayList<>();
   public List<Funcionario> funcionario = new ArrayList<>();
   public List<Vendas> vendas = new ArrayList<>();
   public List<Carrinho> carrinho = new ArrayList<>();
   public List<ProdutoExcluido> produtosExcluidos = new ArrayList<>();
   public List<ClienteExcluido> clientesExcluidos = new ArrayList<>();
   
   
   @Override
   public void gravarClientesExcluido(){
       try{
            FileOutputStream arquivoClientesExcluidos = new FileOutputStream("arquivoClienteExcluidos.txt");
            PrintWriter ac = new PrintWriter(arquivoClientesExcluidos);
            ac.println();
             for(int i = 0; i < clientesExcluidos.size(); i++){
                   ac.println(clientesExcluidos.get(i).getNome() + ";" + clientesExcluidos.get(i).getCodigoIdentificacao()
                           + ";" + clientesExcluidos.get(i).getComprasExcluido() + ";" + clientesExcluidos.get(i).getIdade() + ";");
             }
            ac.close();
            arquivoClientesExcluidos.close();
        }
        catch(Exception e){
            System.out.println("eroo");
        }
   }
   
   @Override
   public void gravarProdExcluidos(){
        try{
            FileOutputStream arquivoProdExcluidos = new FileOutputStream("arquivoProdExcluidos.txt");
            PrintWriter ac = new PrintWriter(arquivoProdExcluidos);
            ac.println();
             for(int i = 0; i < produtosExcluidos.size(); i++){
                   ac.println(produtosExcluidos.get(i).getCategoriaExcluido()+ ";" + produtosExcluidos.get(i).getPrecoExcluido()
                           + ";" + produtosExcluidos.get(i).getNomeExcluido()+ ";" + produtosExcluidos.get(i).getCodigoExcluido()+ ";"
                   + produtosExcluidos.get(i).getQuantEstoqueExcluido()+ ";");
             }
            ac.close();
            arquivoProdExcluidos.close();
        }
        catch(Exception e){
            System.out.println("eroo");
        }
   }
   
   @Override
   public void gravarFuncionario(){
       try{
            FileOutputStream arquivoFuncionario = new FileOutputStream("arquivoFuncionario.txt");
            PrintWriter ac = new PrintWriter(arquivoFuncionario);
            ac.println();
             for(int i = 0; i < funcionario.size(); i++){
                   ac.println(funcionario.get(i).getNome() + ";" + funcionario.get(i).getCodigoIdentificacao() +
                       ";"    + funcionario.get(i).getIdade() + ";");
             }
            ac.close();
            arquivoFuncionario.close();
        }
        catch(Exception e){
            System.out.println("eroo");
        }
   }
   
   @Override
   public void gravarVendas(){
        try{
            FileOutputStream arquivoVendas = new FileOutputStream("arquivoVendas.txt");
            PrintWriter ac = new PrintWriter(arquivoVendas);
            ac.println();
             for(int i = 0; i < vendas.size(); i++){
                   ac.println(vendas.get(i).getCategoria() + ";" + vendas.get(i).getPreco()
                           + ";" + vendas.get(i).getNome() + ";" + vendas.get(i).getCodigo() + ";"
                   + vendas.get(i).getQuantEstoque() + ";" + vendas.get(i).getNomeCliente() + ";" + vendas.get(i).getCodIdentificacao() + ";" );
             }
            ac.close();
            arquivoVendas.close();
        }
        catch(Exception e){
            System.out.println("eroo");
        }
   }
   
    /**
     *
     */
    @Override
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
   
    /**
     *
     */
    @Override
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
   
   @Override
   public void lerProdutos(){
        
     try(BufferedReader br = new BufferedReader(new FileReader("arquivoProdutos.txt"))){
           
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
   
   
   @Override
   public void lerCliente(){
      
       try(BufferedReader br = new BufferedReader(new FileReader("arquivoCliente.txt"))){
           
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
           System.out.println("Erro Client");
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

    @Override
    public void lerFuncionarios() {
        try(BufferedReader br = new BufferedReader(new FileReader("arquivoFuncionario.txt"))){
           
           String line = br.readLine();
           line = br.readLine();
           while(line != null){
               String[] vect = line.split(";");
               String name = vect[0];
               String codId = vect[1];
               int idad = Integer.parseInt(vect[2]);
               
               Funcionario func = new Funcionario(name, codId, idad);
               addFuncionario(func);
               
               line = br.readLine();
           }
           
       }
       catch(IOException e){
           System.out.println("Error Funcioanrio");
       }
    }

    @Override
    public void lerVendas() {
        try(BufferedReader br = new BufferedReader(new FileReader("arquivoVendas.txt"))){
           
           String line = br.readLine();
           line = br.readLine();
           while(line != null){
               String[] vect = line.split(";");
               String cat = vect[0];
               Double prec = Double.parseDouble(vect[1]);
               String name = vect[2];
               int cod = Integer.parseInt(vect[3]);
               int quant = Integer.parseInt(vect[4]);
               String nomeCli = vect[5];
               String codId = vect[6];
               
               Vendas vend = new Vendas(cat, prec, name, cod, quant, nomeCli, codId);
               addVendas(vend);
               
               line = br.readLine();
           }
           
       }
       catch(IOException e){
           System.out.println("Error Vendas");
       }
    }

    @Override
    public void lerClientesExcluidos() {
       try(BufferedReader br = new BufferedReader(new FileReader("arquivoClienteExcluidos.txt"))){
           
           String line = br.readLine();
           line = br.readLine();
           while(line != null){
               String[] vect = line.split(";");
               String name = vect[0];
               String codId = vect[1];
               Double compras = Double.parseDouble(vect[2]);
               int idad = Integer.parseInt(vect[3]);
               
               ClienteExcluido clie = new ClienteExcluido(compras, name, codId, idad);
               addClienteExcluido(clie);
               
               line = br.readLine();
           }
           
       }
       catch(IOException e){
           System.out.println("Error ClientesEx");
       }
    }

    @Override
    public void lerProdExcluidos() {
            
     try(BufferedReader br = new BufferedReader(new FileReader("arquivoProdExcluidos.txt"))){
           
           String line = br.readLine();
           line = br.readLine();
           while(line != null){
               String[] vect = line.split(";");
               String cat = vect[0];
               Double prec = Double.parseDouble(vect[1]);
               String nome = vect[2];
               int cod = Integer.parseInt(vect[3]);
               int quant = Integer.parseInt(vect[4]);
               ProdutoExcluido prod = new ProdutoExcluido(prec, nome, cod, quant, cat);
               addProdutoExcluido(prod);
               line = br.readLine();
           }
           
       }
       catch(IOException e){
           System.out.println("Error prod Ex");
       }
     
    }

    @Override
    public double faturamento() {
        double fatura = 0;
        for(int i = 0; i < vendas.size(); i++){
            fatura = vendas.get(i).getPreco() + fatura;
        }
        return fatura;
    }


}
