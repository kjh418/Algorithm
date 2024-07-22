class Solution {
    public int[] solution(long n) {
        // 숫자 -> 문자로 변환
        String str = String.valueOf(n);
        
        // 문자열 뒤집기
        String reverseStr = new StringBuilder(str).reverse().toString();
        
        // 문자 -> 숫자 변환 후 배열 저장
        int[] answer = new int[reverseStr.length()];
        
        for(int i=0; i<reverseStr.length(); i++){
            answer[i] = Character.getNumericValue(reverseStr.charAt(i));
        }
        return answer;
    }
}