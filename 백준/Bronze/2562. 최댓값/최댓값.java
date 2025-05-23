import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0; // 숫자를 입력받을 횟수 초기화
        int index = 1; // 몇번째인지 판별해줄 변수 (항상 첫번째부터 세기때문에 1로 초기화)
        int max = i; // 가장 처음부터 입력받는 숫자를 임시 변수인 max에 대입 후 다음 번 입력받는 수와 비교할 것이기 때문에 i로 초기화
        
        for (i = 0; i < 9; i++){ 
            String input = br.readLine(); // 숫자를 총 9번 입력 후...
            int n = Integer.parseInt(input); // 정수로 변환하고...

            if (n > max){ // 정수로 변환한 입력된 숫자가 max보다 크다면...
                max = n; // 그 숫자가 곧 max, 가장 큰 수이다.
                index = i + 1; // 0번째부터 for 문이 작동하므로 +1
            }

        }

        System.out.println(max);
        System.out.println(index);

    }
}