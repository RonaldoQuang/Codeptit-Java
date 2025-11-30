package J07081;

import java.util.*;
import java.io.*;

class sv implements Comparable<sv>{
    private String ma, full, ho, dem, ten, sdt, mail;
    public sv(String ma, String s, String sdt, String mail){
        this.ma=ma;
        this.full=s;
        String[] a=s.split(" ");
        this.ten=a[a.length-1];
        this.ho=a[0];
        if(a.length>2){
            StringBuilder sb=new StringBuilder();
            for(int i=1;i<a.length-1;i++){
                sb.append(a[i]).append(" ");
            }
            this.dem=sb.toString().trim();
        }
        else{
            this.dem="";
        }
        this.sdt=sdt;
        this.mail=mail;
    }
    @Override
    public int compareTo(sv a){
        if(!this.ten.equals(a.ten)) return this.ten.compareTo(a.ten);
        if(!this.ho.equals(a.ho)) return this.ho.compareTo(a.ho);
        if(!this.dem.equals(a.dem)) return this.dem.compareTo(a.dem);
        return this.ma.compareTo(a.ma);
    }
    public void kq(){
        System.out.printf("%s %s %s %s\n",ma,full,sdt,mail);
    }
}

public class J07081_SapXepDanhSachSinhVien {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        List<sv> a=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String sdt=sc.nextLine();
            String mail=sc.nextLine();
            a.add(new sv(ma,ten,sdt,mail));
        }
        Collections.sort(a);
        for(sv x:a) x.kq();
    }
}
