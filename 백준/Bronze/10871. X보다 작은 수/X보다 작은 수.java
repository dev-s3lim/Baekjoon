import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int i;
            int a[] = new int[n];

            for (i = 0; i <= n-1; i++) {
                a[i] = sc.nextInt();

                if (a[i] < x){
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}