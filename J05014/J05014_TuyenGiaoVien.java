package J05014;

import java.util.*;

class GiaoVien {
    private String ma;
    private String ten;
    private String mon;
    private double diem;
    private String ketqua;

    public GiaoVien(String ma, String ten, String mon, double diem, String ketqua) {
        this.ma = ma;
        this.ten = ten;
        this.mon = mon;
        this.diem = diem;
        this.ketqua = ketqua;
    }

    public double getDiem() {
        return diem;
    }

    public void xuat() {
        System.out.printf("%s %s %s %.1f %s\n", ma, ten, mon, diem, ketqua);
    }
}

public class J05014_TuyenGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> ds = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String maGV = (i < 10 ? "GV0" + i : "GV" + i);
            String ten = sc.nextLine();
            String sign = sc.nextLine();
            double tin = Double.parseDouble(sc.nextLine());
            double cm = Double.parseDouble(sc.nextLine());

            String mon = "";
            if (sign.charAt(0) == 'A') mon = "TOAN";
            else if (sign.charAt(0) == 'B') mon = "LY";
            else if (sign.charAt(0) == 'C') mon = "HOA";

            double diem = tin * 2 + cm;
            char uuTien = sign.charAt(1);
            if (uuTien == '1') diem += 2.0;
            else if (uuTien == '2') diem += 1.5;
            else if (uuTien == '3') diem += 1.0;
            String kq = (diem >= 18.0) ? "TRUNG TUYEN" : "LOAI";
            ds.add(new GiaoVien(maGV, ten, mon, diem, kq));
        }
        ds.sort((a, b) -> Double.compare(b.getDiem(), a.getDiem()));
        for (GiaoVien gv : ds) {
            gv.xuat();
        }
    }
}
