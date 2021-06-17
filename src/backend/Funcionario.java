package backend;

/**
 *
 * @author Tony
 */
public abstract class Funcionario extends Pessoa{

    double salario;

    public Funcionario(String Nome, String CPF, int Idade) {
        super(Nome, CPF, Idade);
    }

    public double getBonificacao() {
            return this.salario * 1.01;
        }

    }