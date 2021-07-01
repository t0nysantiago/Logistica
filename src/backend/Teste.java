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
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        BancoDeDados banco = new BancoDeDados();
        
     //   Produto p1 = new Produto(2.4, "ggf", 112, 4);
      //  Produto p2 = new Produto(3.8, "ovo", 113, 5);
        
      
      //  banco.addProduto(p1);
      //  banco.addProduto(p2);
        
        
        for(int i = 0; i < banco.produtos.size(); i++){
            System.out.println("preco " + banco.produtos.get(i).getPreco());
        }
        
        
    }
    
}
