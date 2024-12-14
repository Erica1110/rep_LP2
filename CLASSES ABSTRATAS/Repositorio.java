public class Repositorio {
    private Socio[] BD;
    private int indice;

    public Repositorio() {
        BD = new Socio[5];
        indice = 0;
    }

    public void inserir(Socio s1) {
        BD[indice] = s1;
        indice++;
    }

    public void remover(Socio s1) {
        for (int i = 0; i < indice; i++) {
            if (BD[i] == s1) {
                BD[i] = BD[indice - 1];
                BD[indice - 1] = null;
                i--;
            }
        }
    }

    public void relatorio() {
        for (int i = 0; i < indice; i++) {
            BD[i].imprimir();
        }
    }
}
