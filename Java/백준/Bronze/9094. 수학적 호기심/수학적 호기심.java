import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner를 통해 입력을 받습니다.
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스 개수 입력
        int t = sc.nextInt();
        
        // 각 테스트 케이스에 대해 처리
        while (t-- > 0) {
            // n과 m 입력
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            // 조건을 만족하는 쌍의 개수를 세기 위한 변수
            int count = 0;
            
            // 1부터 n-1까지의 a, b 쌍을 모두 시도
            for (int a = 1; a < n; a++) {
                for (int b = a + 1; b < n; b++) {  // a < b로 설정하여 중복 제거
                    // (a^2 + b^2 + m)가 a*b로 나누어 떨어지는지 확인
                    if ((a * a + b * b + m) % (a * b) == 0) {
                        count++;
                    }
                }
            }
            
            // 결과 출력
            System.out.println(count);
        }
        
        sc.close();
    }
}
