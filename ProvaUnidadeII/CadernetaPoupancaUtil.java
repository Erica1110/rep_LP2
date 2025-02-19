import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Queue;
import java.util.ArrayDeque;

public class CadernetaPoupancaUtil {
       public static void main(String[] args) {
        LinkedList<CadernetaPoupanca> cadernetas = new LinkedList<CadernetaPoupanca>();

        cadernetas.add(new CadernetaPoupanca("Alana", 22, 230));
        cadernetas.add(new CadernetaPoupanca("Erica", 30, 400));
        cadernetas.add(new CadernetaPoupanca("Joao", 6, 300));
        cadernetas.add(new CadernetaPoupanca("Vanessa", 9, 0));
        cadernetas.add(new CadernetaPoupanca("Laura", 28, 650));
        cadernetas.add(new CadernetaPoupanca("Jean", 25, 300));
        cadernetas.add(new CadernetaPoupanca("Luiza", 22, 500));

        Scanner escolha = new Scanner(System.in);
        String opcao = "";

        while (!opcao.equalsIgnoreCase("d")) {
            System.out.println("");
            System.out.println("ESCOLHA UMA OPÇÃO:");
            System.out.println("a) Atualização do rendimento acumulado: ");
            System.out.println("b) Listagem de titulares com base na aniversário: ");
            System.out.println("c) Informações do titular: ");
            System.out.println("d) Encerrar aplicação: ");
            opcao = escolha.nextLine();
            

            switch (opcao) {
                case "a":
                    System.out.println("Digite o nome do titular: ");
                    String titular = escolha.nextLine();
                    System.out.println("Digite a taxa percentual de rendimento: ");
                    int valor = escolha.nextInt();
                    escolha.nextLine();

                    for (CadernetaPoupanca caderneta : cadernetas) {
                        if (caderneta.getTitular().equalsIgnoreCase(titular)) {
                            System.out.println("Saldo anterior: " + caderneta.getSaldo());

                            System.out.println("Saldo atual: " + (caderneta.getSaldo() + (valor)));
                        }
                    }
                    break;

                case "b":
                    System.out.println("Digite o dia do aniversário desejado: ");
                    int aniversario = escolha.nextInt();
                    escolha.nextLine();
                    System.out.println("Titulares com a data requerida: ");
                    for (CadernetaPoupanca caderneta : cadernetas) {
                        if (caderneta.getDiaAniversario() == (aniversario)) {
                            System.out.println(
                                    "Nome: " + caderneta.getTitular() + ", " + "Saldo: " + caderneta.getSaldo());
                        }
                    }
                    break;

                case "c":
                    System.out.println("Digite o nome do titular: ");
                    titular = escolha.nextLine();
                    for (CadernetaPoupanca caderneta : cadernetas) {
                        if (caderneta.getTitular().equalsIgnoreCase(titular)) {
                            System.out.println("Deposito inicial: " + caderneta.getDepositoInicial());
                            System.out.println("Dia do aniversário: " + caderneta.getDiaAniversario());
                            System.out.println("Saldo da caderneta: " + caderneta.getSaldo());
                        }
                    }

                    break;

                case "d":
                    System.out.println("Encerrando aplicação...");
                    Set<Integer> diaAniversario = new HashSet<>();
                    Queue<String> filaTitulares = new ArrayDeque<>();
                    for(CadernetaPoupanca caderneta: cadernetas) {
                        diaAniversario.add(caderneta.getDiaAniversario());
                        if(caderneta.getSaldo() == 0) {
                            filaTitulares.add(caderneta.getTitular());
                        }
                       
                    }
                    System.out.println("Titulares com saldo zero: " + filaTitulares);
                    System.out.println("Dia aniversários distintos: " + diaAniversario);
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!!!");
                    break;
            }
        }
        escolha.close();
    }
}
