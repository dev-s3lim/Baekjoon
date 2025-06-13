import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] a = new int [n];
        int[] b = new int [m];
        int[] c = new int [a.length + b.length];

        String[] inputA = br.readLine().split(" ");
        String[] inputB = br.readLine().split(" ");
        for (int i = 0 ; i < a.length; i++){
            int dataA = Integer.parseInt(inputA[i]);
            a[i] = dataA;
            c[i] = a[i];
        }
        for (int i = 0 ; i < b.length; i++){
            int dataB = Integer.parseInt(inputB[i]);
            b[i] = dataB;
            c[a.length + i] = b[i];
        }

        Arrays.sort(c);

        StringBuilder sb = new StringBuilder();
        
        for (int s : c){
            sb.append(s).append(" ");
        }

        System.out.println(sb.toString().strip());
    }
}