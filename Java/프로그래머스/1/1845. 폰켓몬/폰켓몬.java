import java.util.*;

/*
    4마리라면 2마리를 가지고 갈 수 있다. 
    그러나 폰켓몬의 종류는 3종류,
    그렇게 되면 n/2값을 반환해야 한다. 
    
    6마리라면 3마리를 가지고 갈 수 있다.
    폰켓몬 종류가 2종류라면,
    종류를 반환해주면 된다.
*/

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        
        // 중복된 수는 제외하기 위해 사용
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
        }
        
        return set.size() > answer ? answer : set.size();
    }
}