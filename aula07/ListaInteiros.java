package aula07;

public class ListaInteiros<T> {
    private T[] valores;
    private int qtd = 0;

    @SuppressWarnings("unchecked")
    public ListaInteiros(int tam) {
        valores = (T[]) new Object[tam];
    }

    public void listar() {
        System.out.println(" { ");
        for (int i = 0; i < qtd; i++) {
            System.out.println(valores[i] + "");
        }
        System.out.println(" } ");
    }

    public void adicionar(T item) {
        if (qtd < valores.length) {
            valores[qtd] = item;
            qtd++;
        }
    }
}
