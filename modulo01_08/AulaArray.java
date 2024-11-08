package modulo01_08;

import java.util.Arrays;
import java.util.Comparator;

public class AulaArray {
    public static void main(String[] args) {
//        int[] notas = new int[5];
//        int[] notas = new int[]{8, 5, 4, 9, 10};
        Integer[] notas = {8, 5, 4, 9, 10};
        //System.out.println(media(notas));

        Arrays.sort(notas, Comparator.reverseOrder());
        Integer[] notas2 = Arrays.copyOf(notas, notas.length+1);

        System.out.println(Arrays.toString(notas));
    }

    private static double media(int[] array) {
        int soma = 0;
        for (int i : array) {
            soma += i;
        }
        return (double) soma / array.length;
    }
}
