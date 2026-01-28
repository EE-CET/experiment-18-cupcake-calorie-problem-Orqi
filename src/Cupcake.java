import java.util.Scanner;
import java.util.Arrays;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Safety check for empty inputs
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        long[] calories = new long[n];

        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextLong();
        }

        // 1. Sort ascending (e.g., [2, 5, 10])
        Arrays.sort(calories);

        long totalMiles = 0;
        
        // 2. THE FIX: Loop BACKWARDS (n-1 down to 0)
        // This ensures the BIGGEST calorie (calories[n-1]) is multiplied by 2^0
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            // Using 1L << j is the standard for 2^j to avoid Math.pow precision loss
            totalMiles += calories[i] * (1L << j);
        }

        // Use println to ensure the output stream is flushed correctly for the grader
        System.out.println(totalMiles);
        sc.close();
    }
}