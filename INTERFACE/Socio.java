public abstract class Socio {

    protected String nome;
    protected String matricula;
    protected double valor_anuidade;
    protected int idade;

    public Socio(String nome, String matricula, double valor_anuidade, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.valor_anuidade = valor_anuidade;
        this.idade = idade;
    }

    public abstract void imprimir(); 

    
}

