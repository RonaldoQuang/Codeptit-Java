package J05018;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class hs implements Comparable<hs>{
    private String ma, ten, hl;
    private float toan, tv, nn, ly, hoa, sinh, su, dia, gdcd, cn, tong;
    public hs(String ma, String ten, float tong, String hl){
        this.ma=ma;
        this.ten=ten;
        this.tong=tong;
        this.hl=hl;
    }
    @Override
    public int compareTo(hs a){
        return Float.compare(a.tong,this.tong);
    }
    public void kq(){
        System.out.printf("%s %s %.1f %s\n",ma,ten,tong,hl);
    }
}

public class J05018_BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<hs> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String ma;
            if(i<10) ma="HS0"+String.valueOf(i);
            else ma="HS"+String.valueOf(i);
            String ten=sc.nextLine();
            float m1=sc.nextFloat();
            float m2=sc.nextFloat();
            float m3=sc.nextFloat();
            float m4=sc.nextFloat();
            float m5=sc.nextFloat();
            float m6=sc.nextFloat();
            float m7=sc.nextFloat();
            float m8=sc.nextFloat();
            float m9=sc.nextFloat();
            float m10=sc.nextFloat();
            float tong=(m1*2+m2*2+m3+m4+m5+m6+m7+m8+m9+m10)/12;
            tong=(float)Math.round(tong*10)/10;
            String hl;
            if(tong>=9) hl="XUAT SAC";
            else if(tong>=8&&tong<=8.9) hl="GIOI";
            else if(tong>=7&&tong<=7.9) hl="KHA";
            else if(tong>=5&&tong<=6.9) hl="TB";
            else hl="YEU";
            hs x=new hs(ma,ten,tong,hl);
            a.add(x);
        }
        Collections.sort(a);
        for(hs x:a){
            x.kq();
        }
    }
}