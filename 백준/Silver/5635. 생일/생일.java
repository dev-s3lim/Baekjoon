import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List <Students> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String [] input = br.readLine().split(" ");
            String name = input[0];
            int day = Integer.parseInt(input[1]);
            int month = Integer.parseInt(input[2]);
            int year = Integer.parseInt(input[3]);

            Students s = new Students(name, day, month, year);
            list.add(s);

            list.sort((a, b) -> {
                if (a.year != b.year) {
                    return b.year - a.year;
                }
                if (a.month != b.month) {
                    return b.month - a.month;
                }
                return b.day - a.day;
            });
        }
        System.out.println(list.get(0).name);
        System.out.println(list.get(list.size()-1).name);
    }

    public static class Students{
        private String name;
        private int day;
        private int month;
        private int year;

        public Students (String name, int day, int month, int year){ //생성자
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
}