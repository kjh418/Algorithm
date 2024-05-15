import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 케이스의 개수
        int T = Integer.parseInt(br.readLine());
        // 공백을 기준으로 값 토큰에 넣기
        StringTokenizer st;

        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            // 케이스 반복 횟수
            int R = Integer.parseInt(st.nextToken());
            // 테스트 문자열
            char[] text = st.nextToken().toCharArray();

            for(int j=0; j<text.length; j++){
                // 문자만큼 반복
                for(int k=0; k<R; k++){
                    System.out.print(text[j]);
                }
            }
            System.out.println();
        }
    }
}