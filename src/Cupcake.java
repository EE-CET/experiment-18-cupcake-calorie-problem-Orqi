import java.util.Scanner;
import java.util.Arrays;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long[] calories = new long[n];

        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextLong();
        }

        // 1. Sort ascending (smallest to largest)
        Arrays.sort(calories);

        long totalMiles = 0;
        
        // 2. THE GREEDY FIX: Walk BACKWARDS
        // i: index of array (starts at n-1 for the BIGGEST cupcake)
        // j: the power (starts at 0 for 2^0)
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            // Using 1L << j is required to pass the "Larger Input" test
            totalMiles += calories[i] * (1L << j);
        }

        System.out.println(totalMiles);
        sc.close();
    }
}