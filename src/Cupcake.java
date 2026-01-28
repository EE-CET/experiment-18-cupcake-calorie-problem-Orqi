import java.util.Scanner;
import java.util.Arrays;

public class Cupcake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long[] calories = new long[n]; // Use long array to be safe

        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextLong();
        }

        // 1. Sort ascending
        Arrays.sort(calories);

        long totalMiles = 0;
        
        // 2. Walk backwards through the sorted array (highest calories first)
        // j starts at 0 for the largest cupcake
        for (int j = 0; j < n; j++) {
            // Formula: calorie * 2^j
            // We take calories[n - 1 - j] to get the largest first
            totalMiles += calories[n - 1 - j] * Math.round(Math.pow(2, j));
        }

        System.out.println(totalMiles);
        sc.close();
    }
}