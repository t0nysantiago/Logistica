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
import javax.swing.JOptionPane;

public class BancoDeDados {
   
   public List<Produto> produtos = new ArrayList<>();
   public List<Cliente> clientes = new ArrayList<>();
   public List<Vendedor> vendedores = new ArrayList<>();
   public List<Gerente> gerentes = new ArrayList<>();
   public List<Dono> donos = new ArrayList<>();
   
//    List<Produto> produtos = new ArrayList<>();
    
    
    
    public void addProduto(Produto produto){
        produtos.add(produto);
        
        try{
               FileOutputStream arq = new FileOutputStream("C:\\Users\\Tony\\Desktop\\Banco de dados\\produtos.txt");
               ObjectOutputStream obj = new ObjectOutputStream(arq);
               obj.writeObject(produto);
               obj.flush();
               JOptionPane.showMessageDialog(null, "Ocorreu tudo bem na gravação do arquivo! \n");
           }
           catch(HeadlessException | IOException erro)
           {
               JOptionPane.showMessageDialog(null, "Ocorreu um erro na gravação do arquivo! \n"+erro.getMessage());
           }
        
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
        
        try{
            FileOutputStream arquivoGrav = new FileOutputStream("C:\\Users\\Tony\\Desktop\\Banco de dados\\cliente.txt");
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            objGravar.writeObject(cliente);
            objGravar.flush();
            objGravar.close();
            arquivoGrav.flush();
            arquivoGrav.close();
            JOptionPane.showMessageDialog(null, "Ocorreu tudo bem na gravação do arquivo! \n");
        }
        catch(HeadlessException | IOException erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na gravação do arquivo! \n"+erro.getMessage());
        }
        
    }
    
    public void addVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
        
        try{
            FileOutputStream arquivoGrav = new FileOutputStream("C:\\Users\\Tony\\Desktop\\Banco de dados\\vendedor.txt");
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            objGravar.writeObject(vendedor);
            objGravar.flush();
            objGravar.close();
            arquivoGrav.flush();
            arquivoGrav.close();
            JOptionPane.showMessageDialog(null, "Ocorreu tudo bem na gravação do arquivo! \n");
        }
        catch(HeadlessException | IOException erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na gravação do arquivo! \n"+erro.getMessage());
        }
        
    }
    
    public void addGerente(Gerente gerente){
        gerentes.add(gerente);
        
        try{
            FileOutputStream arquivoGrav = new FileOutputStream("C:\\Users\\Tony\\Desktop\\Banco de dados\\gerente.txt");
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            objGravar.writeObject(gerente);
            objGravar.flush();
            objGravar.close();
            arquivoGrav.flush();
            arquivoGrav.close();
            JOptionPane.showMessageDialog(null, "Ocorreu tudo bem na gravação do arquivo! \n");
        }
        catch(HeadlessException | IOException erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na gravação do arquivo! \n"+erro.getMessage());
        }
        
    }
    
    public void addDono(Dono dono){
        donos.add(dono);
        
        try{
            FileOutputStream arquivoGrav = new FileOutputStream("C:\\Users\\Tony\\Desktop\\Banco de dados\\dono.txt");
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            objGravar.writeObject(dono);
            objGravar.flush();
            objGravar.close();
            arquivoGrav.flush();
            arquivoGrav.close();
            JOptionPane.showMessageDialog(null, "Ocorreu tudo bem na gravação do arquivo! \n");
        }
        catch(HeadlessException | IOException erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na gravação do arquivo! \n"+erro.getMessage());
        }
        
    }
    
}
