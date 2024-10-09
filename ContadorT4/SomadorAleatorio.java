package ContadorT4;

import java.util.Random;

public class SomadorAleatorio extends Thread {

    public static final int MIN = 0;
    public static final int MAX = 100;
    public static final int pausa = 5;

    private int soma;
    private boolean inativo = false;

    public int getSoma() {
        return soma;
    }

    public void desativar() {
        this.inativo = true;
    }

    public void run() {
        while (!inativo) {
            Random random = new Random();
            int n = random.nextInt((MAX - MIN) + 1) + MIN;
            soma += n;
            try {
                sleep(pausa * 1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
