import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 0;
        int arr [] = new int [n];
        
        for (i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr [i] = num;
        }

        Arrays.sort(arr);

        for (i = 0; i < n; i++) {
            System.out.println (arr[i]);
        }
    }
}