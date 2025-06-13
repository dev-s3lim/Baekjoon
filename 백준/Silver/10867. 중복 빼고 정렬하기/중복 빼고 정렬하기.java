import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> mySet = new TreeSet<>();

        String[] input = br.readLine().split(" ");
        
        for (int i = 0; i < n; i++){
            mySet.add(Integer.parseInt(input[i]));
        }
        
        StringBuilder sb = new StringBuilder();
        for (int a : mySet){
            sb.append(a).append(" ");
        }

        System.out.println(sb.toString().strip());
    }
}