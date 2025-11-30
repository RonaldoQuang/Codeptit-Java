package J05076;

import java.util.*;

class MatHang{
    private String ma, ten, loai;
    public MatHang(String ma, String ten, String loai){
        this.ma=ma;
        this.ten=ten;
        this.loai=loai;
    }
    public String getMa(){
        return this.ma;
    }
    public String getTen(){
        return this.ten;
    }
    public String getLoai(){
        return this.loai;
    }
}

class HoaDon{
    private MatHang mh;
    private long nhap, xuat;
    public HoaDon(MatHang mh, long vao, long gia, long ra){
        this.mh=mh;
        this.nhap=vao*gia;
        if(mh.getLoai().equals("A")) this.xuat=ra*gia/100*108;
        else if(mh.getLoai().equals("B")) this.xuat=ra*gia/100*105;
        else this.xuat=ra*gia/100*102;
    }
    public void kq(){
        System.out.printf("%s %s %d %d\n",mh.getMa(),mh.getTen(),nhap,xuat);
    }
}

public class J05076_NhapXuatHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<HoaDon> a=new ArrayList<>();
        Map<String,MatHang> mp=new HashMap<>();
        int n=sc.nextInt();
        while(n-->0){
            String ma=sc.next();
            sc.nextLine();
            String ten=sc.nextLine();
            String loai=sc.next();
            mp.put(ma,new MatHang(ma,ten,loai));
        }
        int m=sc.nextInt();
        while(m-->0){
            String ma=sc.next();
            long nhap=sc.nextLong();
            long gia=sc.nextLong();
            long xuat=sc.nextLong();
            a.add(new HoaDon(mp.get(ma),nhap,gia,xuat));
        }
        for(HoaDon x:a) x.kq();
    }
}
