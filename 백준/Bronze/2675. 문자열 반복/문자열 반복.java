import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < t; i++) {
                int r = sc.nextInt();
                String s = sc.next();

                String result = "";
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    for (int k = 0; k < r; k++) {
                        result += c;
                    }
                }

                System.out.println(result);
            }
        }
    }
}