package backend;

import java.io.Serializable;

/**
 *
 * @author Tony
 */
public class Produto implements Serializable{
    
    private double preco;
    private String nome;
    private int codigo;
    private int quantEstoque;

    public Produto(double preco, String nome, int codigo, int quantEstoque) {
        this.preco = preco;
        this.nome = nome;
        this.codigo = codigo;
        this.quantEstoque = quantEstoque;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
    
    
    
    
}
