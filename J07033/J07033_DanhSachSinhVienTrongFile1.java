package J07033;

import java.util.*;
import java.io.*;

class sv implements Comparable<sv>{
    private String ma, ten, lop, email;
    public sv(String ma, String ten, String lop, String email){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.email=email;
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
        return this.ma.compareTo(a.ma);
    }
    public void kq(){
        System.out.printf("%s %s %s %s\n",ma,ten,lop,email);
    }
}

public class J07033_DanhSachSinhVienTrongFile1 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        List<sv> a=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String email=sc.nextLine();
            a.add(new sv(ma,ten,lop,email));
        }
        Collections.sort(a);
        for(sv x:a){
            x.chuanhoa();
            x.kq();
        }
    }
}