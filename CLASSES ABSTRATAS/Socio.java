public abstract class Socio {
    protected String nome;
    protected String matricula;

    public Socio(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;

    }

    public abstract void imprimir();
}
