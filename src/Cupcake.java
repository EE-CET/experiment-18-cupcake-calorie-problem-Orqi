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

        // Sort ascending [Small -> Large]
        Arrays.sort(calories);

        long totalMiles = 0;
        
        // Let's use the standard greedy loop:
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            totalMiles += calories[i] * (long)Math.pow(2, j);
        }

        System.out.println(totalMiles);
        sc.close();
    }
}