import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> cardsDeque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++){
            cardsDeque.add(i);
        }

        StringBuilder sb = new StringBuilder();

        while (cardsDeque.size() > 1) {
            sb.append(cardsDeque.remove()).append(" ");  // 제일 위 카드 버림
            cardsDeque.addLast(cardsDeque.remove());          // 다음 카드를 뒤로 보냄
        }
        sb.append(cardsDeque.poll());                    // *** 마지막 카드 출력

        System.out.println(sb);
    }
}