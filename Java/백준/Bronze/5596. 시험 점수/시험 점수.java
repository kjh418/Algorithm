import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 민국이의 총점
        int S = 0;
        for(int i=0; i<4; i++){
            S += sc.nextInt();
        }

        // 만세의 총점
        int T = 0;
        for(int i=0; i<4; i++){
            T += sc.nextInt();
        }

        System.out.println(Math.max(S,T));
    }
}