import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        // 문제를 다 푸는 데 얼마나 걸리는지 계산
        int dayKorean = A/C;
        int dayMath = B/D;

        // 만약에 남은 페이지가 있다면 +1일을 해야 함
        if(A%C !=0){
            dayKorean++;
        }
        if(B%D !=0){
            dayMath++;
        }

        System.out.print(L - Math.max(dayKorean, dayMath));
    }
}