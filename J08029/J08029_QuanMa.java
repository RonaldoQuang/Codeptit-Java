package J08029;

import java.util.*;

public class J08029_QuanMa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
            int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
            String s1 = sc.next();
            String s2 = sc.next();
            int startX = s1.charAt(0) - 'a' + 1;
            int startY = s1.charAt(1) - '0';
            int endX = s2.charAt(0) - 'a' + 1;
            int endY = s2.charAt(1) - '0';
            if (startX == endX && startY == endY) {
                System.out.println(0);
                continue;
            }
            Queue<int[]> q = new LinkedList<>();
            boolean[][] visited = new boolean[9][9];
            q.add(new int[]{startX, startY});
            visited[startX][startY] = true;
            int steps = 0;
            int cnt = 1;
            while (!q.isEmpty()) {
                int[] cur = q.poll();
                cnt--;
                int x = cur[0];
                int y = cur[1];
                if (x == endX && y == endY) {
                    System.out.println(steps);
                    break;
                }
                for (int i = 0; i < 8; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx >= 1 && nx <= 8 && ny >= 1 && ny <= 8 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny});
                    }
                }
                if (cnt == 0) {
                    steps++;
                    cnt = q.size();
                }
            }
        }
        sc.close();
    }
}
