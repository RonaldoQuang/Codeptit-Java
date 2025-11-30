package J05020;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class sv implements Comparable<sv>{
    private String ma, ten, lop, email;
    public sv(String ma, String ten, String lop, String email){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.email=email;
    }
    @Override
    public int compareTo(sv a){
        if(!this.lop.equals(a.lop)) return this.lop.compareTo(a.lop);
        return this.ma.compareTo(a.ma);
    }
    public void kq(){
        System.out.printf("%s %s %s %s\n",ma,ten,lop,email);
    }
}

public class J05020_SapXepSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<sv> a=new ArrayList<>();
        sc.nextLine();
        while(n-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String email=sc.nextLine();
            a.add(new sv(ma,ten,lop,email));
        }
        Collections.sort(a);
        for(sv x:a) x.kq();
    }
}