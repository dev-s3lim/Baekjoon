import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        try (Scanner sc = new Scanner (System.in)) {
            int t = sc.nextInt(); 
            int i;

            for (i = 0; i < t; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();

                System.out.println (a+b);
            }
        }
    }
}