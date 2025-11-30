package J07027;

import java.util.*;
import java.io.*;

class part{
    private String ma, ten, sdt;
    public part(String ma, String ten, String sdt){
        this.ma=ma;
        this.ten=ten;
        this.sdt=sdt;
    }
    public String getMa(){
        return ma;
    }
    public String getTen(){
        return ten;
    }
    public String getSdt() {
        return sdt;
    }
}

class sv implements Comparable<sv>{
    private part x;
    private String bt;
    private int nhom;
    public sv(part x, String bt, int nhom){
        this.x=x;
        this.bt=bt;
        this.nhom=nhom;
    }
    @Override
    public int compareTo(sv a){
        return this.x.getMa().compareTo(a.x.getMa());
    }
    public void kq(){
        System.out.printf("%s %s %s %d %s\n",x.getMa(),x.getTen(),x.getSdt(),nhom,bt);
    }
}

public class J07027_QuanLyBaiTapNhom {
    public static void main(String[] args) throws Exception{
        Map<String, part> mp=new HashMap<>();
        Map<Integer,String> mp1=new HashMap<>();
        List<sv> a=new ArrayList<>();
        int k;
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        int t=sc.nextInt();
        k=t;
        sc.nextLine();
        while(t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String sdt=sc.nextLine();
            mp.put(ma,new part(ma,ten,sdt));
        }
        Scanner sc1=new Scanner(new File("BAITAP.in"));
        int n=sc1.nextInt();
        sc1.nextLine();
        for(int i=1;i<=n;i++){
            String bt=sc1.nextLine();
            mp1.put(i,bt);
        }
        Scanner sc2=new Scanner(new File("NHOM.in"));
        while(k-->0){
            String ma=sc2.next();
            int nhom=sc2.nextInt();
            a.add(new sv(mp.get(ma),mp1.get(nhom),nhom));
        }
        Collections.sort(a);
        for(sv x:a){
            x.kq();
        }
    }
}
