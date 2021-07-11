/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.BancoDeDados;
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
        TelaInicial telaIncial = new TelaInicial(banco);
        telaIncial.setVisible(true);
        
        
    }
    
}
