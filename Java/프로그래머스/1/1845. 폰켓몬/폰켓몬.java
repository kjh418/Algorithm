import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
        	// map에 폰켓몬 번호와 번호의 개수를 저장한다.
            // num에 이미 번호가 존재하면 개수에 +1을 해주고 없으면 기본값 0을 세팅한다.
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 서로 다른 포켓몬 종류의 수
        int diffPokemonCount = map.size();

        // diffPokemonCount와 answer 중 더 작은 값 반환.
        // 선택할 수 있는 폰켓몬 수를 최대화 하기 위함.
        return Math.min(diffPokemonCount, answer);
    }
}