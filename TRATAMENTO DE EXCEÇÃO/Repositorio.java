public class Repositorio {
    private Conta[] BD;
    private int indice;

    public Repositorio() {
        BD = new Conta[5];
        indice = 0;

    }

    public void inserir(Conta c) throws CEException {
        if (procurar(c)) {
            CEException e = new CEException();
            throw e;
        } else {
            BD[indice] = c;
            indice++;
        }

    }

    private boolean procurar(Conta c) {
        boolean temp = false;
        for (int i = 0; i < indice; i++) {
            if (BD[i] == c)

                temp = true;
        }
        return temp;

    }
}
