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

        // 1. Sort ascending (e.g., [1, 3, 10])
        Arrays.sort(calories);

        long totalMiles = 0;
        
        // 2. THE FIX: Iterate BACKWARDS from the largest calorie
        // i starts at n-1 (the biggest value)
        // j starts at 0 (the exponent for 2^0)
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            // Formula: calorie * 2^j
            // 1L << j is the most precise way to handle 2^j in Java
            totalMiles += calories[i] * (1L << j);
        }

        System.out.println(totalMiles);
        sc.close();
    }
}