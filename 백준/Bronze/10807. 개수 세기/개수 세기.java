import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        int i;
        int a[] = new int[n];
        int cnt = 0;

        for (i = 0; i <= n-1; i++) {
            a[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (a[i] == v) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
        }
    }
}