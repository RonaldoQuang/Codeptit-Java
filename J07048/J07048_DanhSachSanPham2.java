package J07048;

import java.util.*;
import java.io.*;

class sp implements Comparable<sp>{
    private String ma, ten;
    private long gia, bh;
    public sp(String ma, String ten, long gia, long bh){
        this.ma=ma;
        this.ten=ten;
        this.gia=gia;
        this.bh=bh;
    }
    @Override
    public int compareTo(sp a){
        if(this.gia!=a.gia) return Long.compare(a.gia,this.gia);
        return this.ma.compareTo(a.ma);
    }
    public String toString(){
        return ma+" "+ten+" "+gia+" "+bh;
    }
}

public class J07048_DanhSachSanPham2 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("SANPHAM.in"));
        List<sp> a=new ArrayList<>();
        int n=sc.nextInt();
        while(n-->0){
            sc.nextLine();
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            long gia=sc.nextLong();
            long bh=sc.nextLong();
            a.add(new sp(ma,ten,gia,bh));
        }
        Collections.sort(a);
        for(sp x:a) System.out.println(x);
    }
}
