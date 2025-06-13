
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int [n];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        int n2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int [n2];
        String[] input2 = br.readLine().split(" ");
        for (int i = 0; i < n2; i++){
            arr2[i] = Integer.parseInt(input2[i]);
        }

        Arrays.sort(arr);

        int[] answer = new int [arr.length];
        int index = 0;

        for (int i = 0; i < n2; i++) {
            index = Arrays.binarySearch(arr, arr2[i]);
            if (index >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}