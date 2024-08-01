import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // 정수를 문자열으로 변경
        String str = Long.toString(n);
        
        // 문자열을 문자로 변경
        String[] arrStr = str.split("");
        
        // 내림차순 정렬
        Arrays.sort(arrStr, Collections.reverseOrder());
        
        // 문자열로 변경
        StringBuilder sb = new StringBuilder();
        for(String s : arrStr){
            sb.append(s);
        }
        
        // StringBuilder는 문자열처럼 보이지만 문자열이 아니라서 문자열로 바꿔줘야 한다.
        return Long.parseLong(sb.toString());
    }
}