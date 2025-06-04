import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //1234
        List<String> number = new ArrayList<>();
        char digit;

        String num = String.valueOf(n); //"1234"
        for (int i = 0 ; i < num.length() ; i++){
            digit = num.charAt(i); // "1", "2", "3", "4"
            number.add(String.valueOf(digit)); // 리스트 안에 입력
        }
        
        Collections.sort(number, (a, b) -> {
            return b.compareTo(a);
        });

        for (String nReverse : number){
            System.out.print(nReverse);
        }
    }
}