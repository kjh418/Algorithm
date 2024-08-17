class Solution {
    public int[] solution(String[] park, String[] routes) {
        // 강아지의 현재 위치(row, col)
        int[] position = new int[2];
        
        // 시작 위치 찾기
        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                position[0] = i; // 행(row) 위치
                position[1] = park[i].indexOf("S"); // 열(col) 위치
                break;
            }
        }
        
        // 명령 처리
        for (String route : routes) {
            char direction = route.charAt(0);
            int distance = Character.getNumericValue(route.charAt(2));
            
            // 방향에 따른 이동
            int[] move = new int[2];
            switch (direction) {
                case 'N':
                    move[0] = -1;
                    break;
                case 'S':
                    move[0] = 1;
                    break;
                case 'W':
                    move[1] = -1;
                    break;
                case 'E':
                    move[1] = 1;
                    break;
            }
            
            // 이동할 위치를 임시로 계산하여 경로 유효성 확인
            boolean canMove = true;
            int newRow = position[0];
            int newCol = position[1];
            
            for (int i = 0; i < distance; i++) {
                newRow += move[0];
                newCol += move[1];
                
                // 경계를 벗어나거나 장애물 여부 확인
                if (newRow < 0 || newRow >= park.length || newCol < 0 || newCol >= park[0].length() || park[newRow].charAt(newCol) == 'X') {
                    canMove = false;
                    break;
                }
            }
            
            // 이동 가능하면 위치 업데이트
            if (canMove) {
                position[0] = newRow;
                position[1] = newCol;
            }
        }
        return position;
    }
}