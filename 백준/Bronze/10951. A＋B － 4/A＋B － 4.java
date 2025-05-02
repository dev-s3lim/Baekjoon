import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {  // 입력이 남아 있을 동안 계속
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}