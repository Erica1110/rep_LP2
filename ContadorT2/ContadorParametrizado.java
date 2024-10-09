package ContadorT2;

public class ContadorParametrizado extends Thread {
    private int segundosEspera;

    public ContadorParametrizado(int segundosEspera) {
        this.segundosEspera = segundosEspera;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Contagem parametrizada: " + getName() + ":" + i);
            try {
                sleep(segundosEspera * 2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
