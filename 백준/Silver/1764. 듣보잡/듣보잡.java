import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nh = "";
        String ns = "";

        String[] input = br.readLine().split(" ");
        int cnt = 0;
        
        Map<String, Integer> neverHeard = new TreeMap<>();
        Map<String, Integer> neverSeen = new TreeMap<>();
        List<String> name = new ArrayList<>();
        
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for (int i = 0; i < n; i++){
            nh = br.readLine();
            neverHeard.put(nh, neverHeard.getOrDefault(nh, 0)+1);
        }
        for (int i = 0; i < m; i++){
            ns = br.readLine();
            neverSeen.put(ns, neverSeen.getOrDefault(ns, 0)+1);
        }

        for (String a : neverHeard.keySet()){
            if(neverSeen.containsKey(a)){
                cnt++;
                name.add(a);
            }
        }

        System.out.println(cnt);
        for (String names : name){
            System.out.println(names);
        }
    }
}