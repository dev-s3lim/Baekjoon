import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = (b%10)*a;
            int d = ((b/10)%10)*(a*10);
            int e = ((b/100)%10)*(a*100);
            System.out.println(c);
            System.out.println(d / 10);
            System.out.println(e / 100);
            System.out.println((c + d + e));
        }
    }
}