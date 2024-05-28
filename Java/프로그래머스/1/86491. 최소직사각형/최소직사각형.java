import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        // 가로보다 세로 길이가 더 길다면 두 값을 바꿔야 함.
        int[] width = new int[sizes.length];
        int[] height = new int[sizes.length];
        
        for(int i=0; i<sizes.length; i++){
            // 가로보다 세로가 더 길다면 값 바꾸기
            if(sizes[i][0] <= sizes[i][1]){
                width[i] = sizes[i][1];
                height[i] = sizes[i][0];
            }else{
                width[i] = sizes[i][0];
                height[i] = sizes[i][1];
            }
        }
        
        // 가로와 세로 중 큰 값들을 구해 곱해야 함
        Arrays.sort(width);
        Arrays.sort(height);
        
        answer = width[width.length -1] * height[height.length -1];
        
        return answer;
    }
}