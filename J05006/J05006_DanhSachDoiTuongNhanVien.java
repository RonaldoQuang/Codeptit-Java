package J05006;

import java.util.*;

class nv{
    private String ma, ten, gt, dob, dc, sdt, hd;
    public nv(String ma, String ten, String gt, String dob, String dc, String sdt, String hd){
        this.ma=ma;
        this.ten=ten;
        this.gt=gt;
        this.dob=dob;
        this.dc=dc;
        this.sdt=sdt;
        this.hd=hd;
    }
    public void kq(){
        System.out.printf("%s %s %s %s %s %s %s", ma, ten, gt, dob, dc, sdt, hd);
        System.out.println();
    }
}

public class J05006_DanhSachDoiTuongNhanVien {
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
        for(nv x:a){
            x.kq();
        }
    }
}