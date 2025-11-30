package J04012;

import java.util.*;

class nv{
    private String ma="NV01", ten;
    private int luong, thuong, pc, tong;
    public nv(String ten, int luong, int thuong, int pc){
        this.ten=ten;
        this.luong=luong;
        this.thuong=thuong;
        this.pc=pc;
        this.tong=luong+thuong+pc;
    }
    public void kq(){
        System.out.print(this.ma+" "+this.ten+" "+this.luong+" ");
        System.out.print(this.thuong+" "+this.pc+" "+this.tong);
    }
}

public class J04012_BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ten=sc.nextLine();
        int cong=sc.nextInt();
        int ngay=sc.nextInt();
        int luong=cong*ngay;
        String cv=sc.next();
        int thuong=0;
        if(ngay>=25) thuong=luong*20/100;
        else if(ngay>=22&&ngay<25) thuong=luong*10/100;
        int pc;
        if(cv.equals("GD")) pc=250000;
        else if(cv.equals("PGD")) pc=200000;
        else if(cv.equals("TP")) pc=180000;
        else pc=150000;
        nv x=new nv(ten,luong,thuong,pc);
        x.kq();
    }
}
