class Solution {
    public int solution(String str) {
    	// 초기 부호 설정(양수)
        int sign = 1;
        // 결과값 초기화
        int result = 0;
        // 시작 인덱스 초기화
        int i =0;
        
        // 첫 문자가 '-'면 음수 표시로 설정하고, 시작 인덱스를 -1로 설정
        if(str.charAt(0) == '-'){
        	sign = -1;
            i++;
        }
        
        // 첫 문자가 '+'면 부호는 무시하고 시작 인덱스를 1로 설정
        else if(str.charAt(0) == '+'){
        	i++;
        }
        
        for(; i < str.length(); i++){
        	char c = str.charAt(i);
            result = result * 10 + (c - '0');
        }
        
        return result * sign;
    }
}