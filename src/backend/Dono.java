package backend;

import java.io.Serializable;

/**
 *
 * @author Tony
 */
public class Dono extends Funcionario implements Autenticavel, Serializable{
    
    public Dono(int senha, String Nome, String CPF, int Idade) {
        super(Nome, CPF, Idade);
        this.senha = senha;
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
