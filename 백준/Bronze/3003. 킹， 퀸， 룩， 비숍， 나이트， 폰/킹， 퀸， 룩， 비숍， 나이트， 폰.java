import java.util.Scanner;

public class Main {
    public static void main (String[] args){
    int a[] = {1, 1, 2, 2, 2, 8};
    int b[] = new int[6];
    int c[] = new int[6];
       
    try (Scanner sc = new Scanner (System.in)){
        for (int i = 0; i < a.length; i++){
            b[i] = sc.nextInt();
            c[i] = a[i] - b[i];

            System.out.println (c[i]);
            
            }
        }
    }
}