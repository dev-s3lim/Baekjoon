 import java.io.*;
 import java.util.*;

 public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> cards = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1 ; i < n+1; i++){
            cards.add(i);
        }

        while(cards.size() > 1){
            cards.poll();
            cards.addLast(cards.poll());
        }

        System.out.println(cards.peek());
    }
 }