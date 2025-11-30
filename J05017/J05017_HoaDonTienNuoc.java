package J05017;

import java.util.*;

class KhachHang {
    private String ma;
    private String ten;
    private int tien;

    public KhachHang(String ma, String ten, int tien) {
        this.ma = ma;
        this.ten = ten;
        this.tien = tien;
    }

    public int getTien() {
        return tien;
    }

    public void kq() {
        System.out.println(ma + " " + ten + " " + tien);
    }
}

public class J05017_HoaDonTienNuoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<KhachHang> a = new ArrayList<>();
        int T = Integer.parseInt(sc.nextLine());
        for (int t = 1; t <= T; t++) {
            String s = sc.nextLine().trim();
            int cu = Integer.parseInt(sc.nextLine().trim());
            int moi = Integer.parseInt(sc.nextLine().trim());
            int n = moi - cu;
            int tien;

            if (n <= 50) {
                tien = n * 102;
            } else if (n <= 100) {
                tien = (int) Math.round(n * 150 * 1.03 - 2575);
            } else {
                tien = n * 210 - 7875;
            }

            String ma;
            if (t < 10) {
                ma = "KH0" + t;
            } else {
                ma = "KH" + t;
            }

            KhachHang b = new KhachHang(ma, s, tien);
            a.add(b);
        }

        a.sort((x, y) -> Integer.compare(y.getTien(), x.getTien()));

        for (KhachHang kh : a) {
            kh.kq();
        }
    }
}

