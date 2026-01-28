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
        
        // 2. Pair the largest calorie with the smallest power
        // i tracks the array from end to start (largest to smallest)
        // j tracks the power of 2 from 0 upwards
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            // miles += calorie * 2^j
            totalMiles += calories[i] * (1L << j);
        }

        System.out.println(totalMiles);
        sc.close();
    }
}