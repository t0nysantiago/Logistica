/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.BancoDeDados;
import backend.Cliente;
import backend.Funcionario;
import backend.Produto;
import frontend.telas.TelaInicial;

/**
 *
 * @author jonny
 */
public class Logistica {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        BancoDeDados banco = new BancoDeDados();
        
        Cliente cliente1 = new Cliente(0, "jonny", "1", 0);
        Funcionario funci = new Funcionario("t", "2", 0);
        Produto p1 = new Produto("Rifle",2.4, "ggf", 112, 4);
        banco.addCliente(cliente1);
        banco.addFuncionario(funci);
        banco.addProduto(p1);
        TelaInicial telaIncial = new TelaInicial(banco);
        telaIncial.setVisible(true);
    }
    
}
