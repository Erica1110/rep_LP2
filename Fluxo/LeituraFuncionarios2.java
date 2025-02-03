import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LeituraFuncionarios2 {

	public static void main(String[] args) {

		ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

		Scanner input = null;

		try {
			FileReader leitor = new FileReader("funcionario.txt");
			input = new Scanner(leitor);

			while (input.hasNext()) {
				String linha = input.nextLine();

				StringTokenizer separador = new StringTokenizer(linha);

				String nome = separador.nextToken();
				double salario = Double.parseDouble(separador.nextToken());

				Funcionario func = new Funcionario(nome, salario);

				listaFuncionarios.add(func);

			}

			double soma = 0.0;

			for (Funcionario func : listaFuncionarios) {
				System.out.println(func.getNome() + " - " + func.getSalario());
				soma += func.getSalario();
			}

			double media = 0.0;
			media = soma / listaFuncionarios.size();
			System.out.println("\nMédia: " + media);

			leitor.close();
		}

		catch (FileNotFoundException e) {
			System.out.println("Arquivo a ser lido inexistente!");
		}

		catch (IOException e) {
			System.out.println("Erro de entrada/saída!");
		}

	}

}
