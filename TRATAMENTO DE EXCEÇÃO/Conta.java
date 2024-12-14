public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

public void debitar(double valor) throws SI{

    if(saldo>= valor){
        saldo -= valor;
    } else{
        SI e = new SI();
        throw e;
    }
}
}


