import java.util.*;

class Solution {
    public String solution(String s) {
        // 문자열 문자 배열로 변경
        String[] str = s.split("");
        
        // 정렬
        Arrays.sort(str);
        
        // 문자열 조립을 위해 StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        
        // 문자 배열을 문자열로 변환
        for(String c : str){
            sb.append(c);
        }
        
        // 역순 정렬
        return sb.reverse().toString();
    }
}