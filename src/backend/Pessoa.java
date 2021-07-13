package backend;

/**
 *
 * @author jonny
 */

import java.util.InputMismatchException;

public class Pessoa {
    
    private String nome;
    private String codigoIdentificacao;
    private int idade;

    public Pessoa(String nome, String codigoIdentificacao, int idade) {
        this.nome = nome;
        this.codigoIdentificacao = codigoIdentificacao;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    public void setCodigoIdentificacao(String codigoIdentificacao) {
        this.codigoIdentificacao = codigoIdentificacao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
