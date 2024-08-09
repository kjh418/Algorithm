import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 오름차순 정렬
        Arrays.sort(score);
        
        // 내림차순으로의 정렬을 위해 ~
        // 가장 작은 값의 위치(= score.length - m)
        // i -= m : m개 처리 후 인덱스 이동
        for(int i = score.length - m; i >= 0; i -= m){
            answer += score[i] * m;
        }
        return answer;
    }
}