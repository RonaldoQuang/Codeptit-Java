package J07057;

import java.util.*;
import java.io.*;

class ThiSinh {
    private String ma, ten, tt;
    private double diem;

    public ThiSinh(String ma, String ten, double diem, String dt, int kv) {
        this.ma = ma;
        this.ten = ten;
        this.diem = diem;

        if (!dt.equalsIgnoreCase("Kinh")) {
            this.diem += 1.5;
        }

        if (kv == 1) {
            this.diem += 1.5;
        } else if (kv == 2) {
            this.diem += 1.0;
        }

        if (this.diem >= 20.5) {
            this.tt = "Do";
        } else {
            this.tt = "Truot";
        }
    }

    public void chuanhoa() {
        String[] parts = ten.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            sb.append(Character.toUpperCase(parts[i].charAt(0)))
                    .append(parts[i].substring(1));
            if (i < parts.length - 1) sb.append(" ");
        }
        this.ten = sb.toString();
    }

    public String getMa() {
        return ma;
    }

    public double getDiem() {
        return diem;
    }

    public void xuat() {
        System.out.printf("%s %s %.1f %s\n", ma, ten, diem, tt);
    }
}

public class J07057_DiemTuyenSinh {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> ds = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String ma = (i < 10 ? "TS0" : "TS") + i;
            String ten = sc.nextLine().trim();
            double diem = Double.parseDouble(sc.nextLine().trim());
            String dt = sc.nextLine().trim();
            int kv = Integer.parseInt(sc.nextLine().trim());

            ThiSinh ts = new ThiSinh(ma, ten, diem, dt, kv);
            ds.add(ts);
        }

        Collections.sort(ds, new Comparator<ThiSinh>() {
            public int compare(ThiSinh a, ThiSinh b) {
                if (a.getDiem() == b.getDiem()) {
                    return a.getMa().compareTo(b.getMa());
                }
                return Double.compare(b.getDiem(), a.getDiem());
            }
        });
        for (ThiSinh ts : ds) {
            ts.chuanhoa();
            ts.xuat();
        }
    }
}

