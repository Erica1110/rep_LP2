public class Contato {
    private String nome;
    private String sobrenome;
    private String email;
    private int codigoTelefonicoPais;
    private long telefone;

    public Contato(String nome, String sobrenome, String email, int codigoTelefonicoPais, long telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.codigoTelefonicoPais = codigoTelefonicoPais;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public int getCodigoTelefonicoPais() {
        return codigoTelefonicoPais;
    }

    public long getTelefone() {
        return telefone;
    }

    public String getNumeroTelefoneFormatado() {
        String telefoneS = String.valueOf(telefone);

        if (telefoneS.length() < 10) {
            return "Número inválido";
        }

        String ddd = telefoneS.substring(0, 2);
        String parte1;
        String parte2;

        if (telefoneS.length() > 10) {
            parte1 = telefoneS.substring(2, 7);
            parte2 = telefoneS.substring(7);
        } else {
            parte1 = telefoneS.substring(2, 6);
            parte2 = telefoneS.substring(6);
        }

        return "+" + codigoTelefonicoPais + " (" + ddd + ") " + parte1 + "-" + parte2;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome + " - " + getNumeroTelefoneFormatado();
    }
}
