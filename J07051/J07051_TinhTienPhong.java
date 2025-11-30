package J07051;

import java.io.File;
import java.util.*;
import java.text.*;

class KhachHang {
    String ma;
    String ten;
    String phong;
    int ngay;
    int tien;

    public KhachHang(String ma, String ten, String phong, int ngay, int tien) {
        this.ma = ma;
        this.ten = ten;
        this.phong = phong;
        this.ngay = ngay;
        this.tien = tien;
    }
    public void chuanhoa(){
        String[] a=this.ten.trim().split("\\s+");
        this.ten="";
        for(int i=0;i<a.length;i++){
            a[i]=Character.toUpperCase(a[i].charAt(0))+a[i].substring(1,a[i].length()).toLowerCase();
        }
        for(int i=0;i<a.length;i++){
            if(i<a.length-1) this.ten+=a[i]+" ";
            else this.ten+=a[i];
        }
    }
    public void kq() {
        System.out.println(ma + " " + ten + " " + phong + " " + ngay + " " + tien);
    }
}

public class J07051_TinhTienPhong {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));

        Map<Character, Integer> mp = new HashMap<>();
        mp.put('1', 25);
        mp.put('2', 34);
        mp.put('3', 50);
        mp.put('4', 80);

        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<KhachHang> ds = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String ma;
            if (i < 10) ma = "KH0" + i;
            else ma = "KH" + i;

            String ten = sc.nextLine().trim();
            String phong = sc.nextLine().trim();
            String bd = sc.nextLine().trim();
            String kt = sc.nextLine().trim();
            int dv = Integer.parseInt(sc.nextLine().trim());

            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date d1 = df.parse(bd);
            Date d2 = df.parse(kt);

            long diff = (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24) + 1;
            int ngay = (int) diff;

            int gia = mp.get(phong.charAt(0));
            int tien = ngay * gia + dv;

            ds.add(new KhachHang(ma, ten, phong, ngay, tien));
        }

        ds.sort((o1, o2) -> o2.tien - o1.tien);

        for (KhachHang k : ds) {
            k.chuanhoa();
            k.kq();
        }
    }
}

