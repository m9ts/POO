import java.util.Arrays;

public class printArray {
    public static void main(String[] args) {
        int[] primes = { 2, 3, 5, 7, 11, 13, 17 };
        System.out.println("Referência do array: " + primes); // Mostra referência do array
        System.out.println("Array de primos: " + Arrays.toString(primes)); // Mostra os valores do array
    }
}
