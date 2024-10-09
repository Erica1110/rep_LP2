package ContadorT2;
public class Contador extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Contagem:" + getName() + ":" + i);
            try{
                sleep(3000);
            } catch(InterruptedException e){
                    e.printStackTrace();
            }
        }
    }
}