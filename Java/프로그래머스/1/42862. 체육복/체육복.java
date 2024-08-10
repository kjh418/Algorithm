class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n+2];
        int answer = 0;
        
        for(int l : lost){
            // 체육복을 빌려야 하는 학생은 - 값을 갖게 함
            student[l]--;
        }
        for(int r : reserve){
            // 체육복을 빌려줄 수 있는 학생은 + 값을 갖게 함.
            student[r]++;
        }
        
        for(int i = 1; i <= n; i++){
             // 체육복을 빌려줄 수 있는 학생일 경우
            if(student[i] == 1){
                // 앞에 있는 학생이 체육복이 필요하다면
                if(student[i-1] == -1){
                    // 빌려준다.
                    student[i]--;
                    // 빌려줬으므로 빌릴 필요가 없어짐
                    student[i-1]++;
                    // 뒤에 있는 학생이 체육복이 필요하다면
                }else if(student[i+1] == -1){
                    student[i]--;
                    student[i+1]++;
                }
            }
        }
        
        // 체육복을 가지고 있는 학생의 수를 구한다.
        for(int i = 1; i <= n; i++){
            if(student[i] >= 0){
                answer++;
            }
        }
        return answer;
    }
}