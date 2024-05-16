import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 소수 개수
        int count = 0;
        for(int i=0; i<N; i++){
            int temp = sc.nextInt();
            // 소수 여부 확인
            boolean isTrue = true;
            if(temp == 1){
                isTrue = false;
            }else{
                // 소수 : 1보다 크고 약수가 자기 자신 외에는 없는 수
                for(int j=2; j<temp; j++){
                    if(temp%j==0){
                        isTrue = false;
                        break;
                    }
                }
            }
            if(isTrue){
                count++;
            }
        }
        System.out.println(count);
    }
}