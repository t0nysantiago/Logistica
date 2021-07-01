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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BancoDeDados {
   
   public List<Produto> produtos = new ArrayList<>();
    
//    List<Produto> produtos = new ArrayList<>();
    
    
    
    public void addProduto(Produto produto){
        produtos.add(produto);
        
        try{
               FileOutputStream arq = new FileOutputStream("produtos.txt");
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


    
}
