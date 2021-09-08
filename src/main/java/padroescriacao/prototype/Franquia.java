package padroescriacao.prototype;

public class Franquia implements Cloneable {
    private int matricula;
    private String nome;
    private Endereco endereco;
    private String localNascimento;

    public Franquia(int matricula, String nome, Endereco endereco, String localNascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.localNascimento = localNascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    @Override
    public Franquia clone() throws CloneNotSupportedException {
        Franquia franquiaClone = (Franquia) super.clone();
        franquiaClone.endereco = (Endereco) franquiaClone.endereco.clone();
        return franquiaClone;
    }

    @Override
    public String toString() {
        return "Franquia{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", localNascimento='" + localNascimento + '\'' +
                '}';
    }
}
