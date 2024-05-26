import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 정답을 출력할 배열
        int[] answer = new int[commands.length];
        
        for(int idx=0; idx<commands.length; idx++){
            // 2번째부터 5번째까지 자른다 ==> index[1] ~ index[4] == i-1부터 j전까지 추출
            // 2차원 배열 temp[y][x]
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];
            
            // 배열 자르기 (i-1부터 j까지)
            int[] slice = Arrays.copyOfRange(array, i-1, j);
            
            // 정렬하기
            Arrays.sort(slice);
            
            // j번째 숫자 출력
            answer[idx] = slice[k-1];
        }
        return answer;
    }
}