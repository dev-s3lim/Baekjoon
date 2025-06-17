import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String parenthesis = br.readLine();
            Stack<Character> myStack = new Stack<>();

            boolean isVPS = true;

            for (int j = 0; j < parenthesis.length(); j++) {
                char c = parenthesis.charAt(j);

                if (c == '(') {
                    myStack.push(c);
                } else if (c == ')') {
                    if (myStack.isEmpty()) {
                        isVPS = false;
                        break;
                    } else {
                        myStack.pop();
                    }
                }
            }

            if (!myStack.isEmpty()) {
                isVPS = false;
            }

            sb.append(isVPS ? "YES" : "NO").append("\n");
        }

        System.out.println(sb);
    }   
}