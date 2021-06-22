package backend;

/**
 *
 * @author Tony
 */
public class Gerente extends Funcionario implements Autenticavel{
    
    public Gerente(String Nome, String CPF, int Idade) {
        super(Nome, CPF, Idade);
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
}
