import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i;
            int p = 0;
            int a[] = new int[9];

            for (i = 0; i < 9; i++) {
                a[i] = sc.nextInt();
            }

            int max = a[0];

            for (i = 0; i < 9; i++) {
                if (a[i] > max) {
                    max = a[i];
                    p = i;
                }
            }

            System.out.println(max);
            System.out.println(p+1);
        }
    }
}