import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Stack <Character> myStack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        boolean isTag = false;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '<') {
                while (!myStack.isEmpty()) {
                    sb.append(myStack.pop());
                }
                isTag = true;
                sb.append(c);
            }
            else if (c == '>') {
                isTag = false;
                sb.append(c);
            }
            else if (isTag) {
                sb.append(c);
            }
            else {
                if(c == ' ') {
                    while (!myStack.isEmpty()) {
                        sb.append(myStack.pop());
                    }
                    sb.append(c);
                }
                else myStack.push(c);
            }
        }

        while (!myStack.isEmpty()) {
            sb.append(myStack.pop());
        }

        System.out.println(sb);
    }
}
