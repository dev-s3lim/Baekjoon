import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int[] a = new int [n];

        String[] input = br.readLine().split(" ");
        for (int i = 0 ; i < a.length; i++){
            int num = Integer.parseInt(input[i]);

            a[i] = num;
        }

        Arrays.sort(a);

        System.out.println(a[k-1]);
    }
}