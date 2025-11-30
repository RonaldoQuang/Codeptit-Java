package J05040;

import java.util.*;

class nv{
    private String ma, ten;
    private int luong, thuong, pc, tong;
    public nv(String ma, String ten, int luong, int thuong, int pc){
        this.ma=ma;
        this.ten=ten;
        this.luong=luong;
        this.thuong=thuong;
        this.pc=pc;
        this.tong=luong+thuong+pc;
    }
    public void kq(){
        System.out.printf("%s %s %d %d %d %d\n",ma,ten,luong,thuong,pc,tong);
    }
}

public class J05040_LapBangTinhCong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<nv> a=new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String ma="";
            if(i<10) ma="NV0"+String.valueOf(i);
            else ma="NV"+String.valueOf(i);
            String ten=sc.nextLine();
            int cong=sc.nextInt();
            int ngay=sc.nextInt();
            int luong=cong*ngay;
            sc.nextLine();
            String cv=sc.nextLine();
            int thuong=0;
            if(ngay>=25) thuong=luong*20/100;
            else if(ngay>=22&&ngay<25) thuong=luong*10/100;
            int pc;
            if(cv.equals("GD")) pc=250000;
            else if(cv.equals("PGD")) pc=200000;
            else if(cv.equals("TP")) pc=180000;
            else pc=150000;
            nv x=new nv(ma,ten,luong,thuong,pc);
            a.add(x);
        }
        for(nv x:a){
            x.kq();
        }
    }
}
