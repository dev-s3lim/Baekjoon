import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        String s = scanner.nextLine(); // 단어 입력 받기
        int i = scanner.nextInt();  // 단어 중 몇번째인지 (ex: hello) - 5개이므로 0 ~ 4

        char c = s.charAt(i-1); // 단어의 i번째 문자 가져오기 (배열처럼 0번째부터 시작함) (ex: i = 1이면 첫번째 알파벳 (문자열의 0번째인) h가 나와야함)

        System.out.print (c);
        }
    }
}

