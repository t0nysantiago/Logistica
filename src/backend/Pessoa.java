package backend;

/**
 *
 * @author jonny
 */
public class Pessoa {
    
    private String Nome;
    private String CPF;
    private int Idade;

    public Pessoa(String Nome, String CPF, int Idade) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Idade = Idade;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    
    
    
}
