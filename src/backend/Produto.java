package backend;

/**
 *
 * @author Tony
 */
public class Produto {
    
    private double preco;
    private String nome;
    private String codigo;
    private int quantEstoque;

    public Produto(double preco, String nome, String codigo, int quantEstoque) {
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
    
    
    
    
}
