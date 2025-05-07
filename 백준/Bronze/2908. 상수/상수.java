import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        try (Scanner sc = new Scanner (System.in)) {
            int a [] = new int [2];
            int r [] = new int [2];
            int i = 0;
            int max = 0;

            for (i = 0; i < 2; i++){
                a[i] = sc.nextInt();
                r[i] = 0;
                while (a[i] > 0) {
                    int digit = a[i] % 10;
                    r[i] = r[i] * 10 + digit;
                    a[i] = a[i] / 10;

                    if (r[i] > max){
                        max = r[i];
                    }
                }
            }

            System.out.println (max);
        }
    }
}