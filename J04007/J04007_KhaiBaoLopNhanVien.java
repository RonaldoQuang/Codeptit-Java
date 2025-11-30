package J04007;

import java.util.*;

class nv{
    private String ma="00001", ten, gt, dob, dc, sdt, hd;
    public nv(String ten, String gt, String dob, String dc, String sdt, String hd){
        this.ten=ten;
        this.gt=gt;
        this.dob=dob;
        this.dc=dc;
        this.sdt=sdt;
        this.hd=hd;
    }
    public void kq(){
        System.out.printf("%s %s %s %s %s %s %s", ma, ten, gt, dob, dc, sdt, hd);
    }
}

public class J04007_KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
        //while(t-->0){
        String ten=sc.nextLine();
        String gt=sc.nextLine();
        String dob=sc.nextLine();
        String dc=sc.nextLine();
        String sdt=sc.nextLine();
        String hd=sc.nextLine();
        nv x=new nv(ten,gt,dob,dc,sdt,hd);
        x.kq();
        //}
    }
}
