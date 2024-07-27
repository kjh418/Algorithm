import java.util.*;

class Solution {
    public int solution(int[] nums) {
    	// 뽑을 수 있는 폰켓몬 수는 N/2
        int answer = nums.length/2;
        
        // 중복된 수는 제외하기 위해 사용(온전히 뽑을 폰켓몬 번호)
        Set<Integer> set = new HashSet<>();
        
        // 뽑을 수 있는 폰켓몬 수에 맞춰 폰켓몬 번호 세팅
        for(int num : nums){
            set.add(num);
        }
        
        // 뽑을 수 있는 폰켓몬 수와 비교하여 작은 값 반환
        // 최대한으로 뽑을 수 있는 폰켓몬 수가 answer기 때문에 그 값을 넘어가지 않게 하기 위함.
        return set.size() > answer ? answer : set.size();
    }
}