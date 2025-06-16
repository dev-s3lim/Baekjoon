import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        String maxKey = "";
        Map<String, Integer> salesMap = new TreeMap<>();

        for (int i = 0; i < n; i++){
            String books = br.readLine();
            salesMap.put(books, salesMap.getOrDefault(books, 0)+1);
        }
        
        for (String a : salesMap.keySet()){
            if(salesMap.get(a) > max){
                max = salesMap.get(a);
                maxKey = a;
            }
        }
        System.out.println(maxKey);
    }
}