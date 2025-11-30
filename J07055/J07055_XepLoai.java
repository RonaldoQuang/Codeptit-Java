package J07055;

import java.util.*;
import java.io.*;

class sv implements Comparable<sv>{
    private String ma, ten, hl;
    private float diem;
    public sv(String ma, String ten, float d1, float d2, float d3){
        this.ma=ma;
        this.ten=ten;
        this.diem=d1*25/100+d2*35/100+d3*40/100;
        if(this.diem>=8) this.hl="GIOI";
        else if(this.diem>=6.5) this.hl="KHA";
        else if(this.diem>=5) this.hl="TRUNG BINH";
        else this.hl="KEM";
    }
    public void chuanhoa(){
        String[] a=this.ten.trim().split("\\s+");
        this.ten="";
        for(int i=0;i<a.length;i++){
            a[i]=Character.toUpperCase(a[i].charAt(0))+a[i].substring(1,a[i].length()).toLowerCase();
        }
        for(int i=0;i<a.length;i++){
            if(i<a.length-1) this.ten+=a[i]+" ";
            else this.ten+=a[i];
        }
    }
    @Override
    public int compareTo(sv a){
        return Float.compare(a.diem,this.diem);
    }
    public void kq(){
        System.out.printf("%s %s %.2f %s\n",ma,ten,diem,hl);
    }
}

public class J07055_XepLoai {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("BANGDIEM.in"));
        List<sv> a=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String ma="SV"+String.format("%02d",i);
            String ten=sc.nextLine();
            Float d1=sc.nextFloat(), d2=sc.nextFloat(), d3= sc.nextFloat();
            a.add(new sv(ma,ten,d1,d2,d3));
        }
        Collections.sort(a);
        for(sv x:a){
            x.chuanhoa();
            x.kq();
        }
    }
}
