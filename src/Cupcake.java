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

        // Sort in descending order
        Arrays.sort(calories);
        for (int i = 0; i < n / 2; i++) {
            int temp = calories[i];
            calories[i] = calories[n - 1 - i];
            calories[n - 1 - i] = temp;
        }

        long miles = 0;
        for (int j = 0; j < n; j++) {
            miles += (long) calories[j] * (1L << j); // c * 2^j
        }

        System.out.print(miles);
        sc.close();
    }
}