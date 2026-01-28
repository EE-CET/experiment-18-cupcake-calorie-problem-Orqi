import java.util.Scanner;

public class Cupcake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long miles = 0;

        for (int i = 0; i < n; i++) {
            long c = sc.nextLong();
            miles += c * (1L << i);
        }

        System.out.print(miles);
        sc.close();
    }
}