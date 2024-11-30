package aula07;

public class Listagem {
    // Listagem generica
    // o motodo necessariamente tem que ser de uma classe(Integer)
    // tem que descobrir qual a classe que se refere àquelet tipo(int = Integer;
    // double = Double)
    public static <T> void listarArray(T[] array) {
        System.out.println(" { ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
        System.out.println(" } ");
    }

    // Double com letra maiuscula significa que é uma classe
    public static void listarArray(Double[] array) {
        System.out.println(" { ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
        System.out.println(" } ");
    }

    public static void main(String[] args) {
        Integer[] array1 = new Integer[] { 7, 2, 3, 4, 5 };
        listarArray(array1);
        Double[] array2 = new Double[] { 1.1, 2.2, 3.3, 4.4, 5.5 };
        listarArray(array2);
    }

}
