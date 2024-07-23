public class Solution {
    public double solution(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        }
        
        double sum = 0.0;
        for (int num : arr) {
            sum += num;
        }
        
        return sum / arr.length;
    }
}