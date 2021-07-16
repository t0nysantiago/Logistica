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
        
        banco.lerCliente();
        banco.lerProdutos();
        Funcionario funci = new Funcionario("t", "1234", 0);
        banco.addFuncionario(funci);
        TelaInicial telaIncial = new TelaInicial(banco);
        telaIncial.setVisible(true);
    }
    
}
