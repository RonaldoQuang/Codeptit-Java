package J08026;

import java.util.*;

public class J08026_BienDoiS_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int s = sc.nextInt();
            int target = sc.nextInt();
            Queue<Pair> q = new LinkedList<>();
            Map<Integer, Boolean> visited = new HashMap<>();
            q.add(new Pair(s, 0));
            while (true) {
                Pair p = q.poll();
                if (p.value == target) {
                    System.out.println(p.step);
                    break;
                }
                if (p.value - 1 == target || p.value * 2 == target) {
                    System.out.println(p.step + 1);
                    break;
                }
                if (p.value * 2 <= target * 2 && !visited.containsKey(p.value * 2)) {
                    q.add(new Pair(p.value * 2, p.step + 1));
                    visited.put(p.value * 2, true);
                }
                if (p.value - 1 >= 0 && !visited.containsKey(p.value - 1)) {
                    q.add(new Pair(p.value - 1, p.step + 1));
                    visited.put(p.value - 1, true);
                }
            }
        }
        sc.close();
    }
    static class Pair {
        int value;
        int step;
        Pair(int value, int step) {
            this.value = value;
            this.step = step;
        }
    }
}
