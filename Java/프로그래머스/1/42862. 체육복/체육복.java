import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 학생들의 상태를 초기화한다. 
        int[] students = new int[n + 1];
        // 학생들이 기본적으로 체육복이 1개씩 있다고 가정한다
        Arrays.fill(students, 1);
        
        // 체육복을 잃어버린 학생들의 체육복 개수를 감소시킨다.
        for (int l : lost) students[l]--;
        
        // 여분의 체육복을 가진 학생들의 체육복 개수를 증가시킨다. 
        for (int r : reserve) students[r]++;
        
        // 체육복을 빌릴 수 있는지 확인
        for (int i = 1; i <= n; i++) {
            // 현재 학생이 체육복을 도난당한 상태라면
            if (students[i] == 0) {
                // 1) 앞 번호 학생이 여분의 체육복을 가지고 있는 상태라면
                if (i - 1 >= 1 && students[i - 1] == 2) {
                    // 앞 번호 학생의 체육복 개수를 줄인 후
                    students[i - 1]--;
                    // 현재 학생에게 체육복을 준다.
                    students[i]++;
                } else if (i + 1 <= n && students[i + 1] == 2) {
                    // 2) 뒷 번호 학생이 여분의 체육복을 가지고 있는 상태라면
                    // 뒷 번호 학생의 체육복 개수를 줄인 후
                    students[i + 1]--;
                    // 현재 학생에게 체육복을 준다.
                    students[i]++;
                }
            }
        }
        
        // 체육복을 가진 학생 수를 저장할 변수
        int count = 0;
        
        // 체육복이 있는 학생의 수 계산
        for (int i = 1; i <= n; i++) {
            if (students[i] > 0) count++;
        }
        return count;
    }
}