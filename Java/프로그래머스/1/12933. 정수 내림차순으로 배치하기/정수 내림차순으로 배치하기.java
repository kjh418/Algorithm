import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        // long을 문자열로 변환
        String numStr = Long.toString(n);
        
        // 문자열을 문자 배열로 변환
        Character[] numChar = new Character[numStr.length()];
        for(int i = 0; i < numStr.length(); i++){
            numChar[i] = numStr.charAt(i);
        }
        // 정렬하기(내림차순 정렬)
        Arrays.sort(numChar, Collections.reverseOrder());
        
        // 문자 배열 문자열로 변환
        StringBuilder orderStr = new StringBuilder();
        for(char c : numChar){
            orderStr.append(c);
        }
        
        // 문자열을 숫자로 변환
        return Long.parseLong(orderStr.toString());
    }
}