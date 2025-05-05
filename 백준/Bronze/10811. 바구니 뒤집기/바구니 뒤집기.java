import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int balls[] = new int[n];

            for (int i = 0; i < n; i++) {
                balls[i] = i + 1;
            }

            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                int start = a - 1;
                int end = b - 1;

                while (start < end) {
                    int temp = balls[start];
                    balls[start] = balls[end];
                    balls[end] = temp;
                    start++;
                    end--;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(balls[i] + " ");
            }
        }
    }
}