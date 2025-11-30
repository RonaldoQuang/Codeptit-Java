package J08025;

import java.util.*;

class HinhChuNhat {
    int a, b, c, d, e, f;
    HinhChuNhat(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    boolean equals(HinhChuNhat other) {
        return this.a == other.a && this.b == other.b && this.c == other.c
                && this.d == other.d && this.e == other.e && this.f == other.f;
    }
}

public class J08025_QuayHinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            HinhChuNhat start = new HinhChuNhat(sc.nextInt(), sc.nextInt(), sc.nextInt(),
                    sc.nextInt(), sc.nextInt(), sc.nextInt());
            HinhChuNhat target = new HinhChuNhat(sc.nextInt(), sc.nextInt(), sc.nextInt(),
                    sc.nextInt(), sc.nextInt(), sc.nextInt());
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(start, 0));
            while (!q.isEmpty()) {
                Pair p = q.poll();
                HinhChuNhat cur = p.hcn;
                if (cur.equals(target)) {
                    System.out.println(p.step);
                    break;
                }
                HinhChuNhat m = new HinhChuNhat(cur.d, cur.a, cur.c, cur.e, cur.b, cur.f);
                q.add(new Pair(m, p.step + 1));
                HinhChuNhat n = new HinhChuNhat(cur.a, cur.e, cur.b, cur.d, cur.f, cur.c);
                q.add(new Pair(n, p.step + 1));
            }
        }
        sc.close();
    }
    static class Pair {
        HinhChuNhat hcn;
        int step;
        Pair(HinhChuNhat hcn, int step) {
            this.hcn = hcn;
            this.step = step;
        }
    }
}
