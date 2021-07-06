package backend;

import java.io.Serializable;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Tony
 */
public class Vendedor extends Funcionario implements Autenticavel, Serializable{
    
    public Vendedor(int senha, int codigoIdent, double valorVendas, String Nome, String CPF, int Idade) {
        super(Nome, CPF, Idade);
        this.senha = senha;
        this.codigoIdent = codigoIdent;
        this.valorVendas = valorVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getCodigoIdent() {
        return codigoIdent;
    }

    public void setCodigoIdent(int codigoIdent) {
        this.codigoIdent = codigoIdent;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public double getBonificacao() {
            return this.salario * 1.05;
        }
    
    private int senha;
    
    private int codigoIdent;
    
    private double valorVendas;

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


    public void fazVenda(){
        
        BancoDeDados banco = new BancoDeDados();
        Scanner entrada = new Scanner(System.in);
        
        int codVendDigitado;
        int codProdDigitado;
        int quantProdDigitado;
        int auxQuant = 0;
        
        codVendDigitado = entrada.nextInt();
        codProdDigitado = entrada.nextInt();
        
        for(int i = 0; i < banco.vendedores.size(); i++){
            if(banco.vendedores.get(i).getCodigoIdent() == codVendDigitado){
                
            for(int j = 0; j < banco.produtos.size(); j++){    
                if(banco.produtos.get(j).getPreco() == codProdDigitado){
                    
                    quantProdDigitado = entrada.nextInt();
                    
                    auxQuant = banco.produtos.get(j).getQuantEstoque();
                    
                    if(quantProdDigitado > auxQuant){
                        JOptionPane.showMessageDialog(null, "Produto nao tem estoque suficiente! \n");
                    }else{
                        banco.produtos.get(j).setQuantEstoque(auxQuant - quantProdDigitado);
                        banco.vendedores.get(i).setValorVendas(quantProdDigitado * banco.produtos.get(j).getPreco());
                    }
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Produto nao encontrado! \n");
                }
                
            }}else{
                JOptionPane.showMessageDialog(null, "Vendedor nao encontrado! \n");
            }
            }
        
}
}