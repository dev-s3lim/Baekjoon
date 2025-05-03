import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i;
            int a[] = new int[n];

            for (i = 0; i <= n-1; i++) {
                a[i] = sc.nextInt();
            }

            int max = a[0];
            int min = a[0];

            for (i = 0; i <= n-1; i++) {
                if (a[i] > max) {
                    max = a[i];
                }

                if (a[i] < min) {
                    min = a[i];
                }
            }
            
            System.out.println(min + " " + max);
        }
    }
}