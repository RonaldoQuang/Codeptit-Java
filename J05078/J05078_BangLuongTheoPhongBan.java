package J05078;

import java.util.*;

class NhanVien {
    private String ma;
    private String ten;
    private String phong;
    private long luong;
    public NhanVien(String ma, String ten, String phong, long luong) {
        this.ma = ma;
        this.ten = ten;
        this.phong = phong;
        this.luong = luong;
    }
    public String getMa(){
        return ma.substring(3,5);
    }
    public void inThongTin() {
        System.out.println(ma + " " + ten + " " + luong);
    }
}

public class J05078_BangLuongTheoPhongBan {
    public static int heSo(String s) {
        int y = Integer.parseInt(s.substring(1, 3));
        char loai = s.charAt(0);
        if (1 <= y && y <= 3) {
            if (loai == 'A') return 10;
            else if (loai == 'B') return 10;
            else if (loai == 'C') return 9;
            else return 8;
        } else if (4 <= y && y <= 8) {
            if (loai == 'A') return 12;
            else if (loai == 'B') return 11;
            else if (loai == 'C') return 10;
            else return 9;
        } else if (9 <= y && y <= 15) {
            if (loai == 'A') return 14;
            else if (loai == 'B') return 13;
            else if (loai == 'C') return 12;
            else return 11;
        } else {
            if (loai == 'A') return 20;
            else if (loai == 'B') return 16;
            else if (loai == 'C') return 14;
            else return 13;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        Map<String, String> mp = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ", 2);
            mp.put(parts[0], parts[1]);
        }
        int n = Integer.parseInt(sc.nextLine());
        List<NhanVien> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long luongCoBan = Long.parseLong(sc.nextLine());
            int ngayCong = Integer.parseInt(sc.nextLine());
            String phong = mp.get(ma.substring(3, 5));
            long luong = luongCoBan * ngayCong * heSo(ma) * 1000L;
            ds.add(new NhanVien(ma, ten, phong, luong));
        }
        String s=sc.next();
        System.out.println("Bang luong phong "+mp.get(s)+":");
        for (NhanVien nv : ds) {
            if(nv.getMa().equals(s)) nv.inThongTin();
        }
    }
}

