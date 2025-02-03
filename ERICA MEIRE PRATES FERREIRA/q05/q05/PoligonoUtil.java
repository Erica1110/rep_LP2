package q05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PoligonoUtil {
    public static void main(String[] args) {
        List<Poligono> poligonos = new ArrayList<>();
        poligonos.add(new Poligono(3, 4, 5));
        poligonos.add(new Poligono(6, 6, 6, 6));
        poligonos.add(new Poligono(2, 3, 4, 5, 6));
        poligonos.add(new Poligono(3, 3, 3, 3, 3, 3));
        poligonos.add(new Poligono(1, 2, 3, 4, 5, 6, 7));

        Scanner scanner = new Scanner(System.in);
        String opcao = "";

        while (!opcao.equalsIgnoreCase("f")) {
            System.out.println("");
            System.out.println("ESCOLHA UMA OPÇÃO:");
            System.out.println("a) Listar todos os polígonos");
            System.out.println("b) Polígono com maior perímetro");
            System.out.println("c) Polígono com menor perímetro");
            System.out.println("d) Listar polígonos com uma determinada quantidade de lados");
            System.out.println("e) Mostrar percentual de cada tipo de polígono");
            System.out.println("f) Encerrar aplicação");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "a":
                    for (Poligono poligono : poligonos) {
                        System.out.println(poligono);
                    }
                    break;

                case "b":
                    Poligono maior = null;
                    for (Poligono poligono : poligonos) {
                        if (maior == null || poligono.getPerimetro() > maior.getPerimetro()) {
                            maior = poligono;
                        }
                    }
                    if (maior != null) {
                        System.out.println("Polígono com maior perímetro: " + maior);
                    }
                    break;

                case "c":
                    Poligono menor = null;
                    for (Poligono poligono : poligonos) {
                        if (menor == null || poligono.getPerimetro() < menor.getPerimetro()) {
                            menor = poligono;
                        }
                    }
                    if (menor != null) {
                        System.out.println("Polígono com menor perímetro: " + menor);
                    }
                    break;

                case "d":
                    System.out.println("Digite a quantidade de lados desejada:");
                    int qtdLados = scanner.nextInt();
                    scanner.nextLine();
                    for (Poligono poligono : poligonos) {
                        if (poligono.getClassificacao().equalsIgnoreCase(getNomePoligono(qtdLados))) {
                            System.out.println(poligono);
                        }
                    }
                    break;

                case "e":
                    int total = poligonos.size();
                    int triangulos = 0, quadrilateros = 0, pentagonos = 0, hexagonos = 0, heptagonos = 0;

                    for (Poligono poligono : poligonos) {
                        switch (poligono.getClassificacao()) {
                            case "Triângulo": triangulos++; break;
                            case "Quadrilátero": quadrilateros++; break;
                            case "Pentágono": pentagonos++; break;
                            case "Hexágono": hexagonos++; break;
                            case "Heptágono": heptagonos++; break;
                        }
                    }

                    System.out.println("Percentual de cada tipo de polígono:");
                    System.out.println("Triângulo: " + (triangulos * 100.0 / total) + "%");
                    System.out.println("Quadrilátero: " + (quadrilateros * 100.0 / total) + "%");
                    System.out.println("Pentágono: " + (pentagonos * 100.0 / total) + "%");
                    System.out.println("Hexágono: " + (hexagonos * 100.0 / total) + "%");
                    System.out.println("Heptágono: " + (heptagonos * 100.0 / total) + "%");
                    break;

                case "f":
                    System.out.println("Encerrando aplicação...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
        scanner.close();
    }

    private static String getNomePoligono(int lados) {
        switch (lados) {
            case 3: return "Triângulo";
            case 4: return "Quadrilátero";
            case 5: return "Pentágono";
            case 6: return "Hexágono";
            case 7: return "Heptágono";
            default: return "";
        }
    }
}
