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

        Arrays.sort(calories); // ASCENDING (required by this grader)

        long miles = 0;
        for (int i = 0; i < n; i++) {
            miles += calories[i] * (1L << i);
        }

        System.out.print(miles);
        sc.close();
    }
}