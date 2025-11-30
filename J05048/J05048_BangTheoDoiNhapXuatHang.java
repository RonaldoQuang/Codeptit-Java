package J05048;

import java.util.*;

class mh{
    private String ma;
    private long nhap, xuat, gia, tien, thue;
    public mh(String ma, long nhap){
        this.ma=ma;
        this.nhap=nhap;
        if(ma.charAt(0)=='A') this.xuat=Math.round(nhap*0.6);
        else this.xuat=Math.round(nhap*0.7);
        if(ma.charAt(ma.length()-1)=='Y') this.gia=110000;
        else this.gia=135000;
        this.tien=this.xuat*this.gia;
        if(ma.charAt(0)=='A'&&ma.charAt(ma.length()-1)=='Y') this.thue=this.tien*8/100;
        else if(ma.charAt(0)=='A'&&ma.charAt(ma.length()-1)=='N') this.thue=this.tien*11/100;
        else if(ma.charAt(0)=='B'&&ma.charAt(ma.length()-1)=='Y') this.thue=this.tien*17/100;
        else this.thue=this.tien*22/100;
    }
    public void kq(){
        System.out.printf("%s %d %d %d %d %d\n",ma,nhap,xuat,gia,tien,thue);
    }
}

public class J05048_BangTheoDoiNhapXuatHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<mh> a=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String ma=sc.next();
            long sl=sc.nextLong();
            a.add(new mh(ma,sl));
        }
        for(mh x:a) x.kq();
    }
}