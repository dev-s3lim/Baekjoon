import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Students{
    String name;
    int koreanScore;
    int englishScore;
    int mathScore;

    public Students(String name, int koreanScore, int englishScore, int mathScore){
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }
}

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Students> students = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            String name = input[0];
            int koreanScore = Integer.parseInt(input[1]);
            int englishScore = Integer.parseInt(input[2]);
            int mathScore = Integer.parseInt(input[3]);
            students.add(new Students(name, koreanScore, englishScore, mathScore));
        }

        students.sort(Comparator.comparingInt((Students s) -> s.koreanScore).reversed()
            .thenComparingInt(s -> s.englishScore)
            .thenComparing((Students s) -> s.mathScore, Comparator.reverseOrder())
            .thenComparing(s -> s.name));
        
        for (Students s : students){
            System.out.println(s.name);
        }
    }
}