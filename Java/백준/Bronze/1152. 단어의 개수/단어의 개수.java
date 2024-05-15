import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //공백마다 잘라서 토큰에 넣어준다
        StringTokenizer st = new StringTokenizer(br.readLine());
        //토큰의 개수 확인
        System.out.println(st.countTokens());
    }
}