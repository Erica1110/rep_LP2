package ContadorT2;

public class ContadorLento extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Contagem lenta: " + getName() + ":" + i);
            try{
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}