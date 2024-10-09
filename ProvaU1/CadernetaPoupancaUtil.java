package ProvaU1;

import java.util.Scanner;
import java.util.Arrays;

public class CadernetaPoupancaUtil {
    public static void main(String[] args) throws Exception {
        CadernetaPoupanca[] c1 = new CadernetaPoupanca[7];

        c1[0] = new CadernetaPoupanca("Eica", 11, 300.0, 1.5);
        c1[1] = new CadernetaPoupanca("Maria",30 , 400.0, 2.5);
        c1[2] = new CadernetaPoupanca("Carlos", 15, 500.0, 3.5);
        c1[3] = new CadernetaPoupanca("Ana", 19, 250.0, 3.5);
        c1[4] = new CadernetaPoupanca("Joao", 21, 100.0, 3.5);
        c1[5] = new CadernetaPoupanca("Pedro", 25, 150.0, 3.5);
        c1[6] = new CadernetaPoupanca("Paulo", 29, 200.0, 3.5);

        c1[1].atualizarRendimento(20);

        System.out.println(c1[1].getTitular());
        System.out.println(c1[1].getRendimentoAcumulado());
        System.out.println(c1[1].getDiaAniversario());
        System.out.println(c1[1].getSaldo());
        System.out.println(c1[1].getTaxaRendimentoAcumulada());

        System.out.println("---------------------------------------------------------");

        System.out.println(c1[2].getTitular());
        System.out.println(c1[2].getRendimentoAcumulado());
        System.out.println(c1[2].getDiaAniversario());
        System.out.println(c1[2].getSaldo());
        System.out.println(c1[2].getTaxaRendimentoAcumulada());
    }
}
