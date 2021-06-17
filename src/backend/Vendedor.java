package backend;

/**
 *
 * @author Tony
 */
public class Vendedor extends Funcionario implements Autenticavel{
    
    public Vendedor(String Nome, String CPF, int Idade) {
        super(Nome, CPF, Idade);
    }
    
    @Override
    public double getBonificacao() {
            return this.salario * 1.05;
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
}
