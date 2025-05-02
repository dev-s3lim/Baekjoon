import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            int i;
            int j = 0;

            for (i = 1; i <= n; i++){
                j = j + i;
            }
            System.out.println (j);
        }
    }
}
