package Ex05;

public class FuncionarioEx05 {
    private String nome;
    private String cargo;
    private double salario;
    private int idade;

    public FuncionarioEx05(String nome, String cargo, double salario, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "FuncionarioEx05{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
