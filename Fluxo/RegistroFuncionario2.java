
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroFuncionario2 {
    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======== Dados de Funcionário ========");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); 

        Funcionario funcionario = new Funcionario(nome, salario);
        listaFuncionarios.add(funcionario);

        try {
            salvarFuncionariosArquivo("funcionarios.txt");
            System.out.println("Gravação de dados em arquivo concluída!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        scanner.close();
    }

    private static void salvarFuncionariosArquivo(String nomeArquivo) throws IOException {
        FileWriter fluxoArquivo = new FileWriter(nomeArquivo, true);
        for (Funcionario funcionario : listaFuncionarios) {
            fluxoArquivo.write(funcionario.toString() + System.lineSeparator());
        }
        fluxoArquivo.close();
    }
}
