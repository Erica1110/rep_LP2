public class app {
    public static void main(String[] args) {

        Profissional p1 = new Profissional("João", "7894564-2", "Cabral e Sousa");
        Estudante e1 = new Estudante("João Manoel", "202321190033", "IFBA VCA");

        Repositorio BD = new Repositorio();
        BD.inserir(p1);
        BD.inserir(e1);
        BD.remover(e1);

        BD.relatorio();
    }
}