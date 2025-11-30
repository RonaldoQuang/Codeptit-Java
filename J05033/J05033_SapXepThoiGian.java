package J05033;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class tg implements Comparable<tg>{
    private int gio, phut, giay;
    public tg(int gio, int phut, int giay){
        this.gio=gio;
        this.phut=phut;
        this.giay=giay;
    }
    @Override
    public int compareTo(tg o) {
        if(this.gio!=o.gio) return this.gio-o.gio;
        if(this.phut!=o.phut) return this.phut-o.phut;
        return this.giay-o.giay;
    }
    public void kq(){
        System.out.println(this.gio+" "+this.phut+" "+this.giay);
    }
}

public class J05033_SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<tg> a=new ArrayList<>();
        int t=sc.nextInt();
        while(t-->0){
            int h=sc.nextInt();
            int m=sc.nextInt();
            int s=sc.nextInt();
            tg x=new tg(h,m,s);
            a.add(x);
        }
        Collections.sort(a);
        for(tg x:a){
            x.kq();
        }
    }
}
