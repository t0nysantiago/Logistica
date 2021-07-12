/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
        
        Produto p1 = new Produto("Rifle",2.4, "ggf", 112, 4);
        Produto p2 = new Produto("Pesada",3.8, "ovo", 113, 5);
        
      
        banco.addProduto(p1);
        banco.addProduto(p2);
        
        //Cliente c1 = new Cliente(2000, "Tony", "000000001", 20);
      
        //banco.addCliente(c1);
        
        //Dono d1 = new Dono(0101, "Jonny", "000000002", 20);
        
        //banco.addDono(d1);
        
        //Gerente ger = new Gerente(1030, "Jobson", "00000000001", 56);
        
        banco.aumentaEstoque();
        
        banco.listaProdCadastrados();
        
        //Vendedor vend = new Vendedor(1003, 0506, 20000, "kaio", "000000008", 29);
        
        //vend.fazVenda();
        
        //for(int i = 0; i < banco.produtos.size(); i++){
        //    System.out.println("preco " + banco.produtos.get(i).getPreco());
        //}
        //for(int i = 0; i < banco.clientes.size(); i++){
        //    System.out.println("nome " + banco.clientes.get(i).getNome());
        //}
        
    }
}
