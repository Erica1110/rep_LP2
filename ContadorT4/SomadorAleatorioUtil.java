package ContadorT4;
import java.util.Scanner;
public class SomadorAleatorioUtil {
    public static void main(String[] args){
        SomadorAleatorio somador = new SomadorAleatorio();
        Scanner scanner = new Scanner(System.in);

        somador.start();
        String resp;

        do{
            System.out.println("Consultar somador ou encerrar: ");
            resp = scanner.nextLine();

            if(resp.toLowerCase().charAt(0) == 'c')
                System.out.println("Soma:" + somador.getSoma());
        } while(resp.toLowerCase().charAt(0) != 'e');

        somador.desativar();
        scanner.close();
    }
}
