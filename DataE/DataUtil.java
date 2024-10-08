package DataE;
import java.util.Scanner;
public class DataUtil{
    public static void main(String[] args){
        int d;
        int m;
        int a;

        Data data;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dia(1 - 31)");
        d = scanner.nextInt();
        System.out.println("Informe um mês(1 - 12)");
        m = scanner.nextInt();
        System.out.println("Digite um ano");
        a = scanner.nextInt();

        data = new Data(m, d, a);

        System.out.println("Data: " + ((Object)data).toString());
        
        scanner.close();
    }

}
