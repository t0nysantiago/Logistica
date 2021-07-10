package backend;

import java.io.Serializable;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Tony
 */
public class Gerente extends Funcionario implements Autenticavel, Serializable{
    
    public Gerente(int senha, String Nome, String CPF, int Idade) {
        super(Nome, CPF, Idade);
        this.senha = senha;
    }
    
    @Override
    public double getBonificacao() {
            return this.salario * 1.2;
        }
    
    private int senha;

    // outros atributos e métodos

    @Override
    public boolean autentica(int senha) {
        if(this.senha != senha) {
            return false;
        }
        // pode fazer outras possíveis verificações, como saber se esse
        // departamento do gerente tem acesso ao Sistema

        return true;
    }
    
    /*
    
    public void listaProdCadastrados(){
        
        BancoDeDados banco = new BancoDeDados();
        
        for(int i = 0; i < banco.produtos.size(); i++){
            
            System.out.println("Nome: " + banco.produtos.get(i).getNome() + "\nCodigo: " +
                               banco.produtos.get(i).getCodigo() + "\nPreco: " + banco.produtos.get(i).getPreco() + "\nQuantidade em estoque: " +
                               banco.produtos.get(i).getQuantEstoque());
            
    }
    
}
    
    public void listaProdDispEstoque(){
        
        BancoDeDados banco = new BancoDeDados();
        
        for(int i = 0; i < banco.produtos.size(); i++){
            
            if(banco.produtos.get(i).getQuantEstoque() > 0){
            
            System.out.println("Nome: " + banco.produtos.get(i).getNome() + "\nCodigo: " +
                               banco.produtos.get(i).getCodigo() + "\nPreco: " + banco.produtos.get(i).getPreco() + "\nQuantidade em estoque: " +
                               banco.produtos.get(i).getQuantEstoque());
            
    }
        }
}
    
    public void aumentaEstoque(){
        
        BancoDeDados banco = new BancoDeDados();
        Scanner entrada = new Scanner(System.in);
        
        int qualCodProd;
        
        System.out.println("Qual o codigo do produto que deseja alterar o estoque ?");
        qualCodProd = entrada.nextInt();
        
        for(int i = 0; i < banco.produtos.size(); i++){
            
            if(qualCodProd == banco.produtos.get(i).getCodigo()){
                System.out.println("Qual a quantidade de estoque desejada para o produto '" + banco.produtos.get(i).getNome() + "' ?");
                banco.produtos.get(i).setQuantEstoque(entrada.nextInt());
            }else{
                System.out.println("Erro nao eh um numero inteiro!");
            }
            
            
    }
    
}
    */
}
