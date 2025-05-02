import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            int i;
            String a = "int";
            String b = "long";
            
        if (n % 4 == 0){
            for (i = 0; i < (n/4); i++){
                System.out.print (b + " ");
                }
                System.out.print (a);
            }
        }
    }
}