import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); // 바구니 개수
            int m = sc.nextInt(); // 공 바꿀 횟수
            int balls [] = new int[n];

            // 공 n개 만큼 번호 지정해주기
            for (int i = 0; i < n; i++){
                balls[i] = i + 1; //ex : balls[0] = 1번 바구니의 1번 공, balls[1] = 2번 바구니의 2번 공
            }

            // m번 만큼 바꿔주기
            for (int i = 0; i < m; i++){
                int a = sc.nextInt(); // 바꿀 공의 번호
                int b = sc.nextInt(); // 바꿀 공의 번호

                // 바꿔주기
                int temp = balls[a - 1]; // a번 바구니의 공을 temp에 저장 ex: 1번 바구니의 공은 balls[0]에 있으므로 -1해줌
                balls[a - 1] = balls[b - 1]; // b번 바구니의 공을 a번 바구니에 넣기
                balls[b - 1] = temp; // temp에 저장된 a번 바구니의 공을 b번 바구니에 넣기
            }

            // 바구니에 들어있는 공의 번호 출력
            for (int i = 0; i < n; i++){
                System.out.print(balls[i] + " ");
            }
        }
    }
}