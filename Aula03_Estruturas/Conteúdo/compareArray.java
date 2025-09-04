package Conteúdo;

import java.util.Arrays;

public class compareArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3, 4, 9 };

        if (Arrays.equals(a, b)) {
            System.out.println("Mesmo conteúdo!");
        } else {
            System.out.println("Conteúdos diferentes!");
        }
    }
}
