package Thread;
import java.lang.*;
public class TesteThread {
        //cria intancias da classe 
            public static void main(String[] args){
            Runnable t1 = new Thread1();
            Runnable t2 = new Thread2();
    
            //cria e inicia as threads
            new Thread(t1).start();
            new Thread(t2).start();
        }
    
}
