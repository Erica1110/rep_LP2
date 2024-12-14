public class Profissional extends Socio implements Professor_EBTT{
    private String empresa;

    public Profissional(String empresa, String nome, String matricula, double valor_anuidade, int idade) {
        super(nome, matricula, valor_anuidade, idade);
        this.empresa = empresa;
    }

    public void imprimir(){

        System.out.println("Nome: " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Empresa: " + empresa);

    }

    public void desconto(){
        System.out.println("UHUUU VOCE GANHOU 50% OFF!");
        valor_anuidade = valor_anuidade * 0.5;
        System.out.println("Mensalidade/ Anuidade nova: " + valor_anuidade);
    

    }
   
  



}
