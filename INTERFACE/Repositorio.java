
public class Repositorio {
    private Socio BD[];
    private int indice;

    public Repositorio() {
        BD = new Socio[5];
        indice = 0;

    }

    public void inserir(Socio s) {

        BD[indice] = s;
        indice++;

    }

    public void remover(String m) {
        for (int i = 0; i < indice; i++) {
            if (BD[i].matricula.equals(m)) {
                BD[i] = BD[indice - 1];
                BD[indice - 1] = null;
                i--;
            }

        }

    }

    public Socio maisVelho(Socio s) {
        Socio temp = BD[0];

        for (int i = 0; i < indice; i++) {
            if (BD[i].idade > temp.idade) {
                temp = BD[i];

            }
        }

        return temp;
    }
}
