import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        
        // 괄호 확인
        for(char b : s.toCharArray()){
            if( b == '('){
                // 여는 괄호로 시작한다면 추가
                stack.push(b);
            }else{
                if(stack.empty()){
                    return false;
                }
                // 여는 괄호가 아니라면 스택에서 제거
                stack.pop();
            }
        }
        
        // 스택이 모두 비었는지 확인
        return stack.isEmpty();
    }
}