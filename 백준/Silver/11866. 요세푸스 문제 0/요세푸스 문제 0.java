import java.io.*; // 입력을 빠르게 받기 위한 라이브러리
import java.util.*; // Deque와 기타 유틸 클래스들을 사용하기 위한 라이브러리

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 양쪽에서 삽입/삭제 가능한 덱(Queue처럼 사용)
        Deque<Integer> myQueue = new LinkedList<>();

        // 첫 줄 입력: "n k" 형태로 들어옴
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); // 전체 인원 수
        int k = Integer.parseInt(input[1]); // k번째 사람 제거

        // 1부터 n까지 큐에 넣기 (초기 상태 설정)
        for (int i = 1; i <= n; i++){
            myQueue.add(i);
        }

        // 출력 결과를 저장할 StringBuilder. 시작은 "<"
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        // 큐가 빌 때까지 반복
        while (!myQueue.isEmpty()){
            // k번째를 제거하기 위해, 앞에서부터 k-1명을 뒤로 보냄
            for (int i = 0; i < k - 1; i++){
                myQueue.addLast(myQueue.pollFirst()); // 맨 앞을 빼서 맨 뒤로 보냄
            }

            // k번째 사람 제거 → 출력 결과에 추가
            sb.append(myQueue.pollFirst());

            // 아직 큐에 사람이 남아 있다면 쉼표 추가
            if (!myQueue.isEmpty()){
                sb.append(", ");
            }
        }

        // 출력 형식 마무리: ">" 닫기
        sb.append(">");

        // 최종 결과 출력
        System.out.println(sb);
    }
}