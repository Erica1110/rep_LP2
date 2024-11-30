package aula07;

public class ListaGenericaUtil {
    public static void main(String[] args){
        ListaInteiros<Integer> l1 = new ListaInteiros<Integer>(tam:2);
        ListaInteiros<String> l2 = new ListaInteiros<String>(tam:2);
        l1.adicionar(1);
        l1.listar();
        l2.adicionar("um");
        l2.listar();
     }
}
