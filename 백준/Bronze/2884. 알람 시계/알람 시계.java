import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int c;
        int d;

        try (Scanner sc = new Scanner (System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if ((23 > a && a > 0) && (59 >= b && b >= 45)) {
                c = a;
                d = b - 45;
                System.out.println(c + " " + d);
            }
            else if ((23 > a && a > 0) && (45 > b && b >= 0)) {
                c = a - 1;
                d = b + 15;
                System.out.println(c + " " + d);
            }
            else if ((a == 0) && (59 >= b && b >= 45)) {
                c = a;
                d = b - 45;
                System.out.println(c + " " + d);
            }
            else if ((a == 0) && (45 > b && b >= 0)) {
                c = a + 23;
                d = b + 15;
                System.out.println(c + " " + d);
            }
            else if ((a == 23) && (59 >= b && b >= 45)) {
                c = a;
                d = b - 45;
                System.out.println(c + " " + d);
            }
            else if ((a == 23) && (45 > b && b >= 0)) {
                c = a - 1;
                d = b + 15;
                System.out.println(c + " " + d);
            }
        }
    }
}