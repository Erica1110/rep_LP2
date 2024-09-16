package Thread;
class Thread2 implements Runnable{
    @Override
    public void run(){
        for(int j = 0; j < 10; j++){
            System.out.println("Thread 2: " + j);
        }
    }
}
    