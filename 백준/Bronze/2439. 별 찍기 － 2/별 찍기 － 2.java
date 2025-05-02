import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner (System.in)){
            int n = sc.nextInt();
            int i;
            int j;

            for (i = n; i >= 1; i--){
                for (j = i-1; j >= 1; j--){
                    System.out.print (" ");
                }
                for (j = i; j <= n; j++){
                    System.out.print ("*");
                }
                System.out.print ("\n");
            }
        }
    }
}