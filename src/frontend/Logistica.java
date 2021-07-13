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
        Produto p1 = new Produto("Rifle",2400, "Ak-47", 112, 95);
        Produto p2 = new Produto("Rifle",2400, "M4A4", 113, 192);
        Produto p3 = new Produto("Rifle",2400, "FAMAS", 114, 103);
        Produto p4 = new Produto("Pistola",2400, "DEAGLE", 115, 109);
        Produto p5 = new Produto("Pesada",2400, "BENELLI", 116, 32);
        banco.addCliente(cliente1);
        banco.addFuncionario(funci);
        banco.addProduto(p1);
        banco.addProduto(p2);
        banco.addProduto(p3);
        banco.addProduto(p4);
        banco.addProduto(p5);
        TelaInicial telaIncial = new TelaInicial(banco);
        telaIncial.setVisible(true);
    }
    
}
