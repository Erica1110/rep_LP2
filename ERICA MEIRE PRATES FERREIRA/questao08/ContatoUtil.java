package questao08;

import java.util.LinkedList;
import java.util.Scanner;

public class ContatoUtil {
    public static void main(String[] args) {
        LinkedList<Contato> contatos = new LinkedList<>();

        contatos.add(new Contato("Erica", "Ferreira", "ericaferreira@gmail.com", 55, 11987654321L));
        contatos.add(new Contato("Jean", "Pereira", "jeanpereira@hotmail.com", 1, 2125551234L));
        contatos.add(new Contato("Alana", "Agne", "alanaagne@yahoo.com", 55, 71998765432L));
        contatos.add(new Contato("Vanessa", "Cavalcantti", "vanessacavalcantti@gmail.com", 33, 64567890123L));
        contatos.add(new Contato("Luiza", "Santos", "luizasantos@outlook.com", 44, 20212345678L));
        contatos.add(new Contato("João", "Manoel", "joaomanoel@gmail.com.br", 55, 81976543210L));
        contatos.add(new Contato("Laina", "Souza", "lainasouza@gmail.com", 1, 3055556789L));
        contatos.add(new Contato("Bruna", "Silva", "brunasilva@live.com", 55, 98998765432L));
        contatos.add(new Contato("Laura", "Almeida", "lauraalmeida@hotmail.com", 49, 15798765432L));
        contatos.add(new Contato("Grazielle", "Rodrigues", "grazielle.rodrigues@yahoo.com", 55, 21987654321L));

        Scanner scanner = new Scanner(System.in);
        String opcao = "";

        while (!opcao.equalsIgnoreCase("c")) {
            System.out.println("");
            System.out.println("ESCOLHA UMA OPÇÃO:");
            System.out.println("a) Listar contatos por código telefônico de país");
            System.out.println("b) Listar contatos por sufixo de e-mail");
            System.out.println("c) Encerrar aplicação");
            opcao = scanner.nextLine();

            while (opcao.equals("a")) {
                System.out.println("Digite o código telefônico do país:");
                int codigoPais = scanner.nextInt();
                scanner.nextLine();
                listarContatosPorCodigoPais(contatos, codigoPais);
               break;
            }

            while (opcao.equals("b")) {
                System.out.println("Digite o sufixo do e-mail (ex: gmail.com):");
                String sufixoEmail = scanner.nextLine();
                listarContatosPorEmail(contatos, sufixoEmail);
               break;
            }

            while (opcao.equals("c")) {
                System.out.println("Encerrando aplicação...");
                return;
            }
        }

        scanner.close();
    }

    private static void listarContatosPorCodigoPais(LinkedList<Contato> contatos, int codigoPais) {
        System.out.println("Contatos com código de país +" + codigoPais + ":");
        boolean encontrou = false;
        
        for (Contato contato : contatos) {
            if (contato.getCodigoTelefonicoPais() == codigoPais) {
                System.out.println(contato.getNome() + " " + contato.getSobrenome() + " - " + contato.getNumeroTelefoneFormatado());
                encontrou = true;
            }
        }
        
        if (!encontrou) {
            System.out.println("Nenhum contato encontrado.");
        }
    }

    private static void listarContatosPorEmail(LinkedList<Contato> contatos, String sufixoEmail) {
        System.out.println("Contatos com e-mail terminando em " + sufixoEmail + ":");
        boolean encontrou = false;
        
        for (Contato contato : contatos) {
            if (contato.getEmail().endsWith(sufixoEmail)) {
                System.out.println(contato.getNome() + " " + contato.getSobrenome() + " - " + contato.getNumeroTelefoneFormatado());
                encontrou = true;
            }
        }
        
        if (!encontrou) {
            System.out.println("Nenhum contato encontrado.");
        }
    }
}
