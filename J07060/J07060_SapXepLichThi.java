package J07060;

import java.util.*;
import java.io.*;

class cathi{
    private String ma, ngay, gio, phong;
    public cathi(String ma, String ngay, String gio, String phong){
        this.ma=ma;
        this.ngay=ngay;
        this.gio=gio;
        this.phong=phong;
    }
    public String getNgay() {
        return ngay;
    }
    public String getGio() {
        return gio;
    }
    public String getPhong() {
        return phong;
    }
}

class lichthi implements Comparable<lichthi> {
    private String ma, tg1, tg2, phong, mon, nhom, sv;
    private int ngay, thang, nam, gio, phut;
    public lichthi(String ma, String tg1, String tg2, String phong, String mon, String nhom, String sv) {
        this.ma = ma;
        this.tg1 = tg1;
        String[] a = tg1.split("/");
        this.ngay = Integer.parseInt(a[0]);
        this.thang = Integer.parseInt(a[1]);
        this.nam = Integer.parseInt(a[2]);
        this.tg2 = tg2;
        String[] b = tg2.split(":");
        this.gio = Integer.parseInt(b[0]);
        this.phut = Integer.parseInt(b[1]);
        this.phong = phong;
        this.mon = mon;
        this.nhom = nhom;
        this.sv = sv;
    }
    @Override
    public int compareTo(lichthi a){
        if(this.nam!=a.nam) return this.nam-a.nam;
        if(this.thang!=a.thang) return this.thang-a.thang;
        if(this.ngay!=a.ngay) return this.ngay-a.ngay;
        if(this.gio!=a.gio) return this.gio-a.gio;
        if(this.phut!=a.phut) return this.phut-a.phut;
        return this.ma.compareTo(a.ma);

    }
    public void kq(){
        System.out.printf("%s %s %s %s %s %s\n",tg1,tg2,phong,mon,nhom,sv);
    }
}

public class J07060_SapXepLichThi {
    public static void main(String[] args) throws Exception{
        Map<String,String> mp=new HashMap<>();
        Map<String,cathi> mp1=new HashMap<>();
        List<lichthi> a=new ArrayList<>();
        Scanner sc=new Scanner(new File("MONTHI.in"));
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String ht=sc.nextLine();
            mp.put(ma,ten);
        }
        Scanner sc1=new Scanner(new File("CATHI.in"));
        int n=sc1.nextInt();
        for(int i=1;i<=n;i++){
            String ma="C"+String.format("%03d",i);
            String tg1=sc1.next();
            String tg2=sc1.next();
            String phong=sc1.next();
            mp1.put(ma,new cathi(ma,tg1,tg2,phong));
        }
        Scanner sc2=new Scanner(new File("LICHTHI.in"));
        int m=sc2.nextInt();
        while(m-->0){
            String ma=sc2.next();
            String ma_mon=sc2.next();
            String nhom=sc2.next();
            String sv=sc2.next();
            a.add(new lichthi(ma,mp1.get(ma).getNgay(),mp1.get(ma).getGio(),mp1.get(ma).getPhong(),mp.get(ma_mon),nhom,sv));
        }
        Collections.sort(a);
        for(lichthi x:a){
            x.kq();
        }
    }
}