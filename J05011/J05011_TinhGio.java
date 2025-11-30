package J05011;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class kh implements Comparable<kh>{
    private String ma, ten, bd, kt;
    private int gio, phut;
    public kh(String ma, String ten, String bd, String kt){
        this.ma=ma;
        this.ten=ten;
        String[] start=bd.split(":");
        String[] end=kt.split(":");
        int tg=(Integer.parseInt(end[0])-Integer.parseInt(start[0]))*60+Integer.parseInt(end[1])-Integer.parseInt(start[1]);
        this.gio=tg/60;
        this.phut=tg%60;
    }
    @Override
    public int compareTo(kh a){
        if(this.gio!=a.gio) return a.gio-this.gio;
        return a.phut-this.phut;
    }
    public void kq(){
        System.out.printf("%s %s %d gio %d phut\n",ma,ten,gio,phut);
    }
}

public class J05011_TinhGio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<kh> a=new ArrayList<>();
        while(t-->0){
            String ma=sc.next();
            sc.nextLine();
            String ten=sc.nextLine();
            String bd=sc.next();
            String kt=sc.next();
            kh x=new kh(ma,ten,bd,kt);
            a.add(x);
        }
        Collections.sort(a);
        for(kh x:a){
            x.kq();
        }
    }
}
