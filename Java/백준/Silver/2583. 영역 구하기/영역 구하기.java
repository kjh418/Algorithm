import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    // 맵의 크기와 직사각형 개수를 저장할 변수
    static int M, N, K;
    // 맵을 나타낼 2차원 배열
    static int[][] map;
    // 상하좌우로 이동하기 위한 델타 배열
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    // DFS를 사용하여 영역의 크기를 계산하는 메소드
    static int dfs(int x, int y) {
        // 시작점에서부터 영역의 크기를 계산
        int areaSize = 1;
        // 현재 위치를 방문한 것으로 표시 (1)
        map[y][x] = 1;

        // 상하좌우로 이동하며 연결된 모든 부분 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 맵의 범위를 벗어나지 않고, 아직 방문하지 않은 영역이라면
            if (nx >= 0 && nx < N && ny >= 0 && ny < M && map[ny][nx] == 0) {
                areaSize += dfs(nx, ny);  // 재귀적으로 DFS를 호출하여 연결된 영역의 크기를 더해줌
            }
        }
        return areaSize;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // M, N, K 값을 입력받음
        M = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt();

        // 맵 초기화
        map = new int[M][N];

        // 직사각형 정보 입력받기
        for (int i = 0; i < K; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            // 직사각형의 좌표에 해당하는 부분을 1로 채워줌 (색칠됨을 의미)
            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    map[y][x] = 1;
                }
            }
        }

        // 각 영역의 크기를 저장할 리스트
        ArrayList<Integer> areaSizes = new ArrayList<>();

        // 맵의 모든 위치를 탐색하며 영역 찾기
        for (int y = 0; y < M; y++) {
            for (int x = 0; x < N; x++) {
                // 아직 방문하지 않은 영역(0)을 발견하면 DFS를 시작
                if (map[y][x] == 0) {
                    int areaSize = dfs(x, y);
                    areaSizes.add(areaSize);
                }
            }
        }

        // 영역의 크기를 오름차순으로 정렬
        Collections.sort(areaSizes);

        // 결과 출력
        System.out.println(areaSizes.size());  // 영역의 개수 출력
        for (int size : areaSizes) {
            System.out.print(size + " ");  // 각 영역의 크기를 출력
        }
    }
}
