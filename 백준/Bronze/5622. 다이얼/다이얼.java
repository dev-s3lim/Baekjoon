import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int t= 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c >= 'A' && c <= 'C') t += 3;
                else if (c >= 'D' && c <= 'F') t += 4;
                else if (c >= 'G' && c <= 'I') t += 5;
                else if (c >= 'J' && c <= 'L') t += 6;
                else if (c >= 'M' && c <= 'O') t += 7;
                else if (c >= 'P' && c <= 'S') t += 8;
                else if (c >= 'T' && c <= 'V') t += 9;
                else if (c >= 'W' && c <= 'Z') t += 10;
            }

            System.out.println(t);
        }
    }
}