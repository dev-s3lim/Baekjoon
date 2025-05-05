import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 바구니 개수
        int m = sc.nextInt(); // 공 넣는 횟수

        int[] basket = new int[n];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(); // 시작 바구니 번호
            int b = sc.nextInt(); // 끝 바구니 번호
            int c = sc.nextInt(); // 넣을 공 번호

            for (int index = a - 1; index <= b - 1; index++) {
                basket[index] = c;
            }
        }

        for (int ball : basket) {
            System.out.print(ball + " ");
        }

        sc.close();
    }
}