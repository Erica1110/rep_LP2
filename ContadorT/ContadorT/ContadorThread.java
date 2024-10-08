package ContadorT;

public class ContadorThread extends Thread {
        public void run(){
            for(int i = 0; i < 5; i++){
                System.out.println("Contagem atual de" + getName() + " : " + i);
            }
        }
}