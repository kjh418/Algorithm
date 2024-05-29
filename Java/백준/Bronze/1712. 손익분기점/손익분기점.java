import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 21억 이하의 자연수이기 때문에 long
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        if(B >= C){
            System.out.println(-1);
        }else{
            int count = 1;
            /*
            * 손익분기
            * A/(C-B)+1
            *
            * 1) C-B = 하나를 팔았을 때의 이득
            * 2) A/(C-B) = 고정 지출비로 나눔
            * 3) A/(C-B) + 1 = 손익분기를 넘길 수 있도록 +1
            * */
            System.out.println(A/(C-B)+1);
        }
    }
}
