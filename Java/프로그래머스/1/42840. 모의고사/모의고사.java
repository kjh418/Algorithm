import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int A[] = {1,2,3,4,5};
        int B[] = {2,1,2,3,2,4,2,5};
        int C[] = {3,3,1,1,2,2,4,4,5,5};
        
        // 학생들의 맞춘 개수를 저장할 곳
        int[] score = new int[3];
        
        for(int i=0; i<answers.length; i++){
            // 반복되는 패턴 개수가 다르므로
            if(answers[i] == A[i % A.length]){
                score[0]++;
            }
            if(answers[i] == B[i % B.length]){
                score[1]++;
            }
            if(answers[i] == C[i % C.length]){
                score[2]++;
            }
        }
        
        // 최대로 많이 맞춘 사람 구하기
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        // 높은 점수를 받은 학생들 리스트
        List<Integer> top = new ArrayList<>();
        for(int i=0; i<score.length; i++){
            if(score[i] == maxScore){
                // 학생 번호는 1번부터 시작하므로
                top.add(i+1);
            }
        }
        
        // 출력 형식이 int[]라 리스트를 배열로 변환함
        int[] answer = new int[top.size()];
        for(int i=0; i<top.size(); i++){
            answer[i] = top.get(i);
        }
        
        return answer;
    }
}