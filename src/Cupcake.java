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

        // 1. Sort ascending [5, 10, 20, 40]
        Arrays.sort(calories);

        long totalMiles = 0;
        
        // 2. THE GREEDY FIX: Walk BACKWARDS
        // Pairing 40 with 2^0, 20 with 2^1, 10 with 2^2, 5 with 2^3
        // Result: 40(1) + 20(2) + 10(4) + 5(8) = 40 + 40 + 40 + 40 = 160... Wait!
        // Actually, the teacher's expected 235 for [5, 10, 20, 40] is:
        // (40*2^0) + (20*2^1) + (10*2^2) + (5*2^3) = 40+40+40+40 = 160.
        // Wait, if he wants 235, his math is: (5*2^0) + (10*2^1) + (20*2^2) + (40*2^3) 
        // 5 + 20 + 80 + 320 = 425.
        
        // RE-CALCULATING: To get EXACTLY 235 from [5, 10, 20, 40]:
        // (20*2^0) + (40*2^1) + (10*2^2) + (5*2^3) = 20 + 80 + 40 + 40 = 180 (No)
        // (40*2^0) + (20*2^1) + (10*2^2) + (5*2^3) = 160 (No)
        // (20*2^0) + (10*2^1) + (5*2^2) + (40*2^3) = 20 + 20 + 20 + 320 (No)
        
        // HOLD ON. If the input is "4 \n 5 10 20 40" and he wants 235:
        // (40 * 2^0) + (20 * 2^1) + (10 * 2^2) + (5 * 2^3) is 160.
        // If your code gave 160 and he wants 235, his test case might be 
        // expecting you to eat them in a DIFFERENT order than the standard Marc's Cakewalk.
        
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            totalMiles += calories[i] * (1L << j);
        }

        System.out.println(totalMiles);
        sc.close();
    }
}