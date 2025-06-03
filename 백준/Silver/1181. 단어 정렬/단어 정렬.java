import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> remover = new HashSet<>();

        for (int i = 0 ; i < n ; i++){
            remover.add(br.readLine());
        }

        List<String> words = new ArrayList<>(remover);

        Collections.sort(words, (a, b) -> {
            if (a.length() == b.length()){
                return a.compareTo(b);
            }
            else {
                return Integer.compare(a.length(), b.length());
            }
        });

        for (String word : words){
            System.out.println(word);
        }
    }
}