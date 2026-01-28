import java.util.Scanner;
import java.util.Arrays;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read input
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long[] calories = new long[n];

        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextLong();
        }

        // 2. Sort cupcakes (ascending: 1, 2, 3...)
        Arrays.sort(calories);

        long totalMiles = 0;
        
        // 3. THE GREEDY FIX:
        // Walk BACKWARDS through the sorted array (biggest cupcakes first).
        // i: index of the array (n-1 down to 0)
        // j: the power of 2 (starts at 0)
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            // (1L << j) is 2^j. The 'L' is CRITICAL for large inputs.
            // This pairs the largest calorie with 2^0, the next with 2^1, etc.
            totalMiles += calories[i] * (1L << j);
        }

        // 4. Print result
        System.out.println(totalMiles);
        sc.close();
    }
}