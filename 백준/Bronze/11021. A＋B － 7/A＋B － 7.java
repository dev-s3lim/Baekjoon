import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner (System.in)){
            int n = sc.nextInt();
            int i;

            for (i = 1; i <= n; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();

                System.out.println ("Case"+" "+"#"+i+":"+" "+(a+b));
            }
        }
    }
}