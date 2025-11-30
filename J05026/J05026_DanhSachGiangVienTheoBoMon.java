package J05026;

import java.util.*;
import java.util.ArrayList;

class gv{
    private String ma, name, nganh, ten;
    public gv(String ma, String name, String nganh){
        this.ma=ma;
        this.name=name;
        this.nganh="";
        this.ten=nganh;
        String[] a=nganh.split("\\s+");
        for(int i=0;i<a.length;i++){
            this.nganh+=Character.toUpperCase(a[i].charAt(0));
        }
    }
    public String getNganh(){
        return this.ten;
    }
    public void kq(){
        System.out.printf("%s %s %s\n",ma,name,nganh);
    }
}

public class J05026_DanhSachGiangVienTheoBoMon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<gv> a=new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String ma="";
            if(i<10) ma+="GV0"+String.valueOf(i);
            else ma+="GV"+String.valueOf(i);
            String ten=sc.nextLine();
            String nganh=sc.nextLine();
            a.add(new gv(ma,ten,nganh));
        }
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String mau=sc.nextLine();
            String[] p=mau.split("\\s+");
            String s="";
            for(int i=0;i<p.length;i++){
                s+=Character.toUpperCase(p[i].charAt(0));
            }
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:\n",s);
            for(gv x:a){
                if(x.getNganh().equals(mau)) x.kq();
            }
        }
    }
}

