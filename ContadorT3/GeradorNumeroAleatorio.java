package ContadorT3;
import java.util.Scanner;
import java.util.Random;

public class GeradorNumeroAleatorio {
    public static void main(String[] args){
        int n1;
        int n2;
        int r;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o intervalo11: ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        r = random.nextInt(n1 + n2 + 1);
        System.out.println("Número pseudoaleatótio: " + r);

        scanner.close();

    }
}
