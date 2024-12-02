package ProvaUnidadeII;

import java.util.Scanner;
import java.util.ArrayList;

public class CadernetaPoupancaUtil {
    public static void main(String[] args) {
        ArrayList<CadernetaPoupanca> cadernetas = new ArrayList<CadernetaPoupanca>();
        cadernetas.add(new CadernetaPoupanca("Erica", 21, 100, 80));
        cadernetas.add(new CadernetaPoupanca("Alana", 30, 230, 10));
        cadernetas.add(new CadernetaPoupanca("Laura", 24, 1000, 30));
        cadernetas.add(new CadernetaPoupanca("Laina", 29, 300, 90));
        cadernetas.add(new CadernetaPoupanca("Jean", 14, 1000, 20));
        cadernetas.add(new CadernetaPoupanca("Joao", 22, 1440, 30));
        cadernetas.add(new CadernetaPoupanca("Bruna", 24, 7900, 40));

        System.out.println(cadernetas.size());
        System.out.println(cadernetas);

        Scanner escolha = new Scanner(System.in);
        String opcao = "";

        while (!opcao.equalsIgnoreCase("d")) {

            System.out.println("Escolha uma opção(a - d): ");
            System.out.println("a) Atualização do rendimento. ");
            System.out.println("b) Listagem dos nomes dos titulares e saldos das cadernetas: ");
            System.out.println("c) Listagem de depósito inicial, dia de aniversário e saldo do titular: ");
            System.out.println("d) Encerrar operação... ");
            opcao = escolha.nextLine();

            switch (opcao) {
                case "a":
                    System.out.println("Digite o nome do titular: ");
                    String titular = escolha.nextLine();
                    System.out.println("Digite o valor do rendimento: ");
                    int valor = escolha.nextInt();
                    escolha.nextLine();

                    for (CadernetaPoupanca caderneta : cadernetas) {
                        if (caderneta.getTitular().equalsIgnoreCase(titular)) {
                            double saldoAnterior = caderneta.getDepositoInicial() + caderneta.getRendimentoAcumulado();
                            System.out.println("Saldo antes da atualização: " + saldoAnterior);

                            caderneta.atualizarRendimento(valor);
                            double saldoAtual = caderneta.getDepositoInicial() + caderneta.getRendimentoAcumulado();
                            System.out.println("Saldo atual: " + saldoAtual);
                            break;
                        }
                    }
                    break;

                case "b":
                    System.out.println("Digite a data de aniversário:");
                    int data = escolha.nextInt();
                    escolha.nextLine();
                    for (CadernetaPoupanca caderneta : cadernetas) {
                        if (caderneta.getDiaAniversario() == data) {
                            System.out.println("Titular:" + caderneta.getTitular());
                            System.out.println("Saldo:" + caderneta.getSaldo());
                        }
                    }
                    break;

                case "c":
                    System.out.println("Digite o nome do titular:");
                    String nome = escolha.nextLine();
                    for (CadernetaPoupanca caderneta : cadernetas) {
                        if (caderneta.getTitular().equalsIgnoreCase(nome)) {
                            System.out.println("Depósito inicial: " + caderneta.getDepositoInicial());
                            System.out.println("Dia de aniversário: " + caderneta.getDiaAniversario());
                            System.out.println("Saldo: " + (caderneta.getDepositoInicial() + caderneta.getRendimentoAcumulado()));
                        }
                    }
                    break;

                case "d":
                    System.out.println("Encerrando aplicação.....");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        escolha.close();

    }

}
