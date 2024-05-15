import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // toCharArray()를 이용하여 String을 char로 변경
        char[] text = br.readLine().toCharArray();

        for(int i=0; i<26;i++){
            // 기본값 세팅 (매칭이 되지 않으면 -1을 출력하기 때문에 -1로 지정)
            int temp = -1;
            for(int j=0; j<text.length; j++){
                // 알파벳과 현재 text 자리 매칭
                if(text[j] - 'a' == i){
                    temp = j;
                    break;
                }
            }
            System.out.print(temp + " ");
        }
    }
}