import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int [8];
        boolean isAscending = true;
        boolean isDescending = true;

        String n[] = br.readLine().split (" ");

        for (int i = 0; i < 8; i++){
            arr[i] = Integer.parseInt(n[i]);
        }

        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] < arr[i+1]){
                isDescending = false;
            }
            else if (arr[i] > arr[i+1]){
                isAscending = false;
            }
        }

        if (isAscending){
            System.out.println("ascending");
        }
        else if (isDescending){
            System.out.println("descending");
        }
        else{
            System.out.println("mixed");            
        }
    }
}