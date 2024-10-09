package ProvaU1;

import java.util.Random;

public class CadernetaPoupanca extends Thread {
    private String titular;
    private int diaAniversario;
    private double depositoInicial;
    private double rendimentoAcumulado;
    private final double MAX = 1.0;
    private final double MIN = 0.5;
    private final int pausa = 2;
    private final Random random = new Random();

    public CadernetaPoupanca(String titular, int diaAniversario, double depositoInicial, double rendimentoAcumulado)
            throws Exception {
        this.titular = titular;
        this.diaAniversario = diaAniversario;
        if (diaAniversario < 1 || diaAniversario > 31) {
            throw new Exception("Dia de aniversario inválido!");
        }
        this.depositoInicial = depositoInicial;
        this.rendimentoAcumulado = rendimentoAcumulado;
    }

    public void atualizarRendimento(double prTaxa) {
        if (prTaxa > 0) {
            prTaxa = prTaxa / 100;
            this.rendimentoAcumulado = depositoInicial * prTaxa;
        } else {
            System.out.println("Não é possivel adicionar um taxa menor que 1");
        }
    }

    public double getSaldo() {
        return depositoInicial + rendimentoAcumulado;
    }

    public double getTaxaRendimentoAcumulada() {
        return rendimentoAcumulado / depositoInicial;
    }

    public String getTitular() {
        return this.titular;
    }

    public int getDiaAniversario() {
        return this.diaAniversario;
    }

    public double getDepositoInicial() {
        return this.depositoInicial;
    }

    public double getRendimentoAcumulado() {
        return this.rendimentoAcumulado;
    }

    public double getTaxaAleatoria() {
        return random.nextDouble() * (MAX - MIN) + MIN;
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                atualizarRendimento(getTaxaAleatoria());
                sleep(pausa * 1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
