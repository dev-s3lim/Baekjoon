import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> myList = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            myList.add(br.readLine());
        }

        List<String> increasingList = new ArrayList<>(myList);
        List<String> decreasingList = new ArrayList<>(myList);

        Collections.sort(increasingList);
        Collections.sort(decreasingList, Collections.reverseOrder());

        if(myList.equals(increasingList)) {
            System.out.println("INCREASING");
        }
        else if (myList.equals(decreasingList)){
            System.out.println("DECREASING");
        }
        else System.out.println("NEITHER");
    }
}
