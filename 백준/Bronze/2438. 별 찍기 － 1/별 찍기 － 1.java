import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner (System.in)){
            int n = sc.nextInt();
            int i;
            int j;

            for (i = 1; i <= n; i++){
                for (j = 1; j <= i; j++){
                    System.out.print ("*");
                }
                System.out.print ("\n");
            }
        }
    }
}