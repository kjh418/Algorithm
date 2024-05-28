import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 피보나치 수열을 담을 배열
        int p[] = new int[46];
        p[0] = 0;
        p[1] = 1;
        for(int i=2; i<=45; i++){
            // 2번째 부터 바로 앞 두 피보나치 수열의 합
            p[i] = p[i-1] + p[i-2];
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(p[n]);
    }
}