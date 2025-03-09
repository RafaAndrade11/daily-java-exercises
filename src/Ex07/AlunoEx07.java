package Ex07;

public class AlunoEx07 {
    private String nome;
    private float nota;

    public AlunoEx07(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "AlunoEx07{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
