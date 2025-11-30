package J05015;

import java.util.*;

class VDV {
    private String ma;
    private String ten;
    private String donvi;
    private double vantoc;

    public VDV(String ma, String ten, String donvi, double vantoc) {
        this.ma = ma;
        this.ten = ten;
        this.donvi = donvi;
        this.vantoc = vantoc;
    }

    public double getVantoc() {
        return vantoc;
    }

    public void xuat() {
        System.out.printf("%s %s %s %d Km/h\n", ma, ten, donvi, Math.round(vantoc));
    }
}

public class J05015_DuaXeDap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<VDV> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String donvi = sc.nextLine();
            String thoigian = sc.nextLine();

            String[] parts = thoigian.split(":");
            int gio = Integer.parseInt(parts[0]);
            int phut = Integer.parseInt(parts[1]);
            double tg = (gio - 6) + phut / 60.0; // thời gian tính bằng giờ

            double vantoc = 120.0 / tg;

            StringBuilder ma = new StringBuilder();
            for (String w : donvi.split(" ")) {
                ma.append(Character.toUpperCase(w.charAt(0)));
            }
            for (String w : ten.split(" ")) {
                ma.append(Character.toUpperCase(w.charAt(0)));
            }

            ds.add(new VDV(ma.toString(), ten, donvi, vantoc));
        }

        ds.sort((a, b) -> Double.compare(b.getVantoc(), a.getVantoc()));

        for (VDV v : ds) {
            v.xuat();
        }
    }
}

