public class Estudante extends Socio {
    private String universidade;

    public Estudante(String n, String m, String universidade) {
        super(n, m);
        this.universidade = universidade;

    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Universidade: " + universidade);
    }
}
