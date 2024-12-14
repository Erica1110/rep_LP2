public class app {
    public static void main(String[] args) {

        Estudante e = new Estudante("IFBA", "João", "1000-0", 1800.0, 18);

        e.imprimir();

        Profissional p = new Profissional("Cabral & Sousa", "João", "1222333-2", 1800, 18);
        p.imprimir();
        p.desconto();
        p.imprimir();

        Estudante e1 = new Estudante("IFBA", "João", "1000-0", 1800.0, 19);
      
       
    }

}