class Solution {
    public int[] solution(String[] wallpaper) {
        int top = Integer.MAX_VALUE; // 가장 위쪽 y좌표
        int bottom = Integer.MIN_VALUE; // 가장 아래쪽 y좌표
        int left = Integer.MAX_VALUE; // 가장 왼쪽 x좌표
        int right = Integer.MIN_VALUE; // 가장 오른쪽 x좌표
        
        // '#'위치 찾기
        for(int i= 0; i < wallpaper.length; i++){ // 행
            for(int j = 0; j < wallpaper[i].length(); j++){ // 열
                if(wallpaper[i].charAt(j) == '#'){
                    top = Math.min(top, i); // top과 i 값을 비교해서 더 작은 값을 top으로
                    bottom = Math.max(bottom, i); // bottom과 i값을 비교해서 더 큰 값을 bottom 값으로
                    left = Math.min(left, j);
                    right = Math.max(right, j);
                }
            }
        }
        // 네 값을 배열로 반환 : 직사각형의 경계
        return new int[] {top, left, bottom + 1, right + 1};
    }
}