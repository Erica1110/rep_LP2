package ContadorT2;
public class ContadorUtil{
    public static void main(String[] args){
        ContadorLento t1 = new ContadorLento();
        Contador t2 = new Contador();
        ContadorParametrizado t3 = new ContadorParametrizado(5);

        t1.setName("Contador lento 01: ");
        t2.setName("Contador 02:" );
        t3.setName("Contador parametrizado:");

        t1.start();
        t2.start();
        t3.start();
    }
}