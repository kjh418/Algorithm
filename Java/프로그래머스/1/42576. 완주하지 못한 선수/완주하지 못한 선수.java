import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        // 참가한 사람 명단을 player에 저장한 후
        for (String player : participant) 
            // 이미 해시맵에 값이 있다면 1을 증가시킨다.
            map.put(player, map.getOrDefault(player, 0) + 1);
        // 완주한 사람 명단을 player에 저장한 후
        for (String player : completion) 
            // 이름이 해시맵에 있다면 -1을 해준다.
            map.put(player, map.get(player) - 1);

        // 해시맵에 남아 있는 값이 완주하지 못한 명단
        for(String key : map.keySet()){
        	if(map.get(key) != 0){
            	answer = key;
                break;
            }
        }
        return answer;
    }
}