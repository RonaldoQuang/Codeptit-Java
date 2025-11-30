package J05007;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class nv implements Comparable<nv>{
    private String ma, ten, gt, dob, dc, sdt, hd;
    private int d, m, y;
    public nv(String ma, String ten, String gt, String dob, String dc, String sdt, String hd){
        this.ma=ma;
        this.ten=ten;
        this.gt=gt;
        this.dob=dob;
        this.dc=dc;
        this.sdt=sdt;
        this.hd=hd;
        String[] a=this.dob.split("/");
        String d=a[0];
        String m=a[1];
        String y=a[2];
        this.d=Integer.parseInt(d);
        this.m=Integer.parseInt(m);
        this.y=Integer.parseInt(y);
    }
    @Override
    public int compareTo(nv a){
        if(this.y!=a.y) return this.y-a.y;
        if(this.m!=a.m) return this.m-a.m;
        return this.d-a.d;
    }
    public void kq(){
        System.out.printf("%s %s %s %s %s %s %s", ma, ten, gt, dob, dc, sdt, hd);
        System.out.println();
    }
}

public class J05007_SapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<nv> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String ma;
            if(i<10) ma="0000"+String.valueOf(i);
            else ma="000"+String.valueOf(i);
            String ten=sc.nextLine();
            String gt=sc.nextLine();
            String dob=sc.nextLine();
            String dc=sc.nextLine();
            String sdt=sc.nextLine();
            String hd=sc.nextLine();
            nv x=new nv(ma,ten,gt,dob,dc,sdt,hd);
            a.add(x);
        }
        Collections.sort(a);
        for(nv x:a){
            x.kq();
        }
    }
}

