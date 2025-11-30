package J06006;

import java.util.*;

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
    public long getMua() {
        return mua;
    }
    public long getBan(){
        return ban;
    }
}

class HoaDon implements Comparable<HoaDon>{
    private KhachHang kh;
    private MatHang mh;
    private String ma;
    private long sl, tien, ln;
    public HoaDon(String ma, KhachHang kh, MatHang mh, long sl){
        this.ma=ma;
        this.kh=kh;
        this.mh=mh;
        this.sl=sl;
        this.tien=mh.getBan()*sl;
        this.ln=(mh.getBan()-mh.getMua())*sl;
    }
    @Override
    public int compareTo(HoaDon a){
        return Long.compare(a.ln,this.ln);
    }
    public void kq(){
        System.out.printf("%s %s %s %s %d %d %d\n",ma,kh.getTen(),kh.getDc(),mh.getTen(),sl,tien,ln);
    }
}

public class J06006_QuanLyBanHang2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<HoaDon> a=new ArrayList<>();
        Map<String, KhachHang> mp=new HashMap<>();
        Map<String, MatHang> mp1=new HashMap<>();
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
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            sc.nextLine();
            String ma="MH"+String.format("%03d",i);
            String ten=sc.nextLine();
            String dv=sc.nextLine();
            long mua=sc.nextLong();
            long ban=sc.nextLong();
            mp1.put(ma,new MatHang(ma,ten,dv,mua,ban));
        }
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            String ma="HD"+String.format("%03d",i);
            String mkh=sc.next();
            String mmh=sc.next();
            long sl=sc.nextLong();
            a.add(new HoaDon(ma,mp.get(mkh),mp1.get(mmh),sl));
        }
        Collections.sort(a);
        for(HoaDon x:a) x.kq();
    }
}

