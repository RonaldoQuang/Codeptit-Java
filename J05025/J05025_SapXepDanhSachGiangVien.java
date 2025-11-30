package J05025;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class gv implements Comparable<gv>{
    private String ma, name, nganh, ten;
    public gv(String ma, String name, String nganh){
        this.ma=ma;
        this.name=name;
        this.nganh="";
        String[] a=nganh.split("\\s+");
        for(int i=0;i<a.length;i++){
            this.nganh+=Character.toUpperCase(a[i].charAt(0));
        }
        String[] b=name.split("\\s+");
        this.ten=b[b.length-1];
    }
    @Override
    public int compareTo(gv a){
        if(!this.ten.equals(a.ten)) return  this.ten.compareTo(a.ten);
        return this.ma.compareTo(a.ma);
    }
    public void kq(){
        System.out.printf("%s %s %s\n",ma,name,nganh);
    }
}

public class J05025_SapXepDanhSachGiangVien {
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
        Collections.sort(a);
        for(gv x:a) x.kq();
    }
}
