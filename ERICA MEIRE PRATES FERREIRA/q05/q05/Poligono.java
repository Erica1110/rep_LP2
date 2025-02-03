package q05;

public class Poligono {
    private int lado1;
    private int lado2;
    private int lado3;
    private int lado4;
    private int lado5;
    private int lado6;
    private int lado7;
    private int quantidadeLados;

    public Poligono(int lado1, int lado2, int lado3) {
        this(lado1, lado2, lado3, 0, 0, 0, 0);
    }

    public Poligono(int lado1, int lado2, int lado3, int lado4) {
        this(lado1, lado2, lado3, lado4, 0, 0, 0);
    }

    public Poligono(int lado1, int lado2, int lado3, int lado4, int lado5) {
        this(lado1, lado2, lado3, lado4, lado5, 0, 0);
    }

    public Poligono(int lado1, int lado2, int lado3, int lado4, int lado5, int lado6) {
        this(lado1, lado2, lado3, lado4, lado5, lado6, 0);
    }

    public Poligono(int lado1, int lado2, int lado3, int lado4, int lado5, int lado6, int lado7) {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 || lado4 < 0 || lado5 < 0 || lado6 < 0 || lado7 < 0) {
            throw new IllegalArgumentException("Os lados devem ser positivos");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
        this.lado5 = lado5;
        this.lado6 = lado6;
        this.lado7 = lado7;

        this.quantidadeLados = calcularQuantidadeLados();
    }

    private int calcularQuantidadeLados() {
        int contador = 0;
        if (lado1 > 0) contador++;
        if (lado2 > 0) contador++;
        if (lado3 > 0) contador++;
        if (lado4 > 0) contador++;
        if (lado5 > 0) contador++;
        if (lado6 > 0) contador++;
        if (lado7 > 0) contador++;
        return contador;
    }

    public int getPerimetro() {
        return lado1 + lado2 + lado3 + lado4 + lado5 + lado6 + lado7;
    }

    public String getClassificacao() {
        if (quantidadeLados == 3) {
            return "Triângulo";
        } else if (quantidadeLados == 4) {
            return "Quadrilátero";
        } else if (quantidadeLados == 5) {
            return "Pentágono";
        } else if (quantidadeLados == 6) {
            return "Hexágono";
        } else if (quantidadeLados == 7) {
            return "Heptágono";
        } else {
            return "Polígono inválido";
        }
    }

    public int[] getComprimentosLados() {
        return new int[] {lado1, lado2, lado3, lado4, lado5, lado6, lado7};
    }

    @Override
    public String toString() {
        return getClassificacao() + " com lados de comprimento " + listarLados();
    }

    private String listarLados() {
        String resultado = "";
        if (lado1 > 0) resultado += lado1 + ", ";
        if (lado2 > 0) resultado += lado2 + ", ";
        if (lado3 > 0) resultado += lado3 + ", ";
        if (lado4 > 0) resultado += lado4 + ", ";
        if (lado5 > 0) resultado += lado5 + ", ";
        if (lado6 > 0) resultado += lado6 + ", ";
        if (lado7 > 0) resultado += lado7 + ", ";

        if (!resultado.isEmpty()) {
            resultado = resultado.substring(0, resultado.length() - 2); 
        }

        return resultado;
    }
}
