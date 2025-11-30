package J05013;

import java.util.*;

class ThiSinh {
    private String ma;
    private String ten;
    private double diem;
    private String xeploai;

    public ThiSinh(String ma, String ten, double diem, String xeploai) {
        this.ma = ma;
        this.ten = ten;
        this.diem = diem;
        this.xeploai = xeploai;
    }

    public double getDiem() {
        return diem;
    }

    public void xuat() {
        System.out.printf("%s %s %.2f %s\n", ma, ten, diem, xeploai);
    }
}

public class J05013_TuyenDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ds = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String ten = sc.nextLine();
            double lt = Double.parseDouble(sc.nextLine());
            if (lt > 10) lt = lt / 10.0;
            double th = Double.parseDouble(sc.nextLine());
            if (th > 10) th = th / 10.0;

            double diem = (lt + th) / 2.0;
            String ma = (i < 10 ? "TS0" + i : "TS" + i);

            String xeploai;
            if (diem < 5) xeploai = "TRUOT";
            else if (diem < 8) xeploai = "CAN NHAC";
            else if (diem <= 9.5) xeploai = "DAT";
            else xeploai = "XUAT SAC";

            ds.add(new ThiSinh(ma, ten, diem, xeploai));
        }

        ds.sort((a, b) -> Double.compare(b.getDiem(), a.getDiem()));

        for (ThiSinh ts : ds) {
            ts.xuat();
        }
    }
}

