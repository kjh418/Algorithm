import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N장의 카드
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        // 입력 받은 수를 저장할 곳
        int[] A = new int[N];

        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 최대값 설정
        int Max = -1;

        // 3장의 카드 뽑기
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    int temp = A[i] + A[j] + A[k];
                    // M을 넘지 않으면서 M에 최대한 가까운 카드
                    if(Max < temp && M >= temp){
                        Max = temp;
                    }
                }
            }
        }
        System.out.println(Max);
    }
}