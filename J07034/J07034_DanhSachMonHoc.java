package J07034;

import java.util.*;
import java.io.*;

class mh implements Comparable<mh>{
    private String ma, ten, tin;
    public mh(String ma, String ten, String tin){
        this.ma=ma;
        this.ten=ten;
        this.tin=tin;
    }
    @Override
    public int compareTo(mh a){
        return this.ten.compareTo(a.ten);
    }
    public void kq(){
        System.out.printf("%s %s %s\n",ma,ten,tin);
    }
}

public class J07034_DanhSachMonHoc {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int t=sc.nextInt();
        sc.nextLine();
        List<mh> a=new ArrayList<>();
        while(t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String tin=sc.nextLine();
            a.add(new mh(ma,ten,tin));
        }
        Collections.sort(a);
        for(mh x:a) x.kq();
    }
}
