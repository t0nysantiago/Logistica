package backend;

import java.io.Serializable;

/**
 *
 * @author Tony
 */
public class ProdutoExcluido implements Serializable{
    
    private double precoExcluido;
    private String nomeExcluido;
    private int codigoExcluido;
    private int quantEstoqueExcluido;
    private String categoriaExcluido;

    public ProdutoExcluido(double precoExcluido, String nomeExcluido, int codigoExcluido, int quantEstoqueExcluido, String categoriaExcluido) {
        this.precoExcluido = precoExcluido;
        this.nomeExcluido = nomeExcluido;
        this.codigoExcluido = codigoExcluido;
        this.quantEstoqueExcluido = quantEstoqueExcluido;
        this.categoriaExcluido = categoriaExcluido;
    }

    public double getPrecoExcluido() {
        return precoExcluido;
    }

    public void setPrecoExcluido(double precoExcluido) {
        this.precoExcluido = precoExcluido;
    }

    public String getNomeExcluido() {
        return nomeExcluido;
    }

    public void setNomeExcluido(String nomeExcluido) {
        this.nomeExcluido = nomeExcluido;
    }

    public int getCodigoExcluido() {
        return codigoExcluido;
    }

    public void setCodigoExcluido(int codigoExcluido) {
        this.codigoExcluido = codigoExcluido;
    }

    public int getQuantEstoqueExcluido() {
        return quantEstoqueExcluido;
    }

    public void setQuantEstoqueExcluido(int quantEstoqueExcluido) {
        this.quantEstoqueExcluido = quantEstoqueExcluido;
    }

    public String getCategoriaExcluido() {
        return categoriaExcluido;
    }

    public void setCategoriaExcluido(String categoriaExcluido) {
        this.categoriaExcluido = categoriaExcluido;
    }
   
}
