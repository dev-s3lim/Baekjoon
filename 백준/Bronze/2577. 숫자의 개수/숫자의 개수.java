import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr [] = new int [10];
        int value = 0;

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String m = String.valueOf(a*b*c);

        for (int i = 0; i < m.length();i++){
            char num = m.charAt(i);
            value = Character.getNumericValue(num);

            for (int j = 0; j < 10; j++){
                if (value == j){
                    arr[j]++;
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}