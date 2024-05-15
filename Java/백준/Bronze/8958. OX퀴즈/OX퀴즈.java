import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 케이스의 개수
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            char[] temp = br.readLine().toCharArray();
            int score = 0;
            int result = 0;

            for(int j=0; j<temp.length; j++){
                if(temp[j] == 'O'){
                    score++;
                    // O이 나올 때마다 score 값 누적
                    result += score;
                }else{
                    // 연속되지 않을 경우 score 값 리셋
                    score = 0;
                }
            }
            System.out.println(result);
        }
    }
}