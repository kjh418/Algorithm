import java.util.Scanner;

public class Main { // 클래스 선언

    // 전역 변수 선언해서 DFS 탐색에 사용
    static int H, W;
    static char[][] grid; // 그리드 정보 저장할 2차원 배열
    static boolean[][] visited; // 각 셀의 방문 여부 확인할 배열

    // 상하좌우로 이동하기 위한 델타 배열 (행과 열의 이동을 나타냄)
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) { // main 메서드 시작
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수 입력

        // 테스트 케이스 하나씩 처리
        for (int t = 0; t < T; t++) {
            H = sc.nextInt(); // 그리드 높이 입력
            W = sc.nextInt(); // 그리드 너비 입력
            grid = new char[H][W]; // 그리드 초기화
            visited = new boolean[H][W]; // 방문 배열 초기화

            // 그리드 입력 받기
            for (int i = 0; i < H; i++) {
                String line = sc.next(); // 한 줄 입력받아서
                grid[i] = line.toCharArray(); // 문자 배열로 변환 후 그리드에 저장
            }

            int sheepGroups = 0; // 양 무리 수 카운트하는 변수

            // 모든 셀 탐색
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    // 셀이 양이고, 아직 방문하지 않았으면 새로운 무리 발견된 것
                    if (grid[i][j] == '#' && !visited[i][j]) {
                        dfs(i, j); // DFS로 해당 무리 모두 방문 처리
                        sheepGroups++; // 무리 수 증가
                    }
                }
            }

            // 각 테스트 케이스 결과 출력
            System.out.println(sheepGroups);
        }

        sc.close(); // 스캐너 종료
    } // main 메서드 종료

    // 깊이 우선 탐색(DFS) 사용해서 연결된 양들 모두 방문 처리
    static void dfs(int x, int y) { // dfs 메서드 시작
        visited[x][y] = true; // 현재 위치 방문 표시

        // 상하좌우 이웃 셀 확인
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 새로운 위치(nx, ny)가 그리드 내에 있고, 아직 방문하지 않았고, 양('#')이면 재귀적으로 DFS 호출
            if (nx >= 0 && ny >= 0 && nx < H && ny < W && !visited[nx][ny] && grid[nx][ny] == '#') {
                dfs(nx, ny); // 재귀적으로 방문
            }
        }
    } // dfs 메서드 종료
} // 클래스 종료
