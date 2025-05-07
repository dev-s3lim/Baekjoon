import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int sum = 0;

            for (int i = 0; i < n; i++){
                int c = s.charAt(i) - '0';
            
                sum = sum + c;
            }

            System.out.println (sum);
        }
    }
}
