package J05045;

import java.util.*;

class nv implements Comparable<nv>{
    private String ma, ten, cv;
    private long tien, ngay, pc, luong, ung, sot, tong;
    public nv(String ma, String ten, String cv, long tien, long ngay){
        this.ma=ma;
        this.ten=ten;
        if(cv.equals("GD")) this.pc=500;
        else if(cv.equals("PGD")) this.pc=400;
        else if(cv.equals("TP")) this.pc=300;
        else if(cv.equals("KT")) this.pc=250;
        else this.pc=100;
        this.luong=tien*ngay;
        double t=(this.pc+this.luong)*2.0/3.0;
        if(t<25000){
            this.ung=(long)Math.round(t/1000.0)*1000;
        }
        else this.ung=25000;
        this.sot=this.pc+this.luong-this.ung;
        this.tong=this.luong+this.pc;
    }
    @Override
    public int compareTo(nv a){
        if(this.tong!=a.tong) return Long.compare(a.tong,this.tong);
        return this.ma.compareTo(a.ma);
    }
    public void kq(){
        System.out.printf("%s %s %d %d %d %d\n",ma,ten,pc,luong,ung,sot);
    }
}

public class J05045_SapXepNhanVienTheoThuNhap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<nv> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String ma="";
            if(i<10) ma="NV0"+String.valueOf(i);
            else ma="NV"+String.valueOf(i);
            sc.nextLine();
            String ten=sc.nextLine();
            String cv=sc.nextLine();
            long tien=sc.nextInt(), ngay=sc.nextInt();
            a.add(new nv(ma,ten,cv,tien,ngay));
        }
        Collections.sort(a);
        for(nv x:a){
            x.kq();
        }
    }

}

