import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        // 큐 만들기
        Queue<int[]> queue = new LinkedList<>();
        
        // 중요도와 실제 순서 저장하기
        for(int i = 0; i < priorities.length; i++){
            // [문서의 중요도, 문서의 위치]
            queue.offer(new int[] {priorities[i], i});
        }
        
        // 출력 순서 추적
        int printOrder = 0;
        
        while(!queue.isEmpty()){
            // 문서 꺼내기
            int[] current = queue.poll();
            // 중요도가 더 높은지 확인하는 변수
            boolean hasHigherPriority = false;
            
            // 큐에 높은 중요도가 있는지 확인
            for(int[] doc : queue){
                if(doc[0] > current[0]){
                    hasHigherPriority = true;
                    break;
                }
            }
            
            // 더 높은 중요도가 있다면 현재 문서를 큐의 뒤로 이동
            if(hasHigherPriority){
                queue.offer(current);
            }else{
                printOrder++;
                // 찾고자 하는 문서라면
                if(current[1] == location){
                    // 출력 순서 반환
                     return printOrder;
                }
            } 
        }
        return -1;
    }
}