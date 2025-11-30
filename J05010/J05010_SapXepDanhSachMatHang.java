package J05010;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class mh implements Comparable<mh>{
    private int ma;
    private String ten, dv;
    private float gm, gb, ln;
    public mh(int ma, String ten, String dv, float gm, float gb){
        this.ma=ma;
        this.ten=ten;
        this.dv=dv;
        this.gm=gm;
        this.gb=gb;
        this.ln=gb-gm;
    }
    @Override
    public int compareTo(mh a){
        return Float.compare(a.ln,this.ln);
    }
    public void kq(){
        System.out.printf("%d %s %s %.2f\n",ma,ten,dv,ln);
    }
}

public class J05010_SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<mh> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ten=sc.nextLine();
            String dv=sc.nextLine();
            float gm= sc.nextFloat(), gb=sc.nextFloat();
            mh x=new mh(i+1,ten,dv,gm,gb);
            a.add(x);
        }
        Collections.sort(a);
        for(mh i:a){
            i.kq();
        }
    }
}

