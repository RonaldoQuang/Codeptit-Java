package J05029;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class dn implements Comparable<dn>{
    private String ma, ten;
    private int sl;
    public dn(String ma, String ten, int sl){
        this.ma=ma;
        this.ten=ten;
        this.sl=sl;
    }
    public int getSl(){
        return this.sl;
    }
    @Override
    public int compareTo(dn a){
        if(this.sl!=a.sl) return a.sl-this.sl;
        return this.ma.compareTo(a.ma);
    }
    public void kq(){
        System.out.printf("%s %s %d\n",ma,ten,sl);
    }
}

public class J05029_DanhSachDoanhNghiepNhanSinhVienThucTap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<dn> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int sl=sc.nextInt();
            a.add(new dn(ma,ten,sl));
        }
        Collections.sort(a);
        int q=sc.nextInt();
        while(q-->0){
            int x=sc.nextInt(), y=sc.nextInt();
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n",x,y);
            for(dn i:a){
                if(i.getSl()<=y&&i.getSl()>=x) i.kq();
            }
        }
    }
}
