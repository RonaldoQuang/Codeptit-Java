package J05030;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class sv implements Comparable<sv>{
    private String msv, ten, lop;
    private float a, b, c;
    public sv(String msv, String ten, String lop, float a, float b, float c){
        this.msv=msv;
        this.ten=ten;
        this.lop=lop;
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public int compareTo(sv a){
        return this.msv.compareTo(a.msv);
    }
    public void kq(){
        System.out.printf("%s %s %s %.1f %.1f %.1f\n",msv,ten,lop,a,b,c);
    }
}

public class J05030_BangDiemThanhPhan1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<sv> v=new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String msv=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            float a=sc.nextFloat();
            float b=sc.nextFloat();
            float c=sc.nextFloat();
            v.add(new sv(msv,ten,lop,a,b,c));
        }
        Collections.sort(v);
        int cnt=1;
        for(sv x:v){
            System.out.print(cnt+" ");
            x.kq();
            ++cnt;
        }
    }
}
