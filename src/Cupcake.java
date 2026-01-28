import java.util.Scanner;
import java.util.Arrays;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Standard check for input
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long[] calories = new long[n];

        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextLong();
        }

        // 1. Sort the cupcakes (Default is smallest to largest)
        Arrays.sort(calories);

        long totalMiles = 0;
        
        // 2. THE GREEDY FIX: 
        // We eat the BIGGEST cupcake first (index n-1) with the smallest power (2^0).
        // i goes from n-1 down to 0
        // j goes from 0 up to n-1
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            // totalMiles += calorie * 2^j
            // (1L << j) is the most precise way to get 2^j for 'long' types
            totalMiles += calories[i] * (1L << j);
        }

        // Print the final result
        System.out.println(totalMiles);
        sc.close();
    }
}