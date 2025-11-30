package J07058;

import java.util.*;
import java.io.*;

class Mon implements Comparable<Mon> {
    private String ma, ten, ht;

    public Mon(String ma, String ten, String ht) {
        this.ma = ma;
        this.ten = ten;
        this.ht = ht;
    }

    public void xuat() {
        System.out.println(ma + " " + ten + " " + ht);
    }

    @Override
    public int compareTo(Mon other) {
        return this.ma.compareTo(other.ma);
    }
}

public class J07058_DanhSachMonThi {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        List<Mon> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String ht = sc.nextLine().trim();
            ds.add(new Mon(ma, ten, ht));
        }

        Collections.sort(ds);

        for (Mon m : ds) {
            m.xuat();
        }
    }
}
