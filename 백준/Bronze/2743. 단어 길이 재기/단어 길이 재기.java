import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine(); // 단어 입력 받기

            int l = s.length(); // 단어의 길이

            System.out.println (l); // 정수로 변환된 단어 길이 l 출력
        }
    }
}