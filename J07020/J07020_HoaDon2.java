package J07020;

import java.util.*;
import java.io.*;

class KhachHang{
    private String ma, ten, gt, dob, dc;
    public KhachHang(String ma, String ten, String gt, String dob, String dc){
        this.ma=ma;
        this.ten=ten;
        this.gt=gt;
        this.dob=dob;
        this.dc=dc;
    }
    public String getTen() {
        return ten;
    }
    public String getDc() {
        return dc;
    }
}

class MatHang{
    private String ma, ten, dv;
    private long mua, ban;
    public MatHang(String ma, String ten, String dv, long mua, long ban){
        this.ma=ma;
        this.ten=ten;
        this.dv=dv;
        this.mua=mua;
        this.ban=ban;
    }
    public String getTen() {
        return ten;
    }
    public String getDv(){
        return dv;
    }

    public long getMua() {
        return mua;
    }
    public long getBan(){
        return ban;
    }
}

class HoaDon{
    private KhachHang kh;
    private MatHang mh;
    private String ma;
    private long sl, tien;
    public HoaDon(String ma, KhachHang kh, MatHang mh, long sl){
        this.ma=ma;
        this.kh=kh;
        this.mh=mh;
        this.sl=sl;
        this.tien=mh.getBan()*sl;
    }
    public void kq(){
        System.out.printf("%s %s %s %s %s %d %d %d %d\n",ma,kh.getTen(),kh.getDc(),mh.getTen(),mh.getDv(),mh.getMua(),mh.getBan(),sl,tien);
    }
}

public class J07020_HoaDon2 {
    public static void main(String[] args) throws Exception{
        List<HoaDon> a=new ArrayList<>();
        Map<String, KhachHang> mp=new HashMap<>();
        Map<String, MatHang> mp1=new HashMap<>();
        Scanner sc=new Scanner(new File("KH.in"));
        int n= sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String ma="KH"+String.format("%03d",i);
            String ten=sc.nextLine();
            String gt=sc.nextLine();
            String dob=sc.nextLine();
            String dc=sc.nextLine();
            mp.put(ma,new KhachHang(ma,ten,gt,dob,dc));
        }
        Scanner sc1=new Scanner(new File("MH.in"));
        int m=sc1.nextInt();
        for(int i=1;i<=m;i++){
            sc1.nextLine();
            String ma="MH"+String.format("%03d",i);
            String ten=sc1.nextLine();
            String dv=sc1.nextLine();
            long mua=sc1.nextLong();
            long ban=sc1.nextLong();
            mp1.put(ma,new MatHang(ma,ten,dv,mua,ban));
        }
        Scanner sc2=new Scanner(new File("HD.in"));
        int t=sc2.nextInt();
        for(int i=1;i<=t;i++){
            String ma="HD"+String.format("%03d",i);
            String mkh=sc2.next();
            String mmh=sc2.next();
            long sl=sc2.nextLong();
            a.add(new HoaDon(ma,mp.get(mkh),mp1.get(mmh),sl));
        }
        for(HoaDon x:a) x.kq();
    }
}

