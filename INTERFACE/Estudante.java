public class Estudante extends Socio {
    private String universidade;

    public Estudante(String universidade, String nome, String matricula, double valor_anuidade, int idade) {
        super(nome, matricula, valor_anuidade, idade);
        this.universidade = universidade;
    }

    public void imprimir() {

        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Idade : " + idade);
        System.out.println("Anuidade cobrada: " + valor_anuidade);
        System.out.println("Universidade: " + universidade);

    }


}

