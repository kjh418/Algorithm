import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 5개의 숫자를 담을 배열 선언
        int[] numbers = new int[5];
        
        // 배열에 숫자 입력
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // 자연수 1부터 시작해서 최소 3개 숫자로 나눌 수 있는 수 찾기
        int num = 1;
        while (true) {
            int count = 0;
            for (int i = 0; i < 5; i++) {
                if (num % numbers[i] == 0) {
                    count++;
                }
            }
            // 최소 3개로 나누어지는 경우
            if (count >= 3) {
                System.out.println(num);
                break;
            }
            num++;
        }
        
        scanner.close();
    }
}
