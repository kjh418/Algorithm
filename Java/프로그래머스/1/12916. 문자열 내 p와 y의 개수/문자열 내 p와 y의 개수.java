class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int pCnt = 0;
        int yCnt = 0;
        
        // 대문자 -> 소문자
        s = s.toLowerCase();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'y'){
                yCnt += 1;
            }else if(s.charAt(i) == 'p'){
                pCnt += 1;
            }
        }
        
        if(yCnt == pCnt){
            return answer;
        }else{
            return !answer;
        }
    }
}