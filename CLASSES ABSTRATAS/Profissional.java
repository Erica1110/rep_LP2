public class Profissional extends Socio {
    private String empresa;

    public Profissional(String n, String m, String empresa) {
        super(n, m);
        this.empresa = empresa;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Empresa: " + empresa);
    }

}
