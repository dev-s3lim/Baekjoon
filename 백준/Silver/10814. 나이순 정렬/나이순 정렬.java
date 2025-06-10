import java.io.*;
import java.util.*;

class Members {
    int age;
    String name;

    public Members(int age, String name){
        this.age = age;
        this.name = name;
    }
}

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Members> member = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            member.add(new Members(age, name));
        }

        member.sort(Comparator.comparing(m -> m.age));

        for (Members m : member) {
            System.out.println(m.age + " " + m.name);
        }
    }
}