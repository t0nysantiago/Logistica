package backend;

/**
 *
 * @author Tony
 */
public  class Funcionario extends Pessoa{

    double salario;

    public Funcionario(String nome, String codigoIdentificacao, int idade) {
        super(nome, codigoIdentificacao, idade);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
            return this.salario * 1.01;
        }

    }