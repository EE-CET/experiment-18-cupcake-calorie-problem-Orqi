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

        // 1. Sort ascending (e.g., [2, 5, 10])
        Arrays.sort(calories);

        long totalMiles = 0;
        
        // 2. Greedy approach: 
        // Start from the end of the array (largest calorie)
        // Pair it with the lowest power of 2 (j = 0)
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            // totalMiles += calorie * 2^j
            // Using 1L << j is the most precise way to handle 2^j in Java
            totalMiles += calories[i] * (1L << j);
        }

        System.out.println(totalMiles);
        sc.close();
    }
}