package J07073;

import java.util.*;
import java.io.*;

class project implements Comparable<project>{
    private String ma, ten, tin, lt, th;
    public project(String ma, String ten, String tin, String lt, String th){
        this.ma=ma;
        this.ten=ten;
        this.tin=tin;
        this.lt=lt;
        this.th=th;
    }
    public String getTh() {
        return th;
    }

    @Override
    public int compareTo(project a){
        return this.ma.compareTo(a.ma);
    }
    public void kq(){
        System.out.printf("%s %s %s %s %s\n",ma,ten,tin,lt,th);
    }
}

public class J07073_DangKyHinhThucGiangDay {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("MONHOC.in"));
        List<project> a=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String tin=sc.nextLine();
            String lt=sc.nextLine();
            String th=sc.nextLine();
            a.add(new project(ma,ten,tin,lt,th));
        }
        Collections.sort(a);
        for(project x:a){
            if(x.getTh().equals("Truc tuyen")||x.getTh().contains(".ptit.edu.vn")) x.kq();
        }
    }
}
