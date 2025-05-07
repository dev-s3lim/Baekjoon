import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();  // [중요]버퍼에 남아있는 '\n'을 처리하기 위해 nextLine() 호출

            for (int i = 0; i < n; i++) { //n번 만큼...
                String s = sc.nextLine(); // 단어 입력 받기
                int l = s.length(); // 단어의 길이

                char c1 = s.charAt(0);
                char c2 = s.charAt(l-1);

                System.out.println (c1 +""+ c2);
            }// for문 돌면서 첫 단어와 막 단어만 출력함
        }
    }
}