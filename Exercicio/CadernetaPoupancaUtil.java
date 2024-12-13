package Exercicio;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
public class CadernetaPoupancaUtil {
    public static void main(String[] agrs) {

        LinkedList<CadernetaPoupanca> cadernetas = new LinkedList<>();
        cadernetas.add(new CadernetaPoupanca("Erica", 20, 500));
        cadernetas.add(new CadernetaPoupanca("Alana", 9, 0));
        cadernetas.add(new CadernetaPoupanca("Laura", 13, 600));
        cadernetas.add(new CadernetaPoupanca("Jean", 10, 1000));
        cadernetas.add(new CadernetaPoupanca("Vanessa", 25, 700));
        cadernetas.add(new CadernetaPoupanca("Luiza", 30, 458));
        cadernetas.add(new CadernetaPoupanca("Laina", 20, 789));

        System.out.println(cadernetas.size());
        System.out.println(cadernetas.isEmpty());

        Scanner escolha = new Scanner(System.in);
        String opcao = "";

        while(!opcao.equalsIgnoreCase("d")) {
            System.out.println("");
            System.out.println("ESCOLHA UMA OPÇÃO: ");
            System.out.println("a) Atualização do rendimento acumulado: ");
            System.out.println("b) Listagem dos titulares e saldos das referentes cadernetas: ");
            System.out.println("c) Listagem de depósito inicial, dia de aniversário e saldo de cadernetas: ");
            System.out.println("d) Encerrar aplicação: ");
            opcao = escolha.nextLine();
            
            switch (opcao) {
                case "a":
                    System.out.println("Digite o nome do titular: ");
                    String titular = escolha.nextLine();
                    System.out.println("Digite a taxa percentual de rendimento: ");
                    int valor = escolha.nextInt();
                    escolha.nextLine();

                    for(CadernetaPoupanca caderneta: cadernetas) {
                        if(caderneta.getTitular().equalsIgnoreCase(titular)) {
                            System.out.println("Titular: " + caderneta.getTitular());
                            System.out.println("Saldo anterior: " + caderneta.getSaldo()); 
                            double saldoAtual = (caderneta.getSaldo() + (valor));
                            caderneta.setRendimentoAcumulado(valor);
                            System.out.println("Saldo atual: " + (caderneta.getSaldo() + (valor)));   
                        }
                    }
                    break;
                
                case "b":
                    System.out.println("Digite o dia do aniversário: ");
                    int aniversario = escolha.nextInt();
                    escolha.nextLine();
                    for(CadernetaPoupanca caderneta: cadernetas) {
                        if(caderneta.getDiaAniversario() == (aniversario)) {
                            System.out.println("Titular: " + caderneta.getTitular());
                            System.out.println("Saldo: " + caderneta.getSaldo());
                        }
                    }
                    break;

                case "c":
                    System.out.println("Digite o nome do titular: ");
                    titular = escolha.nextLine();
                    escolha.nextInt();
                    for(CadernetaPoupanca caderneta: cadernetas) {
                        if(caderneta.getTitular().equalsIgnoreCase(titular)){
                            System.out.println("Deposito inicial: " + caderneta.getDepositoInicial());
                            System.out.println("Dia aniversário: " + caderneta.getDiaAniversario());
                            System.out.println("Saldo da caderneta: " + (caderneta.getDepositoInicial() + caderneta.getRendimentoAcumulado()));
                        }
                    }
                    break;

                case "d":
                    System.out.println(".....ENCERRANDO APLICAÇÃO.....");
                        Set<Integer> diaAniversario = new HashSet<>();
                        Queue<String> arraySaldo = new ArrayDeque<>();
                        for(CadernetaPoupanca caderneta: cadernetas) {
                            diaAniversario.add(caderneta.getDiaAniversario());
                            if(caderneta.getSaldo() == 0){
                                arraySaldo.add(caderneta.getTitular());
                            }
                        }
                        System.out.println(diaAniversario);
                        System.out.println(arraySaldo);
                    break;

                default:
                    break;
            }
        } 
        escolha.close();
    }
}
