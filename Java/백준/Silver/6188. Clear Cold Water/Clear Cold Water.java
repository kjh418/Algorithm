import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 총 파이프의 수
        int c = sc.nextInt();  // 연결된 가지의 수

        // 각 파이프(노드)의 연결 정보를 저장할 그래프
        List<Integer>[] graph = new ArrayList[n + 1]; //List객체를 담을 수 있는 배열
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 입력된 파이프 연결 정보를 바탕으로 트리 구성
        for (int i = 0; i < c; i++) {
            int e = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            graph[e].add(b1);
            graph[e].add(b2);
            graph[b1].add(e);
            graph[b2].add(e);
        }

        // 거리 계산을 위한 배열
        int[] distance = new int[n + 1];
        Arrays.fill(distance, -1);  // 초기값으로 -1 설정
        distance[1] = 1;  // 농장에서 시작하는 파이프의 거리는 1

        // BFS를 사용하여 각 노드까지의 거리를 계산
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int currentDist = distance[current];

            for (int next : graph[current]) {
                if (distance[next] == -1) {  // 아직 방문하지 않은 경우
                    distance[next] = currentDist + 1;
                    queue.add(next);
                }
            }
        }

        // 결과 출력
        for (int i = 1; i <= n; i++) {
            System.out.println(distance[i]);
        }
    }
}