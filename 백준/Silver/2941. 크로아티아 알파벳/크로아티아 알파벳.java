import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            String input = scanner.nextLine();
            scanner.close();

            // 크로아티아 알파벳 리스트
            String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

            // 크로아티아 알파벳들을 * 로 바꾸기 (한 글자로 보기 위해)
            for (String c : croatia) {
                input = input.replace(c, "*");  // ex: "c=" -> "*"
            }

            // 결과 출력 (치환한 문자열의 길이 = 글자 수)
            System.out.println(input.length());
            
        }
    }
}
