import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        try (Scanner sc = new Scanner (System.in)) {
            int x = sc.nextInt();
            int n = sc.nextInt();
            int i;
            int j = 0;

            for (i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                j = j + (a * b);
            }
            if (x == j) {
                System.out.println ("Yes");
            } else {
                System.out.println ("No");
            }
        }
    }
}