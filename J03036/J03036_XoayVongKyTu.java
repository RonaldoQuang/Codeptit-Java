package J03036;

import java.util.*;

public class J03036_XoayVongKyTu {
    static Set<String> se = new HashSet<>();
    static List<String> a = new ArrayList<>();
    static int min1 = Integer.MAX_VALUE;
    static boolean check() {
        for (String s : a) {
            if (!se.contains(s)) return false;
        }
        return true;
    }
    static int tinh(String s, String target) {
        int cnt = 0;
        String t = s;
        while (!t.equals(target)) {
            cnt++;
            t = t.substring(1) + t.charAt(0);
            if (cnt > s.length()) return Integer.MAX_VALUE; // tránh vòng lặp vô hạn
        }
        return cnt;
    }
    static void tim() {
        for (String j : se) {
            int sum = 0;
            for (String i : a) {
                int val = tinh(i, j);
                if (val == Integer.MAX_VALUE) {
                    sum = Integer.MAX_VALUE;
                    break;
                }
                sum += val;
            }
            min1 = Math.min(min1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            a.add(s);
        }
        String s = a.get(0);
        se.add(s);
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1) + s.charAt(0);
            se.add(s);
        }
        if (check()) {
            tim();
            if (min1 == Integer.MAX_VALUE) System.out.println(-1);
            else System.out.println(min1);
        } else {
            System.out.println(-1);
        }
    }
}

