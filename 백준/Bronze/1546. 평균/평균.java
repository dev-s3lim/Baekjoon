import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int scores [] = new int[n];
            
            int maxScore = 0;
            
            for (int i = 0; i < n; i++) {
                scores[i] = sc.nextInt();
                if (scores[i] > maxScore) {
                    maxScore = scores[i];
                }
            }
            
            double sum = 0;
            
            for (int i = 0; i < n; i++) {
                sum += (double) scores[i] / maxScore * 100;
            }

            System.out.println(sum / n);
        }
    }
}