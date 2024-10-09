package ContadorT3;

import java.util.Random; //Random é uma classe que gera numeros aleatorios

public class SomadorAleatorio extends Thread {
    public final int MIN = 1;
    public final int MAX = 10;
    public final int pausa = 5;

    private int soma;

    public int getSoma() {
        return soma;
    }

    public void run() {
        Random random = new Random();

        while (true) {
            int n = random.nextInt((MAX - MIN) - 1) + MIN;
            soma += n;
            try {
                sleep(pausa * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
