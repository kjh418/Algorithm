import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {  
    // 방향 벡터 (상, 하, 좌, 우, 좌상, 우상, 좌하, 우하)를 정의
    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 빠르게 입력을 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫 번째 줄에서 R과 C를 입력받아 각각 행과 열의 개수로 사용
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());  // 행의 수 R을 입력받음
        int C = Integer.parseInt(st.nextToken());  // 열의 수 C를 입력받음
        int[][] map = new int[R][C];  // 목초지의 높이를 저장할 2차원 배열 생성

        // 목초지 지도 입력 받기
        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());  // 각 행을 입력받아 처리
            for (int j = 0; j < C; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());  // 각 칸의 고도를 map 배열에 저장
            }
        }

        int islandCount = 0;  // 발견된 나쁜 풀의 섬 개수를 저장하는 변수

        // 모든 칸을 탐색하면서 섬의 개수 세기
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                // 현재 칸이 나쁜 풀이고 아직 방문되지 않았으면 BFS를 수행
                if (map[i][j] > 0) {
                    bfs(map, i, j, R, C);  // BFS를 통해 연결된 모든 나쁜 풀을 방문 처리
                    islandCount++;  // 섬의 개수를 증가시킴
                }
            }
        }

        // 최종적으로 발견된 섬의 개수를 출력
        System.out.println(islandCount);
    }

    // BFS 탐색 함수 정의
    static void bfs(int[][] map, int x, int y, int R, int C) {
        // BFS에 사용할 큐를 생성하고 초기 위치를 큐에 삽입
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        map[x][y] = 0;  // 방문한 위치는 0으로 설정하여 방문 표시

        // 큐가 빌 때까지 BFS를 수행
        while (!queue.isEmpty()) {
            int[] point = queue.poll();  // 큐에서 현재 위치를 꺼냄
            int px = point[0];  // 현재 x 좌표
            int py = point[1];  // 현재 y 좌표

            // 8가지 방향으로 인접한 칸을 탐색
            for (int i = 0; i < 8; i++) {
                int nx = px + dx[i];  // 새로운 x 좌표
                int ny = py + dy[i];  // 새로운 y 좌표

                // 새로운 좌표가 유효 범위 내에 있으며, 아직 방문되지 않은 나쁜 풀이라면
                if (nx >= 0 && nx < R && ny >= 0 && ny < C && map[nx][ny] > 0) {
                    map[nx][ny] = 0;  // 새로운 위치를 0으로 설정하여 방문 표시
                    queue.add(new int[]{nx, ny});  // 큐에 새로운 위치를 추가
                }
            }
        }
    }
}
