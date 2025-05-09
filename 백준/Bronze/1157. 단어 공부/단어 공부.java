import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 단어 입력받기
        String word = sc.nextLine();

        // 2. 모두 대문자로 바꾸기 (대소문자 구분 안하니까)
        word = word.toUpperCase();

        // 3. 알파벳 개수를 세기 위한 배열 (A~Z → 0~25)
        int[] count = new int[26];

        // 4. 입력받은 단어에서 글자 하나씩 꺼내서 개수 세기
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);        // 글자 하나 꺼내기
            count[ch - 'A']++;               // 해당 알파벳 위치에 1 더하기
        }

        // 5. 가장 많이 나온 알파벳 찾기
        int max = -1;         // 가장 많이 나온 횟수
        char result = '?';    // 결과 글자

        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];              // 더 큰 수 찾으면 교체
                result = (char)(i + 'A');    // 그 알파벳 저장
            } else if (count[i] == max) {
                result = '?';                // 가장 많은 알파벳이 2개 이상이면 ?
            }
        }

        // 6. 결과 출력
        System.out.println(result);
    }
}