package J04015;

import java.util.*;

class gv{
    private String ma, ten;
    private long bac, pc, luong;
    public gv(String ma, String ten, long bac, long pc, long luong){
        this.ma=ma;
        this.ten=ten;
        this.bac=bac;
        this.pc=pc;
        this.luong=luong;
    }
    public void kq(){
        System.out.print(this.ma+" "+this.ten+" "+this.bac+" "+this.pc+" "+this.luong);
    }
}

public class J04015_TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
        //while(t-->0){
        String ma=sc.nextLine();
        String ten=sc.nextLine();
        long x=sc.nextLong();
        long bac=Long.parseLong(ma.substring(2,4));
        long pc;
        if(ma.substring(0,2).equals("HT")) pc=2000000;
        else if(ma.substring(0,2).equals("HP")) pc=900000;
        else pc=500000;
        gv a=new gv(ma,ten,bac,pc,x*bac+pc);
        a.kq();
        //}
    }
}
