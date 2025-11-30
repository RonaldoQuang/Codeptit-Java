package J07056;

import java.util.*;
import java.io.*;

class KhachHang {
    private String ma, ten;
    private int trong, vuot, thue, tong;

    public KhachHang(String ma, String ten, int trong, int vuot, int thue, int tong) {
        this.ma = ma;
        this.ten = ten;
        this.trong = trong;
        this.vuot = vuot;
        this.thue = thue;
        this.tong = tong;
    }

    public void chuanHoa() {
        String[] parts = ten.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String p : parts) {
            sb.append(Character.toUpperCase(p.charAt(0)))
                    .append(p.substring(1))
                    .append(" ");
        }
        this.ten = sb.toString().trim();
    }

    public int getTong() {
        return tong;
    }

    public void in() {
        System.out.printf("%s %s %d %d %d %d\n", ma, ten, trong, vuot, thue, tong);
    }
}

public class J07056_TinhTienDien {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        Map<String, Integer> mp = new HashMap<>();
        mp.put("A", 100);
        mp.put("B", 500);
        mp.put("C", 200);

        int n = Integer.parseInt(sc.nextLine().trim());
        List<KhachHang> ds = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String ma = (i < 10 ? "KH0" : "KH") + i;
            String ten = sc.nextLine().trim();
            String[] line = sc.nextLine().trim().split("\\s+");

            String loai = line[0];
            int cu = Integer.parseInt(line[1]);
            int moi = Integer.parseInt(line[2]);

            int sodien = moi - cu;
            int dinhmuc = mp.get(loai);

            int trong = (sodien < dinhmuc) ? sodien * 450 : dinhmuc * 450;
            int vuot = (sodien > dinhmuc) ? (sodien - dinhmuc) * 1000 : 0;
            int thue = vuot / 20;
            int tong = trong + vuot + thue;

            KhachHang kh = new KhachHang(ma, ten, trong, vuot, thue, tong);
            ds.add(kh);
        }

        ds.sort((a, b) -> b.getTong() - a.getTong());

        for (KhachHang kh : ds) {
            kh.chuanHoa();
            kh.in();
        }
    }
}

