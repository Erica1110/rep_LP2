
public class app {
    public static void main(String[] args) throws Exception {

        Conta c1 = new Conta("78912310-1", 500);
         Conta c2 = new Conta("754-1", 50);
        try {
            c1.creditar(50);
            c1.debitar(500);
        } catch (Exception e) {
     System.out.println("Erro: "+ e);
        }


Repositorio BD = new Repositorio();
BD.inserir(c2);
try {
    BD.inserir(c2);
} catch (Exception e) {
    System.out.println("Erro: " + e);
}




    }



}