package ExercicioThread;

public class TesteThread extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(getName() + i);
            try{
                sleep(5000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}