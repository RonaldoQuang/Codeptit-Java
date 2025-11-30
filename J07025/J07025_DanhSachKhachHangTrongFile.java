package J07025;

import java.util.*;
import java.io.*;

class nv implements Comparable<nv>{
    private String ma, ten, gt, dob, dc;
    private int d, m, y;
    public nv(String ma, String ten, String gt, String dob, String dc){
        this.ma=ma;
        this.ten=ten;
        this.gt=gt;
        this.dob=dob;
        this.dc=dc;
        String[] a=this.dob.split("/");
        String d=a[0];
        String m=a[1];
        String y=a[2];
        this.d=Integer.parseInt(d);
        this.m=Integer.parseInt(m);
        this.y=Integer.parseInt(y);
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
    public void chuanhoa2(){
        String[] a=this.dob.split("/");
        String d=a[0];
        String m=a[1];
        String y=a[2];
        if(d.length()==1) d="0"+d;
        if(m.length()==1) m="0"+m;
        this.dob=d+"/"+m+"/"+y;
    }
    @Override
    public int compareTo(nv a){
        if(this.y!=a.y) return this.y-a.y;
        if(this.m!=a.m) return this.m-a.m;
        return this.d-a.d;
    }
    public void kq(){
        System.out.printf("%s %s %s %s %s\n", ma, ten, gt, dc, dob);
    }
}

public class J07025_DanhSachKhachHangTrongFile {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("KHACHHANG.in"));
        int n=sc.nextInt();
        sc.nextLine();
        List<nv> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String ma="KH"+ String.format("%03d",i);
            String ten=sc.nextLine();
            String gt=sc.nextLine();
            String dob=sc.nextLine();
            String dc=sc.nextLine();
            nv x=new nv(ma,ten,gt,dob,dc);
            a.add(x);
        }
        Collections.sort(a);
        for(nv x:a){
            x.chuanhoa();
            x.chuanhoa2();
            x.kq();
        }
    }
}

