import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

        // 등급에 해당하는 점수를 저장하는 map
        HashMap<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        double totalScore = 0.0; // (학점 × 점수)의 합
        double totalCredit = 0.0; // 학점의 총합 (P 제외)

        for (int i = 0; i < 20; i++) {
            String subject = sc.next();     // 과목명 (사용 안함)
            double credit = sc.nextDouble(); // 학점
            String grade = sc.next();       // 등급

            if (grade.equals("P")) {
                continue; // P는 계산 제외
            }

            double score = gradeMap.get(grade); // 등급을 점수로 변환
            totalScore += credit * score;       // (학점 × 점수)
            totalCredit += credit;              // 학점 합계
        }

        sc.close();

        // 전공 평점 계산 및 출력
        double majorGPA = totalScore / totalCredit;
        System.out.printf("%.6f\n", majorGPA);
        
        }

    }
}