package Exercicio;

import java.util.LinkedList;
import java.util.Scanner;

public class CadernetaPoupancaUtil {
    public static void main(String[] agrs) {

        LinkedList<CadernetaPoupanca> cadernetas = new LinkedList<>();
        cadernetas.add(new CadernetaPoupanca("Erica", 20, 500));
        cadernetas.add(new CadernetaPoupanca("Alana", 21, 900));
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
            
            switch (opcao) {
                case "a":
                    
                    break;
                
                case "b":

                    break;

                case "c":
                
                    break;

                case "d":

                    break;

                default:
                    break;
            }
        } 
        escolha.close();
    }
}
