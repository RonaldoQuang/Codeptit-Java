package J07052;

import java.util.*;
import java.io.*;

class ts implements Comparable<ts>{
    private String ma, ten;
    private float tong, ut;
    public ts(String ma, String ten, float ut, float toan, float ly, float hoa){
        this.ma=ma;
        this.ten=ten;
        this.ut=ut;
        this.tong=toan*2+ly+hoa+ut;
    }
    public float getTong(){
        return this.tong;
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
    public int compareTo(ts a){
        if(this.tong!=a.tong) return Float.compare(a.tong,this.tong);
        return this.ma.compareTo(a.ma);
    }
    public void kq(){
        float x=this.ut, y=this.tong;
        if(x*10%10==0&&y*10%10==0) System.out.printf("%s %s %.0f %.0f ",ma,ten,ut,tong);
        else if(x*10%10==0&&y*10%10!=0) System.out.printf("%s %s %.0f %.1f ",ma,ten,ut,tong);
        else if(x*10%10!=0&&y*10%10==0) System.out.printf("%s %s %.1f %.0f ",ma,ten,ut,tong);
        else System.out.printf("%s %s %.1f %.1f ",ma,ten,ut,tong);
    }
}

public class J07052_DanhSachTrungTuyen {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("THISINH.in"));
        int n=sc.nextInt();
        List<ts> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String kv= sc.nextLine();
            String ten=sc.nextLine();
            float toan=sc.nextFloat(), ly=sc.nextFloat(), hoa=sc.nextFloat();
            float ut=0f;
            if(kv.substring(2,3).equals("1")) ut=0.5f;
            else if(kv.substring(2,3).equals("2")) ut=1f;
            else if(kv.substring(2,3).equals("3")) ut=2.5f;
            float tong=toan*2+ly+hoa+ut;
            ts x=new ts(kv,ten,ut,toan,ly,hoa);
            a.add(x);
        }
        int k=sc.nextInt();
        Collections.sort(a);
        float diem=a.get(0).getTong();
        int i=0;
        if(k<=a.size()) diem=a.get(k-1).getTong();
        else diem=a.get(a.size()-1).getTong();
        System.out.printf("%.1f\n",diem);
        for(ts x:a){
            x.chuanhoa();
            if(x.getTong()>=diem){
                x.kq();
                System.out.print("TRUNG TUYEN\n");
            }
            else{
                x.kq();
                System.out.print("TRUOT\n");
            }
        }
    }
}

