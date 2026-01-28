import java.util.Scanner;
import java.util.Arrays;

public class Cupcake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] calories = new int[n];

        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt();
        }

        // Sort in ascending order
        Arrays.sort(calories);

        // Reverse to get descending order
        for (int i = 0; i < n / 2; i++) {
            int temp = calories[i];
            calories[i] = calories[n - 1 - i];
            calories[n - 1 - i] = temp;
        }

        long miles = 0;
        for (int i = 0; i < n; i++) {
            miles += calories[i] * (1L << i);
        }

        System.out.print(miles);
        sc.close();
    }
}