package J05027;

import java.util.*;
import java.util.ArrayList;

class gv{
    private String ma, name, nganh, ten;
    public gv(String ma, String name, String nganh){
        this.ma=ma;
        this.name=name;
        this.nganh="";
        String[] a=nganh.split("\\s+");
        for(int i=0;i<a.length;i++){
            this.nganh+=Character.toUpperCase(a[i].charAt(0));
        }
    }
    public String getTen(){
        return this.name;
    }
    public void kq(){
        System.out.printf("%s %s %s\n",ma,name,nganh);
    }
}

public class J05027_TimKiemGiangVien {
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
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:\n",mau);
            for(gv x:a){
                if(x.getTen().toLowerCase().contains(mau.toLowerCase())) x.kq();
            }
        }
    }
}

