package J05050;

import java.util.*;

class kh{
    private String ma;
    private long so, tien, phu, tong;
    public kh(String ma, long so, long cu, long moi){
        this.ma=ma;
        this.so=so;
        this.tien=(moi-cu)*so*550;
        if(moi-cu>=50&&moi-cu<=100) this.phu=Math.round(this.tien/100.0*35);
        else if(moi-cu>100) this.phu=this.tien;
        else this.phu=0;
        this.tong=this.tien+this.phu;
    }
    public void kq(){
        System.out.printf("%s %d %d %d %d\n",ma,so,tien,phu,tong);
    }
}

public class J05050_TinhTienDien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<kh> a=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            String ma="";
            if(i<10) ma+="KH0"+i;
            else ma+="KH"+i;
            String s=sc.next();
            long so;
            if(s.equals("KD")) so=3;
            else if(s.equals("NN")) so=5;
            else if(s.equals("TT")) so=4;
            else so=2;
            long cu=sc.nextLong(), moi=sc.nextLong();
            a.add(new kh(ma,so,cu,moi));
        }
        for(kh x:a) x.kq();
    }
}