package J07059;

import java.util.*;
import java.io.*;

class CaThi implements Comparable<CaThi> {
    private String ma, ngay, tg, id;
    private int d, m, y, gio, phut;

    public CaThi(String ma, String ngay, String tg, String id) {
        this.ma = ma;
        this.ngay = ngay;
        this.tg = tg;
        this.id = id;

        String[] c = ngay.split("/");
        this.d = Integer.parseInt(c[0]);
        this.m = Integer.parseInt(c[1]);
        this.y = Integer.parseInt(c[2]);

        String[] b = tg.split(":");
        this.gio = Integer.parseInt(b[0]);
        this.phut = Integer.parseInt(b[1]);
    }

    @Override
    public int compareTo(CaThi other) {
        if (this.y != other.y) return this.y - other.y;
        if (this.m != other.m) return this.m - other.m;
        if (this.d != other.d) return this.d - other.d;
        if (this.gio != other.gio) return this.gio - other.gio;
        if (this.phut != other.phut) return this.phut - other.phut;
        return this.ma.compareTo(other.ma);
    }

    public void xuat() {
        System.out.println(ma + " " + ngay + " " + tg + " " + id);
    }
}

public class J07059_DanhSachCaThi {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        List<CaThi> ds = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String ma;
            if (i < 10) ma = "C00" + i;
            else if (i < 100) ma = "C0" + i;
            else ma = "C" + i;

            String ngay = sc.nextLine().trim();
            String tg = sc.nextLine().trim();
            String id = sc.nextLine().trim();

            ds.add(new CaThi(ma, ngay, tg, id));
        }

        Collections.sort(ds);

        for (CaThi c : ds) {
            c.xuat();
        }
    }
}


