package J07035;

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

class sv{
    private String ma, ten, lop;
    public sv(String ma, String ten, String lop){
        this.ma=ma;
        this.ten=chuanhoa(ten);
        this.lop=lop;
    }
    public String chuanhoa(String w){
        String[] a=w.trim().split("\\s+");
        String s="";
        for(int i=0;i<a.length;i++){
            a[i]=Character.toUpperCase(a[i].charAt(0))+a[i].substring(1,a[i].length()).toLowerCase();
        }
        for(int i=0;i<a.length;i++){
            if(i<a.length-1) s+=a[i]+" ";
            else s+=a[i];
        }
        return s;
    }
    public String getTen() {
        return ten;
    }
    public String getMa() {
        return ma;
    }
    public String getLop() {
        return lop;
    }
}

class BangDiem implements Comparable<BangDiem>{
    private sv x;
    private String mon;
    private double diem;
    public BangDiem(sv x, String mon, double diem){
        this.x=x;
        this.mon=mon;
        this.diem=diem;
    }
    public String getMon() {
        return mon;
    }
    @Override
    public int compareTo(BangDiem a){
        if(this.diem!=a.diem) return Double.compare(a.diem,this.diem);
        return this.x.getMa().compareTo(a.x.getMa());
    }
    DecimalFormat df = new DecimalFormat("0.##");
    public void kq(){
        System.out.printf("%s %s %s ",x.getMa(),x.getTen(),x.getLop());
        System.out.println(df.format(diem));
    }
}

public class J07035_BangDiemTheoMonHoc {
    public static void main(String[] args) throws Exception{
        Map<String, sv> mp=new HashMap<>();
        Map<String,String> mp1=new HashMap<>();
        List<BangDiem> a=new ArrayList<>();
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            mp.put(ma,new sv(ma,ten,lop));
        }
        Scanner sc1=new Scanner(new File("MONHOC.in"));
        int t=sc1.nextInt();
        while(t-->0){
            String ma=sc1.next();
            sc1.nextLine();
            String mon=sc1.nextLine();
            int tin=sc1.nextInt();
            mp1.put(ma,mon);
        }
        Scanner sc2=new Scanner(new File("BANGDIEM.in"));
        int m=sc2.nextInt();
        while(m-->0){
            String msv=sc2.next();
            String ma=sc2.next();
            double diem=sc2.nextDouble();
            a.add(new BangDiem(mp.get(msv),ma,diem));
        }
        Collections.sort(a);
        int q=sc2.nextInt();
        while(q-->0){
            String mau=sc2.next();
            System.out.println("BANG DIEM MON "+mp1.get(mau)+":");
            for(BangDiem x:a){
                if(x.getMon().equals(mau)) x.kq();
            }
        }
    }
}
