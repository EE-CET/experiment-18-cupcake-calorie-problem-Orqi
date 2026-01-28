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

        // 1. Sort ascending (Java's default)
        Arrays.sort(calories);

        long totalMiles = 0;
        
        // 2. Iterate backwards to pick the largest calorie first
        // i: index of the array (n-1 down to 0)
        // j: the power of 2 (0 up to n-1)
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            // totalMiles += calorie * 2^j
            totalMiles += calories[i] * (1L << j);
        }

        System.out.println(totalMiles);
        sc.close();
    }
}